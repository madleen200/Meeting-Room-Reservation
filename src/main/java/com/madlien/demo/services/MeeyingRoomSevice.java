package com.madlien.demo.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madlien.demo.entities.MeetingRoom;
import com.madlien.demo.interfaces.MeetingRoomRepository;
@Service
public class MeeyingRoomSevice {

	@Autowired
    private MeetingRoomRepository meetingRoomRepository;

    public List<MeetingRoom> getAllMeetingRooms() {
        return meetingRoomRepository.findAll();
    }

    public MeetingRoom getMeetingRoomById(Long id) {
        return meetingRoomRepository.findById(id).orElse(null);
    }

    public MeetingRoom createMeetingRoom(MeetingRoom meetingRoom) {
        return meetingRoomRepository.save(meetingRoom);
    }

    public MeetingRoom updateMeetingRoom(Long id, MeetingRoom meetingRoom) {
        return meetingRoomRepository.findById(id)
                .map(existingMeetingRoom -> {
                    existingMeetingRoom.setName(meetingRoom.getName());
                    existingMeetingRoom.setCapacity(meetingRoom.getCapacity());
                    existingMeetingRoom.setClean(meetingRoom.getClean());
                    existingMeetingRoom.setReservation(meetingRoom.getReservation());
                    return meetingRoomRepository.save(existingMeetingRoom);
                })
                .orElse(null);
    }

    public void deleteMeetingRoom(Long id) {
        meetingRoomRepository.deleteById(id);
    }

}
