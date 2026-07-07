package com.example.FitLog.DTO;

public class WorkoutRoutineDto {

    private Long id;
    private String title;
    private String description;
    private String difficultyLevel;
    private String targetGoal;

    public WorkoutRoutineDto() {
    }

    public WorkoutRoutineDto(Long id, String title,
                             String description,
                             String difficultyLevel,
                             String targetGoal) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.difficultyLevel = difficultyLevel;
        this.targetGoal = targetGoal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public String getTargetGoal() {
        return targetGoal;
    }

    public void setTargetGoal(String targetGoal) {
        this.targetGoal = targetGoal;
    }
}