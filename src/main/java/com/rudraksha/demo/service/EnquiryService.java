package com.rudraksha.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rudraksha.demo.model.Enquiry;
import com.rudraksha.demo.repository.EnquiryRepository;

@Service
public class EnquiryService {

    @Autowired
    private EnquiryRepository enquiryRepository;

    public void saveEnquiry(Enquiry enquiry) {
        enquiryRepository.save(enquiry);
    }
}
