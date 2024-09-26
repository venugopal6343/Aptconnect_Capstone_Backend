package com.AptConnect.UserManagement.service;

import com.AptConnect.UserManagement.model.User;
import com.AptConnect.UserManagement.repository.ParkingRepository;
import com.AptConnect.UserManagement.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    private UserRepository userRepository;
    private ParkingRepository parkingRepository;
    private ParkingService parking;


    public User createUser(User user) {
        return userRepository.save(user);

    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
