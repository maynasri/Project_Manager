package org.example;

import org.example.Entity.Project;
import org.example.Entity.StatutTask;
import org.example.Entity.Task;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestProject {
    @Test
    public void addTaskToProejct() {
        List<Task> taskList=new ArrayList<>();
        Task task =new Task(130,"Create table User ", "Create table User with attributs : IdUser,Full_Name,Email,Password", StatutTask.AuDebut);
        Project project=new Project(50,"Application Gestion de projet",taskList);

        boolean result=project.addTask(task);
        if (result==true)
        {
            System.out.println("Ajout de tâche avec succàès");
        }
    }
}
