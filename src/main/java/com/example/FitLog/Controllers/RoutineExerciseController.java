package com.example.FitLog.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.FitLog.Entity.RoutineExercise;
import com.example.FitLog.Service.RoutineExerciseService;

@RestController
@RequestMapping("/routineExercises")
public class RoutineExerciseController {

    @Autowired
    private RoutineExerciseService service;

    @PostMapping
    public RoutineExercise saveRoutineExercise(
            @RequestBody RoutineExercise exercise) {
        return service.saveRoutineExercise(exercise);
    }

    @GetMapping
    public List<RoutineExercise> getAllRoutineExercises() {
        return service.getAllRoutineExercises();
    }

    @GetMapping("/{id}")
    public RoutineExercise getRoutineExerciseById(
            @PathVariable Long id) {
        return service.getRoutineExerciseById(id);
    }

    @PutMapping("/{id}")
    public RoutineExercise updateRoutineExercise(
            @PathVariable Long id,
            @RequestBody RoutineExercise exercise) {
        return service.updateRoutineExercise(id, exercise);
    }

    @DeleteMapping("/{id}")
    public String deleteRoutineExercise(
            @PathVariable Long id) {

        service.deleteRoutineExercise(id);
        return "Routine Exercise deleted successfully";
    }
}