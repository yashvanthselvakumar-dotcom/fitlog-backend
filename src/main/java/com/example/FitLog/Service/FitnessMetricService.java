package com.example.FitLog.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FitLog.Entity.FitnessMetric;
import com.example.FitLog.Exception.ResourceNotFoundException;
import com.example.FitLog.Repository.FitnessMetricRepository;

@Service
public class FitnessMetricService {

    @Autowired
    private FitnessMetricRepository repository;

    public FitnessMetric saveMetric(FitnessMetric metric) {
        return repository.save(metric);
    }

    public List<FitnessMetric> getAllMetrics() {
        return repository.findAll();
    }

    public FitnessMetric getMetricById(Long id) {
    return repository.findById(id)
            .orElseThrow(() ->
                    new ResourceNotFoundException("Metric not found"));
}

    public FitnessMetric updateMetric(Long id, FitnessMetric metric) {
        metric.setId(id);
        return repository.save(metric);
    }

    public void deleteMetric(Long id) {
        repository.deleteById(id);
    }
}