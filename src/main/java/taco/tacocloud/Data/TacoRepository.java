package taco.tacocloud.Data;

import org.springframework.data.repository.CrudRepository;
import taco.tacocloud.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}
