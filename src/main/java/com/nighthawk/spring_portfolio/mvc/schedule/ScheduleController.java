package com.nighthawk.spring_portfolio.mvc.schedule;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/schedule")
public class ScheduleController {
    private List<Event> events = new ArrayList<>();

    @GetMapping("/events")
    public ResponseEntity<List<Event>> getAllEvents() {
        return new ResponseEntity<>(events, HttpStatus.OK);
    }

    @PostMapping("/addEvent")
    public ResponseEntity<String> addEvent(@RequestBody Event event) {
        events.add(event);
        return new ResponseEntity<>("Event added successfully.", HttpStatus.CREATED);
    }
}
