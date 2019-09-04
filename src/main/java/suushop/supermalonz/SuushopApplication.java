package suushop.supermalonz;
import suushop.supermalonz.structure.Shoes;
import suushop.supermalonz.structure.ListShoes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController

public class SuushopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SuushopApplication.class, args);
    }
    @RequestMapping("/")
    String Home(){
        return "<b>Welcome to Suu Shop</b>";
    }
    @RequestMapping("/shoes")
    Shoes[] allShoes(){
        return ListShoes.getAllShoes();
    }
    @RequestMapping(value = "/shoes/{id}", method = RequestMethod.GET)
    public Shoes shoes(@PathVariable int id){
        return ListShoes.getShoes(id);
    }
}
