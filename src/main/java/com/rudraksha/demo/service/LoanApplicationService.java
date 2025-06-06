package com.rudraksha.demo.service;

import com.rudraksha.demo.model.LoanApplication;
import com.rudraksha.demo.repository.LoanApplicationRepository;
import org.springframework.stereotype.Service;

@Service
public class LoanApplicationService {

    private final LoanApplicationRepository repository;

    public LoanApplicationService(LoanApplicationRepository repository) {
        this.repository = repository;
    }

    public LoanApplication saveApplication(LoanApplication application) {
        return repository.save(application);
    }
}
