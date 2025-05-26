package com.example.location_voiture_back.controller;

import com.example.location_voiture_back.entity.Location;
import com.example.location_voiture_back.interfaces.DashboardData;
import com.example.location_voiture_back.service.LocationService;
import org.aspectj.apache.bcel.classfile.Unknown;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/location")
class LocationController {
    private final LocationService locationService;
    private static final Logger logger = LoggerFactory.getLogger(LocationController.class);

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping
    private List<Location> getAllLocations() {
        return locationService.getAllLocations();
    }
    
    @PostMapping
    public Location createLocation(@RequestBody Location data) {
        return locationService.createLocation(data);
    }

    @PutMapping("/{id}")
    public Location upadateLocation(@PathVariable Integer id, @RequestBody Location dataLocation) {
        return locationService.updateLocation(id, dataLocation);
    }

    @DeleteMapping("/{id}")
    public int deleteLocation(@PathVariable Integer id) {
        locationService.deleteLocation(id);
        return id;
    }

    @GetMapping(path = "/dashboard")
    public DashboardData dashboardData() {
        return locationService.getDashboardData();
    }
}
