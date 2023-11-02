package com.mypetproject.todolist;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();

        System.out.println("Добро пожаловать, в список задач To-Do List");

        while (true) {
            System.out.print("Меню: \n " +
                             "1. Добавить задачу.\n" +
                             "2. Посмотреть задачу\n" +
                             "3. Удалить задачу\n" +
                             "4. Выйти\n");

            System.out.println("Выберете ваше действие (1/2/3/4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Введите описание задачи: ");
                    String description = scanner.next();
                    toDoList.addTask(description);
                }
                case 2 -> toDoList.viewTasks();
                case 3 -> {
                    System.out.print("Введите номер задачи для удаления: ");
                    int taskId = scanner.nextInt();
                    toDoList.removeTask(taskId);
                }
                case 4 -> {
                    System.out.println("Спасибо за использование To - Do - List! До встречи!");
                    scanner.close();
                    System.exit(0);
                    break;
                }
                default -> {
                    System.out.println("Некорректный выбор. пожалуйста, выберете действие из меню.");
                    break;
                }
            }
        }
    }
}
