package del.ac.id.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import del.ac.id.jpa.model.Pemesanan;

public interface PemesananRepository extends JpaRepository<Pemesanan, Integer> {
	List<Pemesanan> findAll();
	List<Pemesanan> findByUsername(String username);
}
