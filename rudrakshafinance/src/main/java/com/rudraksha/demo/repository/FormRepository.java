package com.rudraksha.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.rudraksha.demo.model.FormSubmission;

public interface FormRepository extends JpaRepository<FormSubmission, Long> {
}

