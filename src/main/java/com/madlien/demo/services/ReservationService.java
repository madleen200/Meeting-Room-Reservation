package com.madlien.demo.services;

import com.madlien.demo.entities.Reservation;
import com.madlien.demo.interfaces.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationrepository;

    public List<Reservation> getAllMeetingRooms() {
        return reservationrepository.findAll();
    }
    public Reservation getMeetingRoomById(Long id) {
        return reservationrepository.findById(id).orElse(null);
    }

    public Reservation createMeetingRoom(Reservation reservation) {
        return reservationrepository.save(reservation);
    }

    public Reservation updateMeetingRoom(Long id, Reservation reservation) {
        return reservationrepository.findById(id)
                .map(existingReservation -> {
                    existingReservation.setName(reservation.getName());
                    existingReservation.setCategory(reservation.getCategory());
                    existingReservation.setId(reservation.getId());
                    existingReservation.setStartTime(reservation.getStartTime());
                    existingReservation.setMeetingRoom(reservation.getMeetingRoom());

                    return reservationrepository.save(existingReservation);
                })
                .orElse(null);
    }

    public void deleteReservation(Long id) {
        reservationrepository.deleteById(id);
    }


}



