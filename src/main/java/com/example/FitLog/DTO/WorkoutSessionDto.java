package com.example.FitLog.DTO;

import java.time.LocalDate;

public class WorkoutSessionDto {

    private Long id;
    private String sessionName;
    private Integer durationMinutes;
    private Integer caloriesBurned;
    private LocalDate sessionDate;

    public WorkoutSessionDto() {
    }

    public WorkoutSessionDto(Long id,
                             String sessionName,
                             Integer durationMinutes,
                             Integer caloriesBurned,
                             LocalDate sessionDate) {
        this.id = id;
        this.sessionName = sessionName;
        this.durationMinutes = durationMinutes;
        this.caloriesBurned = caloriesBurned;
        this.sessionDate = sessionDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSessionName() {
        return sessionName;
    }

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }

    public Integer getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(Integer durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public Integer getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(Integer caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }

    public LocalDate getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(LocalDate sessionDate) {
        this.sessionDate = sessionDate;
    }
}