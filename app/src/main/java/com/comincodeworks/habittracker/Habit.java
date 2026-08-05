package com.comincodeworks.habittracker;

public class Habit {
    private int id;
    private String name;
    private String icon;
    private int color;
    private boolean completed;

    public Habit(int id, String name, String icon, int color, boolean completed){
        this.id = id;
        this.name = name;
        this.icon = icon;
        this.color = color;
        this.completed = completed;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getIcon(){
        return icon;
    }

    public int getColor(){
        return color;
    }

    public boolean isCompleted(){
        return completed;
    }

    public void setCompleted(boolean completed){
        this.completed = completed;
    }
}
