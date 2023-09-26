package com.madlien.demo.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
@Data
@Getter
@Setter
@Transactional
@Table(name="Gadget")
public class Gadget {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="Gadget ID")
private int id;

    @Column(name="Gadget Name")	
	private String name;	
	  
    @Column(name="Gadget Type")
	 private String type;	
    

	 
    }
