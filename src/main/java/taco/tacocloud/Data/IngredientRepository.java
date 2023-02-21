package taco.tacocloud.Data;

import org.springframework.data.repository.CrudRepository;
import taco.tacocloud.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
