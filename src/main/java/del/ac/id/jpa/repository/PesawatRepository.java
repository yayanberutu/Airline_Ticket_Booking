package del.ac.id.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import del.ac.id.jpa.model.Pesawat;

public interface PesawatRepository extends JpaRepository<Pesawat, Integer> {
	List<Pesawat> findAll();

}
