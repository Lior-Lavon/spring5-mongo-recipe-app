package guru.springframework.repositories;

import guru.springframework.models.UnitOfMeasure;
import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, String> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
