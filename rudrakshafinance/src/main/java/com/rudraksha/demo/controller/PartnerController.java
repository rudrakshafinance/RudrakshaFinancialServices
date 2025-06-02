package com.rudraksha.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.rudraksha.demo.model.Partner;
import com.rudraksha.demo.repository.PartnerRepository;

@RestController
@CrossOrigin(origins = "*") // Allows frontend to connect from other domains
@RequestMapping("/api/partners")
public class PartnerController {

    @Autowired
    private PartnerRepository partnerRepository;

    @PostMapping
    public Partner submitForm(@RequestBody Partner partner) {
        return partnerRepository.save(partner);
    }
}

