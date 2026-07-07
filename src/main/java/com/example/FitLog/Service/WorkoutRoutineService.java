package com.example.FitLog.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FitLog.Entity.WorkoutRoutine;
import com.example.FitLog.Exception.ResourceNotFoundException;
import com.example.FitLog.Repository.WorkoutRoutineRepository;

@Service
public class WorkoutRoutineService {

    @Autowired
    private WorkoutRoutineRepository repository;

    // Create
    public WorkoutRoutine saveRoutine(WorkoutRoutine routine) {
        return repository.save(routine);
    }

    // Read All
    public List<WorkoutRoutine> getAllRoutines() {
        return repository.findAll();
    }

    // Read By Id
    public WorkoutRoutine getRoutineById(Long id) {

        return repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Workout Routine not found with id: " + id));
    }

    // Update
    public WorkoutRoutine updateRoutine(Long id,
                                        WorkoutRoutine routine) {

        WorkoutRoutine existingRoutine = getRoutineById(id);

        existingRoutine.setTitle(routine.getTitle());
        existingRoutine.setDescription(routine.getDescription());
        existingRoutine.setDifficultyLevel(routine.getDifficultyLevel());
        existingRoutine.setTargetGoal(routine.getTargetGoal());

        return repository.save(existingRoutine);
    }

    // Delete
    public void deleteRoutine(Long id) {

        WorkoutRoutine existingRoutine = getRoutineById(id);

        repository.delete(existingRoutine);
    }
}