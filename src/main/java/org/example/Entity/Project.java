package org.example.Entity;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project {
    private int IdProject;
    private String LibelleProject;
    private Date DateDebut;
    private Date DateFin;
    private List<Task> Tasks;
    private  String Cost;

    public Project(int idProject, String libelleProject, List<Task> tasks) {
        IdProject = idProject;
        LibelleProject = libelleProject;
        Tasks = tasks;
    }


    public boolean addTask(Task task) {
        return Tasks.add(task);
    }
}
