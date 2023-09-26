package com.madlien.demo.entities;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import lombok.Data;
    @Entity
	@Data
	@Getter
    @Setter
	@Table(name="Meeting Room")
	public class Users{

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="User ID")
	private long id;
		
	    @Column(name="User Name")	
	 private String name;	
	  
	    @Column(name="Role")	
		private String role;	
		
	    @Column(name="Number")	
		private int num;	
		  
	    @Column(name="Department")	
		private String dep;
	    
public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}

		public String getDep() {
			return dep;
		}

		public void setDep(String dep) {
			this.dep = dep;
		}

		public List<Reservation> getReservation() {
			return reservation;
		}

		public void setReservation(List<Reservation> reservation) {
			this.reservation = reservation;
		}

@OneToMany(mappedBy="Users")
private List<Reservation> reservation;
			
		  
	}
