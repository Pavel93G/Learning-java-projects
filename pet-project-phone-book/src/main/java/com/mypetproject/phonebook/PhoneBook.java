package com.mypetproject.phonebook;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, Contact> contacts = new HashMap<>();

    public void addContact(String name, String phoneNumber) {
        Contact contact = new Contact(name, phoneNumber);
        contacts.put(contact.getName(), contact);
    }

    public void viewContact() {
        for (Contact contact : contacts.values()) {
            System.out.println(contact.getName() + ": " + contact.getPhoneNumber());
        }
    }

    public void findContact(String name) {
        if (contacts.containsKey(name)) {
            Contact contact = contacts.get(name);
            System.out.println("Контакт: " + contact.getName() + "\n Номер телефона: " + contact.getPhoneNumber());
        } else {
            System.out.println("Контакт с именем: " + name + " не найден.");
        }
    }

    public void removeContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            System.out.println("Контакт с именем: " + name + " успешно удален.");
        } else {
            System.out.println("Контакта с именем: " + name + " не найден.");
        }
    }
}
