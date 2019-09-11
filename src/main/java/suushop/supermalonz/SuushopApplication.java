package suushop.supermalonz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import suushop.supermalonz.Repository.ShoesRepository;
import suushop.supermalonz.execptions.ResourceNotFoundException;
import suushop.supermalonz.model.ShoesModel;
import suushop.supermalonz.structure.Shoes;
import suushop.supermalonz.structure.ListShoes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.validation.Valid;
import java.util.List;

@SpringBootApplication
@RestController
@EnableJpaAuditing

public class SuushopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SuushopApplication.class, args);
    }
    @Autowired
    private ShoesRepository shoesRepository;
    @RequestMapping("/")
    String Home(){
        return "<b>Welcome to Suu Shop</b>";
    }
    @GetMapping("/shoes")
    List<ShoesModel> allShoes(){

        return shoesRepository.findAll();
    }
    @RequestMapping(value = "/shoes/{id}", method = RequestMethod.GET)
    public Shoes shoes(@PathVariable int id){
        return ListShoes.getShoes(id);
    }

    @PostMapping("/shoes")
    public ShoesModel createBubbleTea(@Valid @RequestBody ShoesModel shoes) {
        return shoesRepository.save(shoes);
    }

    @PutMapping("/shoes/{id}")
    public ShoesModel updateShoes(@PathVariable("id") Integer id,
                                          @Valid @RequestBody ShoesModel shoes) {
        return shoesRepository.findById(id).map(shoesEntity -> {
            shoesEntity.setName(shoes.getName());
            shoesEntity.setPrice(shoes.getPrice());
            shoesEntity.setType(shoes.getType());
            return shoesRepository.save(shoesEntity);
        }).orElseThrow(() -> new ResourceNotFoundException("Not found"));
    }
    @DeleteMapping("/shoes/{id}")
    public ResponseEntity<?> deleteBubbleTea(@PathVariable("id") Integer id) {
        shoesRepository.deleteById(id);
        return ResponseEntity.accepted().build();
    }


}
