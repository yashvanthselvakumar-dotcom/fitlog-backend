package com.example.FitLog.DTO;

import java.time.LocalDate;

public class ExerciseLogDto {

    private Long id;
    private String exerciseName;
    private Integer sets;
    private Integer reps;
    private Double weightKg;
    private LocalDate exerciseDate;

    public ExerciseLogDto() {
    }

    public ExerciseLogDto(Long id, String exerciseName,
                          Integer sets, Integer reps,
                          Double weightKg,
                          LocalDate exerciseDate) {
        this.id = id;
        this.exerciseName = exerciseName;
        this.sets = sets;
        this.reps = reps;
        this.weightKg = weightKg;
        this.exerciseDate = exerciseDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public Integer getSets() {
        return sets;
    }

    public void setSets(Integer sets) {
        this.sets = sets;
    }

    public Integer getReps() {
        return reps;
    }

    public void setReps(Integer reps) {
        this.reps = reps;
    }

    public Double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(Double weightKg) {
        this.weightKg = weightKg;
    }

    public LocalDate getExerciseDate() {
        return exerciseDate;
    }

    public void setExerciseDate(LocalDate exerciseDate) {
        this.exerciseDate = exerciseDate;
    }
}