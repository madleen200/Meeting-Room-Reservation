package com.madlien.demo.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.madlien.demo.entities.Gadget;

@Repository
public interface GadgetRepository extends JpaRepository<Gadget, Long> {

}
