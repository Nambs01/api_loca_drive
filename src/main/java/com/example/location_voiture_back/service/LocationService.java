package com.example.location_voiture_back.service;

import com.example.location_voiture_back.entity.Location;
import com.example.location_voiture_back.interfaces.DashboardData;
import com.example.location_voiture_back.repository.LocationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
 public class LocationService {
    private  final  LocationRepository locationRepository;

    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }

    public Location createLocation(Location location) {
        return locationRepository.save(location);
    }

    public Location updateLocation(Integer id, Location updatedLocation) {
        updatedLocation.setId(id);
        return locationRepository.save(updatedLocation);
    }

    public void deleteLocation(Integer id) {
        locationRepository.deleteById(id);
    }

    public DashboardData getDashboardData() {
        return locationRepository.getDashboardData();
    }
}
