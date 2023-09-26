package com.madlien.demo.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.madlien.demo.entities.MeetingRoom;
@Repository
public interface MeetingRoomRepository extends JpaRepository<MeetingRoom, Long>  {

}
