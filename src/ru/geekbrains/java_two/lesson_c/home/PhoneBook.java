package ru.geekbrains.java_two.lesson_c.home;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private HashMap mapPhoneBook;

    public HashMap getMapPhoneBook() {
        return mapPhoneBook;
    }
    public void setMap (Person per, ArrayList list){
        this.mapPhoneBook.put(per.getSurname(), list);
    }

    public PhoneBook(Person per, ArrayList list) {
        HashMap<String, ArrayList> hashMapText = new HashMap<>();
        hashMapText.put(per.getSurname(), list);
        this.mapPhoneBook = hashMapText;
    }
}
