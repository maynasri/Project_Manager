package org.example.Entity;

public class Task {
    private int IdTask;
    private String TitleTask;
    private String  DescriptionTask;
    private Enum<StatutTask> statutTaskEnum;

    public Task(int idTask, String titleTask, String descriptionTask, Enum<StatutTask> statutTaskEnum) {
        IdTask = idTask;
        TitleTask = titleTask;
        DescriptionTask = descriptionTask;
        this.statutTaskEnum = statutTaskEnum;
    }
}
