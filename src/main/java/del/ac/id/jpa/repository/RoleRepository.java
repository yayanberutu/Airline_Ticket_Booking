package del.ac.id.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import del.ac.id.jpa.model.Role;


public interface RoleRepository extends JpaRepository<Role, Integer> {
	Role findByRoleid(int roleid);
	List<Role> findAll();
}
