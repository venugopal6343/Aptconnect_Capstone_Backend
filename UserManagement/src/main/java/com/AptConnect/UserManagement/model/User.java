package com.AptConnect.UserManagement.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY    )
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private boolean smsNotificationsEnabled;
//    @OneToMany(mappedBy = "user") // Establishing the relationship
//    private List<Parking> parkingRecords; // List of parking records associated with the user

    public User() {
    }

    public boolean isSmsNotificationsEnabled() {
        return this.smsNotificationsEnabled;
    }

    public void setSmsNotificationsEnabled(boolean smsNotificationsEnabled) {
        this.smsNotificationsEnabled = smsNotificationsEnabled;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
