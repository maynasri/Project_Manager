package org.example.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project {
    private int IdProject;
    private String LibelleProject;
    private Date DateDebut;
    private Date DateFin;
    private List<Task> Tasks=new ArrayList<>();
    private  String Cost;
}
