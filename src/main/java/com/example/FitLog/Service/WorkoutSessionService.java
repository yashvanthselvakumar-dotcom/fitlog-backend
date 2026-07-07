package com.example.FitLog.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FitLog.Entity.WorkoutSession;
import com.example.FitLog.Exception.ResourceNotFoundException;
import com.example.FitLog.Repository.WorkoutSessionRepository;

@Service
public class WorkoutSessionService {

    @Autowired
    private WorkoutSessionRepository repository;

    public WorkoutSession saveWorkoutSession(
            WorkoutSession session) {

        return repository.save(session);
    }

    public List<WorkoutSession> getAllWorkoutSessions() {
        return repository.findAll();
    }

    public WorkoutSession getWorkoutSessionById(Long id) {

        return repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Workout Session not found"));
    }

    public WorkoutSession updateWorkoutSession(
            Long id,
            WorkoutSession session) {

        getWorkoutSessionById(id);

        session.setId(id);

        return repository.save(session);
    }

    public void deleteWorkoutSession(Long id) {

        getWorkoutSessionById(id);

        repository.deleteById(id);
    }
}