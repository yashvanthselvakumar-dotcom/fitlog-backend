package com.example.FitLog.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.FitLog.Entity.FitnessMetric;
import java.util.List;

@Repository
public interface FitnessMetricRepository
        extends JpaRepository<FitnessMetric, Long> {
                List<FitnessMetric> findByBodyWeightKg(Double bodyWeightKg);

}