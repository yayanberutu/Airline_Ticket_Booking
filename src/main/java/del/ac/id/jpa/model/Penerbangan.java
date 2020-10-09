package del.ac.id.jpa.model;


import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_penerbangan")
public class Penerbangan {
	
	@Id
	@Column
	private int id_penerbangan;
	
	@Column
	private int id_pesawat;
	
	@Column
	private String asal;
	
	@Column
	private String tujuan;
	
	@Column(name="tanggal_keberangkatan")
	private LocalDateTime tanggal;
	
	@Column
	private int tersedia_ekonomi;
	
	@Column
	private int tersedia_bisnis;


	@Column
	@DateTimeFormat(pattern = "yy-MM-dd'T'hh:mm")
	private Date waktu_berangkat;
	@Column

	private String created_by;
	private String updated_by;
	
	@Column
	private Date created_at;
	private Date updated_at;
	
	@Column
	private int status;
	
	
	public Penerbangan() {
		
	}




	public Penerbangan(int id_penerbangan, int id_pesawat, String asal, String tujuan, int tersedia_ekonomi,
					   int tersedia_bisnis, String created_by, String updated_by, Date created_at,
					   Date updated_at, int status, Date waktu_berangkat) {
		this.id_penerbangan = id_penerbangan;
		this.id_pesawat = id_pesawat;
		this.asal = asal;
		this.tujuan = tujuan;
		this.tersedia_ekonomi = tersedia_ekonomi;
		this.tersedia_bisnis = tersedia_bisnis;
		this.created_by = created_by;
		this.updated_by = updated_by;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.status = status;
		this.waktu_berangkat = waktu_berangkat;
	}
	public Date getWaktu_berangkat() {
		return waktu_berangkat;
	}


	public void setWaktu_berangkat(Date waktu_berangkat) {
		this.waktu_berangkat = waktu_berangkat;
	}
	public int getId_penerbangan() {
		return id_penerbangan;
	}


	public void setId_penerbangan(int id_penerbangan) {
		this.id_penerbangan = id_penerbangan;
	}


	public int getId_pesawat() {
		return id_pesawat;
	}


	public void setId_pesawat(int id_pesawat) {
		this.id_pesawat = id_pesawat;
	}


	public String getAsal() {
		return asal;
	}


	public void setAsal(String asal) {
		this.asal = asal;
	}


	public String getTujuan() {
		return tujuan;
	}


	public void setTujuan(String tujuan) {
		this.tujuan = tujuan;
	}


	public LocalDateTime getTanggal() {
		return tanggal;
	}


	public void setTanggal(LocalDateTime tanggal) {
		this.tanggal = tanggal;
	}


	public int getTersedia_ekonomi() {
		return tersedia_ekonomi;
	}


	public void setTersedia_ekonomi(int tersedia_ekonomi) {
		this.tersedia_ekonomi = tersedia_ekonomi;
	}


	public int getTersedia_bisnis() {
		return tersedia_bisnis;
	}


	public void setTersedia_bisnis(int tersedia_bisnis) {
		this.tersedia_bisnis = tersedia_bisnis;
	}


	public String getCreated_by() {
		return created_by;
	}


	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}


	public String getUpdated_by() {
		return updated_by;
	}


	public void setUpdated_by(String updated_by) {
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


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}

	

	
	

}
