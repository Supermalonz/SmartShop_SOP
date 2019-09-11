package suushop.supermalonz.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import suushop.supermalonz.model.ShoesModel;

@Repository
public interface ShoesRepository extends JpaRepository<ShoesModel, Integer> {
}
