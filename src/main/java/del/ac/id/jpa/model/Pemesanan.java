package del.ac.id.jpa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_pemesanan")
public class Pemesanan {
	@Id
	@Column
	private int id_pemesanan;
	
	@Column
	private int id_user;
	private int id_penerbangan;
	
	@Column(name="email_pemesan")
	private String email;
	
	@Column(name="nomor_telepon")
	private String telepon;
	
	@Column
	private int status;
	
	@Column
	private Date created_at;
	private Date updated_at;
	public Pemesanan(int id_pemesanan, int id_user, int id_penerbangan, String email, String telepon, int status,
			Date created_at, Date updated_at) {
		super();
		this.id_pemesanan = id_pemesanan;
		this.id_user = id_user;
		this.id_penerbangan = id_penerbangan;
		this.email = email;
		this.telepon = telepon;
		this.status = status;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}
	public int getId_pemesanan() {
		return id_pemesanan;
	}
	public void setId_pemesanan(int id_pemesanan) {
		this.id_pemesanan = id_pemesanan;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public int getId_penerbangan() {
		return id_penerbangan;
	}
	public void setId_penerbangan(int id_penerbangan) {
		this.id_penerbangan = id_penerbangan;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelepon() {
		return telepon;
	}
	public void setTelepon(String telepon) {
		this.telepon = telepon;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
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
