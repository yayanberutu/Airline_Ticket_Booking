package del.ac.id.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import del.ac.id.jpa.model.Login;

public interface LoginRepository extends JpaRepository<Login, String> {
	Login findByUsername(String username);
}
