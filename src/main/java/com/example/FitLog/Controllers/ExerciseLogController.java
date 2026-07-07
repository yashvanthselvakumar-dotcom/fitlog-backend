package com.example.FitLog.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.FitLog.Entity.ExerciseLog;
import com.example.FitLog.Service.ExerciseLogService;

@RestController
@RequestMapping("/exerciseLogs")
public class ExerciseLogController {

    @Autowired
    private ExerciseLogService service;

    @PostMapping
    public ExerciseLog saveExerciseLog(
            @RequestBody ExerciseLog log) {

        return service.saveExerciseLog(log);
    }

    @GetMapping
    public List<ExerciseLog> getAllExerciseLogs() {
        return service.getAllExerciseLogs();
    }

    @GetMapping("/{id}")
    public ExerciseLog getExerciseLogById(
            @PathVariable Long id) {

        return service.getExerciseLogById(id);
    }

    @PutMapping("/{id}")
    public ExerciseLog updateExerciseLog(
            @PathVariable Long id,
            @RequestBody ExerciseLog log) {

        return service.updateExerciseLog(id, log);
    }

    @DeleteMapping("/{id}")
    public String deleteExerciseLog(
            @PathVariable Long id) {

        service.deleteExerciseLog(id);

        return "Exercise Log deleted successfully";
    }
}