package com.madlien.demo.controllers;

import com.madlien.demo.entities.MeetingRoom;
import com.madlien.demo.interfaces.MeetingRoomRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/meeting-rooms")
public class MeetingRoomController {

    private final MeetingRoomRepository meetingRoomRepository;

    public MeetingRoomController(MeetingRoomRepository meetingRoomRepository) {
        this.meetingRoomRepository = meetingRoomRepository;
    }

    @GetMapping("/meeting-rooms-list")
    public List<MeetingRoom> getAll() {
        return meetingRoomRepository.findAll();
    }

    @PostMapping("/create-room")
    public MeetingRoom create(@RequestBody MeetingRoom meetingRoom) {
        return meetingRoomRepository.save(meetingRoom);
    }

    @GetMapping("/get-room")
    public MeetingRoom getById(@PathVariable Long id) {
        return meetingRoomRepository.findById(id).orElseThrow(() -> new RuntimeException("Meeting room not found"));
    }

    @PutMapping("/update-room")
    public MeetingRoom update(@PathVariable Long id, @RequestBody MeetingRoom meetingRoom) {
        return meetingRoomRepository.save(meetingRoom);
    }

    @DeleteMapping("/delete-room")
    public void delete(@PathVariable Long id) {
        meetingRoomRepository.deleteById(id);
    }
}
