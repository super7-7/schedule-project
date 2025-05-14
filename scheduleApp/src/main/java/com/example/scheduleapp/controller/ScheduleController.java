package com.example.scheduleapp.controller;

import org.springframework.scheduling.annotation.Schedules;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/schedules")

public class ScheduleController {

    @GetMapping
    public String getAllSchedules() {
        return "All Schedules";
    }

    @PostMapping
    public String createSchedule() {
        return "Create Schedule";
    }

}
