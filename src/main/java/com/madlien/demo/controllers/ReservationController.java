package com.madlien.demo.controllers;


import com.madlien.demo.Utility.RoleChecker;
import com.madlien.demo.entities.Reservation;
import com.madlien.demo.interfaces.ReservationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping
public class ReservationController {

    private final ReservationRepository reservationRepository  ;
    private final RoleChecker roleChecker;
    public ReservationController(ReservationRepository reservationRepository, RoleChecker roleChecker) {
        this.reservationRepository = reservationRepository ;
        this.roleChecker = roleChecker;
    }

    @GetMapping("/reservatons-list")
    public List<Reservation> getAll() {
        return reservationRepository.findAll();
    }

    @PostMapping("/reserve-room")
    public Reservation create(@RequestBody Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @GetMapping("/get-reservation")
    public Reservation getById(@PathVariable Long id) {
        return reservationRepository.findById(id).orElseThrow(() -> new RuntimeException("room reservation not found"));
    }

     


    @PutMapping("/update-reservation")
    public Reservation update(@PathVariable Long id, @RequestBody Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @DeleteMapping("/delete-reservation")
    public void delete(@PathVariable Long id) {
        reservationRepository.deleteById(id);
    }
}
