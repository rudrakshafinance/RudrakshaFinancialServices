package com.rudraksha.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cibil_defaulters")
public class CibilDefaulter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullname;
    private String phone;
    private String loantype;
    private Double loanamount;
    private String reason;
    private Integer cibilscore;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLoantype() {
        return loantype;
    }

    public void setLoantype(String loantype) {
        this.loantype = loantype;
    }

    public Double getLoanamount() {
        return loanamount;
    }

    public void setLoanamount(Double loanamount) {
        this.loanamount = loanamount;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getCibilscore() {
        return cibilscore;
    }

    public void setCibilscore(Integer cibilscore) {
        this.cibilscore = cibilscore;
    }
}
