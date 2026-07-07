package com.example.FitLog.DTO;

public class RoutineExerciseDto {

    private Long id;
    private String exerciseName;
    private Integer sets;
    private Integer reps;
    private Integer restTimeSeconds;

    public RoutineExerciseDto() {
    }

    public RoutineExerciseDto(Long id,
                              String exerciseName,
                              Integer sets,
                              Integer reps,
                              Integer restTimeSeconds) {
        this.id = id;
        this.exerciseName = exerciseName;
        this.sets = sets;
        this.reps = reps;
        this.restTimeSeconds = restTimeSeconds;
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

    public Integer getRestTimeSeconds() {
        return restTimeSeconds;
    }

    public void setRestTimeSeconds(Integer restTimeSeconds) {
        this.restTimeSeconds = restTimeSeconds;
    }
}