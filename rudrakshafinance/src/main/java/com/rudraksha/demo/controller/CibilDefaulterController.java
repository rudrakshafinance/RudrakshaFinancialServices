package com.rudraksha.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.rudraksha.demo.model.CibilDefaulter;
import com.rudraksha.demo.repository.CibilDefaulterRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/defaulters")
public class CibilDefaulterController {

    @Autowired
    private CibilDefaulterRepository repository;

    @PostMapping
    public CibilDefaulter submitDefaulter(@RequestBody CibilDefaulter defaulter) {
        return repository.save(defaulter);
    }
}
