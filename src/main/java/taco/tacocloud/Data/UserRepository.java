package taco.tacocloud.Data;

import org.springframework.data.repository.CrudRepository;
import taco.tacocloud.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}