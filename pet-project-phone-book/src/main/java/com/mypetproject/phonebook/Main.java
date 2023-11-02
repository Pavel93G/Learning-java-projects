package com.mypetproject.phonebook;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        System.out.println("Добро пожаловать в вашу телефонную книгу!");

        while (true) {
            System.out.print("Меню: \n" +
                             "1. Добавить контакт.\n" +
                             "2. Просмотреть все контакты.\n" +
                             "3. Найти контакт\n" +
                             "4. Удалить контакт\n" +
                             "5. Выйти.\n");

            System.out.print("Выберете нужное действие(1/2/3/4/5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Введите имя контакта: ");
                    String name = scanner.next();
                    System.out.print("Введите номер телефона: ");
                    String phoneNumber = scanner.next();
                    phoneBook.addContact(name, phoneNumber);
                }
                case 2 -> {
                    System.out.println("Ваши контакты: ");
                    phoneBook.viewContact();
                }
                case 3 -> {
                    System.out.print("Введите имя контакта: ");
                    String name = scanner.next();
                    phoneBook.findContact(name);
                }
                case 4 -> {
                    System.out.print("Введите имя контакта для удаления: ");
                    String name = scanner.next();
                    phoneBook.removeContact(name);
                }
                case 5 -> {
                    System.out.print("Спасибо за использование телефонной книги. До встречи !");
                    scanner.close();
                    System.exit(0);
                    break;
                }
                default -> System.out.println("Некорректный выбор действия! Пожалуйста выберете действие из меню.");
            }
        }
    }
}
