package com.mypetproject.todolist;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private ArrayList<Task> tasks = new ArrayList<Task>();
    int nextTaskId;

    public void addTask(String description) {
        nextTaskId++;
        tasks.add(new Task(nextTaskId, description));
    }

    public void viewTasks() {
        System.out.println("Список всех задать: ");
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void removeTask(int taskId) {
        Task taskToRemove = null;

        for (Task task : tasks) {
            if (task.getId() == taskId) {
                taskToRemove = task;
            }
            break;
        }

        if (taskToRemove != null) {
            tasks.remove(taskToRemove);
            System.out.println("Задача №: " + taskId + " удалена.");
        } else {
            System.out.println("Задача №: " + taskId + " не найдена");
        }
    }

    public Task findTaskById(int taskId) {
        Task taskById = null;

        for (Task task : tasks) {
            if (task.getId() == taskId) {
                taskById = task;
            }
            break;
        }
        return taskById;
//        if (taskById != null) {
//            System.out.println("Задача №: " + taskId);
//            return taskById;
//        } else {
//            System.out.println("Задача №: " + taskId + " не найдена.");
//        }
    }

    private int getNewTaskId() {
        int newId = 1;

        while (taskExist(newId)) {
            newId++;
        }
        return newId;
    }

    private boolean taskExist(int taskId) {
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                return true;
            }
        }
        return false;
    }
}
