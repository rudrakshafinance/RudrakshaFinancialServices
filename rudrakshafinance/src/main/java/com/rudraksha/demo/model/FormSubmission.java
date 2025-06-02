package com.rudraksha.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "submissions")
public class FormSubmission {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String username;

 private String mobile;

 @Column(length = 1000)
 private String profile;

 private String sourcePage;

 // Getters and Setters
 public Long getId() { return id; }

 public void setId(Long id) { this.id = id; }

 public String getUsername() { return username; }

 public void setUsername(String username) { this.username = username; }

 public String getMobile() { return mobile; }

 public void setMobile(String mobile) { this.mobile = mobile; }

 public String getProfile() { return profile; }

 public void setProfile(String profile) { this.profile = profile; }

 public String getSourcePage() { return sourcePage; }

 public void setSourcePage(String sourcePage) { this.sourcePage = sourcePage; }
}

