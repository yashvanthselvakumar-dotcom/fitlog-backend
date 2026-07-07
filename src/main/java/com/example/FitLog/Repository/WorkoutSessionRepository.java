package com.example.FitLog.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.FitLog.Entity.WorkoutSession;

@Repository
public interface WorkoutSessionRepository
        extends JpaRepository<WorkoutSession, Long> {

}