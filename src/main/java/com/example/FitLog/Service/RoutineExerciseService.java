package com.example.FitLog.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FitLog.Entity.RoutineExercise;
import com.example.FitLog.Exception.ResourceNotFoundException;
import com.example.FitLog.Repository.RoutineExerciseRepository;

@Service
public class RoutineExerciseService {

    @Autowired
    private RoutineExerciseRepository repository;

    // Create
    public RoutineExercise saveRoutineExercise(
            RoutineExercise exercise) {

        return repository.save(exercise);
    }

    // Read All
    public List<RoutineExercise> getAllRoutineExercises() {
        return repository.findAll();
    }

    // Read By Id
    public RoutineExercise getRoutineExerciseById(Long id) {

        return repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Routine Exercise not found with id: " + id));
    }

    // Update
    public RoutineExercise updateRoutineExercise(
            Long id,
            RoutineExercise exercise) {

        RoutineExercise existingExercise =
                getRoutineExerciseById(id);

        existingExercise.setExerciseName(
                exercise.getExerciseName());
        existingExercise.setSets(
                exercise.getSets());
        existingExercise.setReps(
                exercise.getReps());
        existingExercise.setRestTimeSeconds(
                exercise.getRestTimeSeconds());

        return repository.save(existingExercise);
    }

    // Delete
    public void deleteRoutineExercise(Long id) {

        RoutineExercise existingExercise =
                getRoutineExerciseById(id);

        repository.delete(existingExercise);
    }
}