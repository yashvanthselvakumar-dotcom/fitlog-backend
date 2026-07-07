package com.example.FitLog.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.FitLog.Entity.WorkoutRoutine;
import java.util.List;

@Repository
public interface WorkoutRoutineRepository
        extends JpaRepository<WorkoutRoutine, Long> {
            List<WorkoutRoutine> findByTitle(String title);
}