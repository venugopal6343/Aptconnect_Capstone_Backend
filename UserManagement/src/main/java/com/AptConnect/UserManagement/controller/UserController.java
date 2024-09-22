package com.AptConnect.UserManagement.controller;

import com.AptConnect.UserManagement.repository.ParkingRepository;
import com.AptConnect.UserManagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private ParkingRepository parkingRepository;
    @Autowired
    private UserRepository residentRepository;

    public UserController() {
    }
}
