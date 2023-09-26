package com.madlien.demo.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.madlien.demo.entities.Reservation;
@Repository

public interface ReservationRepository extends JpaRepository<Reservation, Long>  {

}
