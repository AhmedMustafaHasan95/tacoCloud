package taco.tacocloud.Data;

import org.springframework.data.repository.CrudRepository;
import taco.tacocloud.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
