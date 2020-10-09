package del.ac.id.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import del.ac.id.jpa.model.User;

public interface UserRepository extends JpaRepository<User, String> {
	User findByUsername(String username);
	List<User> findAll();
	
	

}
