package del.ac.id.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import del.ac.id.jpa.model.Penerbangan;

public interface PenerbanganRepository extends JpaRepository<Penerbangan, Integer> {
	
}
