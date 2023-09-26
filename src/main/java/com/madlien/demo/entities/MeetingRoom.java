package com.madlien.demo.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.NoArgsConstructor;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.Setter;
import lombok.Data;
import lombok.Getter;


@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@Table(name="Meeting Room")
public class MeetingRoom {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Meeting Room ID")
private long id ;
	
	@Column(name="Meeting Room Name")
private String name;
	
	@Column(name="Meeting Room cleaning status")
private boolean isClean;
	
	@Column(name="Capacity")
private int capacity;
	

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

	public boolean getClean() {
		return isClean;
	}

	public void setClean(boolean isClean) {
		this.isClean = isClean;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	 @OneToMany(mappedBy="MeetingRoom")
	 private List<Reservation> reservation;


	public List<Reservation> getReservation() {
		return reservation;
	}

	public void setReservation(List<Reservation> reservation) {
		this.reservation = reservation;
	}
	 

    }
	

			
 
    

