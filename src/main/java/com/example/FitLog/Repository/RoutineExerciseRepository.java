package com.example.FitLog.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.FitLog.Entity.RoutineExercise;

@Repository
public interface RoutineExerciseRepository
        extends JpaRepository<RoutineExercise, Long> {

}