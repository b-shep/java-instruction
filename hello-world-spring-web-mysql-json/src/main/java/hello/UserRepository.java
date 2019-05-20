package hello;

import org.springframework.data.repository.CrudRepository;
													//Entity, data type of primary key
public interface UserRepository extends CrudRepository<User, Integer> {
	
}
