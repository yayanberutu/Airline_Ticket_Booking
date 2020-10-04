package del.ac.id.jpa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_tiket")
public class Tiket {
	
	@Id
	@Column
	private int id_tiket;
	
	@Column
	private int id_pemesanan;
	
	@Column
	private Date created_at;
	private Date updated_at;
	
	@Column
	private int status;

	public Tiket(int id_tiket, int id_pemesanan, Date created_at, Date updated_at, int status) {
		super();
		this.id_tiket = id_tiket;
		this.id_pemesanan = id_pemesanan;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.status = status;
	}

	public int getId_tiket() {
		return id_tiket;
	}

	public void setId_tiket(int id_tiket) {
		this.id_tiket = id_tiket;
	}

	public int getId_pemesanan() {
		return id_pemesanan;
	}

	public void setId_pemesanan(int id_pemesanan) {
		this.id_pemesanan = id_pemesanan;
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
	

}
