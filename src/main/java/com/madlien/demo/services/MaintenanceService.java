package com.madlien.demo.services;

import com.madlien.demo.entities.Maintenance;
import com.madlien.demo.entities.MeetingRoom;
import com.madlien.demo.entities.Reservation;
import com.madlien.demo.interfaces.MaintenanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MaintenanceService {

    @Autowired
    private MaintenanceRepository maintenanceRepository;


    public Maintenance getMaintenanceId(Long id) {
        return maintenanceRepository.findById(id).orElse(null);
    }

    public Maintenance reserveMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    public Maintenance updateMaintenance(Long id, Maintenance maintenance) {
        return maintenanceRepository.findById(id)
                .map(existingMaintenance -> {
                    existingMaintenance.setId(maintenance.getId());
                    existingMaintenance.setType(maintenance.getType());
                    existingMaintenance.setMtime(maintenance.getMtime());

                    return maintenanceRepository.save(existingMaintenance);
                })
                .orElse(null);
    }

    public void deleteGadget(Long id) {
        maintenanceRepository.deleteById(id);
    }
}
