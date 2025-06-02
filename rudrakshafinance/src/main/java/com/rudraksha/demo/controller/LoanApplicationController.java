package com.rudraksha.demo.controller;

import com.rudraksha.demo.model.LoanApplication;
import com.rudraksha.demo.service.LoanApplicationService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/apply")
public class LoanApplicationController {

    private final LoanApplicationService service;
    
    public LoanApplicationController(LoanApplicationService service) {
        this.service = service;
    }
    
    @PostMapping("/{type}")
    public LoanApplication applyForLoan(@PathVariable("type") String type, @RequestBody LoanApplication application) {
        application.setLoanType(type); // home, mortgage, etc.
        // Print incoming data for verification
       System.out.println("Received application: " + application.getName() + ", " + application.getNumber() + ", " + application.getAmount() + ", " + application.getMessage());

        return service.saveApplication(application);
    }
}

