package com.madlien.demo.entities;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import lombok.Data;
@Entity
@Data
@Getter
@Setter
@Table(name="Room Reservation")
public class Reservation {
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDateTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}
	public LocalDateTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public MeetingRoom getMeetingRoom() {
		return meetingRoom;
	}
	public void setMeetingRoom(MeetingRoom meetingRoom) {
		this.meetingRoom = meetingRoom;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Reservation ID")
private int id;
	
	@Column(name="Reservation Category")
private String category;
	
	@Column(name="Reservation Name")
	private String name;
 
	@Column(name="Start Time")
    private LocalDateTime startTime;
	
	@Column(name="End Time")
    private LocalDateTime endTime;
	
	@Column(name="Reservation Date") 
	private LocalDateTime date;
	
    @ManyToOne
    @JoinColumn(name = "meeting_room_id", nullable = false)
    private MeetingRoom meetingRoom;
    @ManyToOne(cascade= CascadeType.ALL)
	 private List< Reservation> reservation;
    
    @JoinColumn(name="user_id", nullable=false)
    private Users user;

	

	
}
