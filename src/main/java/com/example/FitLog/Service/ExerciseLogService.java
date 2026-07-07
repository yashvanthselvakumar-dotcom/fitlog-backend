package com.example.FitLog.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FitLog.Entity.ExerciseLog;
import com.example.FitLog.Exception.ResourceNotFoundException;
import com.example.FitLog.Repository.ExerciseLogRepository;

@Service
public class ExerciseLogService {

    @Autowired
    private ExerciseLogRepository repository;

    public ExerciseLog saveExerciseLog(ExerciseLog log) {
        return repository.save(log);
    }

    public List<ExerciseLog> getAllExerciseLogs() {
        return repository.findAll();
    }

    public ExerciseLog getExerciseLogById(Long id) {

        return repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Exercise Log not found"));
    }

    public ExerciseLog updateExerciseLog(
            Long id,
            ExerciseLog log) {

        getExerciseLogById(id);

        log.setId(id);

        return repository.save(log);
    }

    public void deleteExerciseLog(Long id) {

        getExerciseLogById(id);

        repository.deleteById(id);
    }
}