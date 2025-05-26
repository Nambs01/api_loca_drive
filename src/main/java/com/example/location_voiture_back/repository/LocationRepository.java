package com.example.location_voiture_back.repository;

import com.example.location_voiture_back.interfaces.DashboardData;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.location_voiture_back.entity.Location;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LocationRepository extends JpaRepository<Location, Integer> {
    @Query("SELECT sum(taux*nbr_jours) as total_montant, min(taux*nbr_jours) as min_montant, max(taux*nbr_jours) from  Location ")
    DashboardData getDashboardData();
}
