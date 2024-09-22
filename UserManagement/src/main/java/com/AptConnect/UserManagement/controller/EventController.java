package com.AptConnect.UserManagement.controller;


import com.AptConnect.UserManagement.model.Event;
import com.AptConnect.UserManagement.service.EventService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/admin/events"})
@CrossOrigin({"http://localhost:4200"})
public class EventController {
    @Autowired
    private EventService eventService;

    public EventController() {
    }

    @PostMapping({"/create"})
    public ResponseEntity<Event> createEvent(@RequestBody Event event) {
        Event createdEvent = this.eventService.createEvent(event);
        return ResponseEntity.ok(createdEvent);
    }

    @GetMapping
    public ResponseEntity<List<Event>> getAllEvents() {
        List<Event> events = this.eventService.getAllEvents();
        return ResponseEntity.ok(events);
    }

    @PutMapping({"{id}"})
    public ResponseEntity<Event> updateEvent(@PathVariable Long id, @RequestBody Event event) {
        Event updatedEvent = this.eventService.updateEvent(id, event);
        return ResponseEntity.ok(updatedEvent);
    }

    @DeleteMapping({"{id}"})
    public ResponseEntity<Void> deleteEvent(@PathVariable Long id) {
        this.eventService.deleteEvent(id);
        return ResponseEntity.noContent().build();
    }
}

