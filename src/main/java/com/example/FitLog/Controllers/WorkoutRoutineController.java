package com.example.FitLog.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.FitLog.Entity.WorkoutRoutine;
import com.example.FitLog.Service.WorkoutRoutineService;

@RestController
@RequestMapping("/routines")
public class WorkoutRoutineController {

    @Autowired
    private WorkoutRoutineService service;

    @PostMapping
    public WorkoutRoutine saveRoutine(
            @RequestBody WorkoutRoutine routine) {

        return service.saveRoutine(routine);
    }

    @GetMapping
    public List<WorkoutRoutine> getAllRoutines() {

        return service.getAllRoutines();
    }

    @GetMapping("/{id}")
    public WorkoutRoutine getRoutineById(
            @PathVariable Long id) {

        return (WorkoutRoutine) service.getRoutineById(id);
    }

    @PutMapping("/{id}")
    public WorkoutRoutine updateRoutine(
            @PathVariable Long id,
            @RequestBody WorkoutRoutine routine) {

        return service.updateRoutine(id, routine);
    }

    @DeleteMapping("/{id}")
    public String deleteRoutine(
            @PathVariable Long id) {

        service.deleteRoutine(id);

        return "Workout Routine deleted successfully";
    }
}