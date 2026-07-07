package com.example.FitLog.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.FitLog.Entity.WorkoutSession;
import com.example.FitLog.Service.WorkoutSessionService;

@RestController
@RequestMapping("/workoutSessions")
public class WorkoutSessionController {

    @Autowired
    private WorkoutSessionService service;

    @PostMapping
    public WorkoutSession saveWorkoutSession(
            @RequestBody WorkoutSession session) {

        return service.saveWorkoutSession(session);
    }

    @GetMapping
    public List<WorkoutSession> getAllWorkoutSessions() {

        return service.getAllWorkoutSessions();
    }

    @GetMapping("/{id}")
    public WorkoutSession getWorkoutSessionById(
            @PathVariable Long id) {

        return service.getWorkoutSessionById(id);
    }

    @PutMapping("/{id}")
    public WorkoutSession updateWorkoutSession(
            @PathVariable Long id,
            @RequestBody WorkoutSession session) {

        return service.updateWorkoutSession(id, session);
    }

    @DeleteMapping("/{id}")
    public String deleteWorkoutSession(
            @PathVariable Long id) {

        service.deleteWorkoutSession(id);
        return "Workout Session deleted successfully";
    }
}