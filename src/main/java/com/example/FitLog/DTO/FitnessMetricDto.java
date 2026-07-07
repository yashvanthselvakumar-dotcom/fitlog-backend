package com.example.FitLog.DTO;

import java.time.LocalDate;

public class FitnessMetricDto {

    private Long id;
    private LocalDate recordedDate;
    private Double bodyWeightKg;
    private Double bodyFatPercentage;

    public FitnessMetricDto() {
    }

    public FitnessMetricDto(Long id,
                            LocalDate recordedDate,
                            Double bodyWeightKg,
                            Double bodyFatPercentage) {
        this.id = id;
        this.recordedDate = recordedDate;
        this.bodyWeightKg = bodyWeightKg;
        this.bodyFatPercentage = bodyFatPercentage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getRecordedDate() {
        return recordedDate;
    }

    public void setRecordedDate(LocalDate recordedDate) {
        this.recordedDate = recordedDate;
    }

    public Double getBodyWeightKg() {
        return bodyWeightKg;
    }

    public void setBodyWeightKg(Double bodyWeightKg) {
        this.bodyWeightKg = bodyWeightKg;
    }

    public Double getBodyFatPercentage() {
        return bodyFatPercentage;
    }

    public void setBodyFatPercentage(Double bodyFatPercentage) {
        this.bodyFatPercentage = bodyFatPercentage;
    }
}