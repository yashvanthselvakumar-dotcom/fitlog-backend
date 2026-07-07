package com.example.FitLog.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.FitLog.Entity.FitnessMetric;
import com.example.FitLog.Service.FitnessMetricService;

@RestController
@RequestMapping("/metrics")
public class FitnessMetricController {

    @Autowired
private FitnessMetricService service;

    @PostMapping
    public FitnessMetric saveMetric(@RequestBody FitnessMetric metric) {
        return service.saveMetric(metric);
    }

    @GetMapping
    public List<FitnessMetric> getAllMetrics() {
        return service.getAllMetrics();
    }

    @GetMapping("/{id}")
    public FitnessMetric getMetricById(@PathVariable Long id) {
        return service.getMetricById(id);
    }

    @PutMapping("/{id}")
    public FitnessMetric updateMetric(@PathVariable Long id,
                                      @RequestBody FitnessMetric metric) {
        return service.updateMetric(id, metric);


    }

   @DeleteMapping("/{id}")
public String deleteMetric(@PathVariable Long id) {

    service.deleteMetric(id);

    return "Metric deleted successfully";
}
}