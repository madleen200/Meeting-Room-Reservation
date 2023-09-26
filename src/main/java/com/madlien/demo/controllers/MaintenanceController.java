package com.madlien.demo.controllers;

import com.madlien.demo.entities.Maintenance;
import com.madlien.demo.interfaces.MaintenanceRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@ RestController
@RequestMapping("/maintenance")
public class MaintenanceController {

    private final MaintenanceRepository maintenanceRepository;

    public MaintenanceController(MaintenanceRepository maintenanceRepository) {
        this.maintenanceRepository = maintenanceRepository;
    }

    @GetMapping("/maintenance-list")
    public List<Maintenance> getAll() {
        return maintenanceRepository.findAll();
    }

    @PostMapping("/reserve-maintenance")
    public Maintenance create(@RequestBody Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @GetMapping("/get-maintenance")
    public Maintenance getById(@PathVariable Long id) {
        return maintenanceRepository.findById(id).orElseThrow(() -> new RuntimeException("Maintenance not found"));
    }

    @PutMapping("/update-maintenance")
    public Maintenance update(@PathVariable Long id, @RequestBody Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @DeleteMapping("/delete-maintenance")
    public void delete(@PathVariable Long id) {
        maintenanceRepository.deleteById(id);
    }
}
