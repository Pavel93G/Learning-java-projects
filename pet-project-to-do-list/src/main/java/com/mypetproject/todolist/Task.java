package com.mypetproject.todolist;

public class Task {
    private int id;
    private String descriptions;

    public Task(int id, String descriptions) {
        this.id = id;
        this.descriptions = descriptions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    @Override
    public String toString() {
        return "Task{" +
               "id=" + id +
               ", descriptions='" + descriptions + '\'' +
               '}';
    }
}
