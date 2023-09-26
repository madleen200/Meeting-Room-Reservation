package com.madlien.demo.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.madlien.demo.entities.Maintenance;
@Repository

public interface MaintenanceRepository extends JpaRepository<Maintenance, Long>  {

}
