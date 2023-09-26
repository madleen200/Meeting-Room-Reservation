package com.madlien.demo.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Getter
@Setter
@Table(name="Room Maintenance")
public class Maintenance {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="Maintenance ID")
	  private int id;
	
	@Column(name="Maintenance Type")
	private String type;
	
	@Column(name="Maintenance Time")

  private LocalDateTime mtime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDateTime getMtime() {
		return mtime;
	}

	public void setMtime(LocalDateTime mtime) {
		this.mtime = mtime;
	}

}
