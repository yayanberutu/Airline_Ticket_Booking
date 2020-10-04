package del.ac.id.jpa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_pesawat")
public class Pesawat {
	@Id
	@Column
	private int id_pesawat;
	
	@Column
	private String nama_pesawat;
	
	@Column
	private String jenis_pesawat;
	
	@Column
	private int kapasitas_ekonomi;
	
	@Column
	private int kapasitas_bisnis;
	
	@Column
	private int created_by;
	
	@Column
	private int updated_by;
	
	@Column
	private Date created_at;
	
	@Column
	private Date updated_at;
	
	
	public Pesawat() {
		
	}
	public Pesawat(int id_pesawat, String nama_pesawat, String jenis_pesawat, int kapasitas_ekonomi,
			int kapasitas_bisnis, int created_by, int updated_by, Date created_at, Date updated_at) {
		super();
		this.id_pesawat = id_pesawat;
		this.nama_pesawat = nama_pesawat;
		this.jenis_pesawat = jenis_pesawat;
		this.kapasitas_ekonomi = kapasitas_ekonomi;
		this.kapasitas_bisnis = kapasitas_bisnis;
		this.created_by = created_by;
		this.updated_by = updated_by;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

	public int getId_pesawat() {
		return id_pesawat;
	}

	public void setId_pesawat(int id_pesawat) {
		this.id_pesawat = id_pesawat;
	}

	public String getNama_pesawat() {
		return nama_pesawat;
	}

	public void setNama_pesawat(String nama_pesawat) {
		this.nama_pesawat = nama_pesawat;
	}

	public String getJenis_pesawat() {
		return jenis_pesawat;
	}

	public void setJenis_pesawat(String jenis_pesawat) {
		this.jenis_pesawat = jenis_pesawat;
	}

	public int getKapasitas_ekonomi() {
		return kapasitas_ekonomi;
	}

	public void setKapasitas_ekonomi(int kapasitas_ekonomi) {
		this.kapasitas_ekonomi = kapasitas_ekonomi;
	}

	public int getKapasitas_bisnis() {
		return kapasitas_bisnis;
	}

	public void setKapasitas_bisnis(int kapasista_bisnis) {
		this.kapasitas_bisnis = kapasista_bisnis;
	}

	public int getCreated_by() {
		return created_by;
	}

	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}

	public int getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(int updated_by) {
		this.updated_by = updated_by;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	
	
	
	

}
