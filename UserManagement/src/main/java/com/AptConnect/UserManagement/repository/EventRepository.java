package com.AptConnect.UserManagement.repository;


import com.AptConnect.UserManagement.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}

