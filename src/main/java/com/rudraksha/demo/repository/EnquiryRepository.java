package com.rudraksha.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rudraksha.demo.model.Enquiry;

public interface EnquiryRepository extends JpaRepository<Enquiry, Long> {
}

