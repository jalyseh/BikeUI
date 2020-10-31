package com.globomatics.Bike.controllers;

import com.globomatics.Bike.models.Bike;
import com.globomatics.Bike.repositories.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikeController {

    @Autowired
    private BikeRepository bikeRepository;

    @GetMapping
    public Iterable<Bike> bikeList(){
        return bikeRepository.findAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createBike(@RequestBody Bike bike){
        bikeRepository.save(bike);
    }
    @GetMapping("/{id}")
    public Optional<Bike> getBike(@PathVariable("id") long id){
        return bikeRepository.findById(id);

    }
}
