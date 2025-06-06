package com.rudraksha.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.rudraksha.demo.model.FormSubmission;
import com.rudraksha.demo.repository.FormRepository;

@RestController
@RequestMapping("/api/forms")
@CrossOrigin(origins = "*")
public class FormController {

 @Autowired
 private FormRepository formRepository;

 @PostMapping("/submit")
 public FormSubmission submitForm(@RequestBody FormSubmission formSubmission) {
     return formRepository.save(formSubmission);
 }
}

