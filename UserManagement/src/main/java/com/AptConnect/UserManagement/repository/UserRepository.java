package com.AptConnect.UserManagement.repository;

import com.AptConnect.UserManagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
