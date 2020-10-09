package del.ac.id.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_user")
public class User {
	@Id
	@Column(name="username")
	private String username;
		@Column(name="pwd")
		private String pwd;
		
		@Column(name="id_role")
		private int roleid;
		
		@Column(name="fullname")
		private String fullname;
		
		public User() {}

		
		public User(String username, String pwd, int roleid, String fullname) {
			this.username = username;
			this.pwd = pwd;
			this.roleid = roleid;
			this.fullname = fullname;

		}

		public String getFullname() {
			return fullname;
		}
		public void setFullname(String fullname) {
			this.fullname = fullname;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		
		public void setRoleid(int roleid) {
			this.roleid = roleid;
		}
		
		public String getUsername() {
			return this.username;
		}
		
		public String getPwd() {
			return this.pwd;
		}
		
		public int getRoleid() {
			return this.roleid;
		}
		
}
