package com.rudraksha.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "partners")
@Data
public class Partner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String profile;
    private String phone;
    private String email;
    private String address;
    
    @Column(length = 1000)
    private String business;
    
    
}

