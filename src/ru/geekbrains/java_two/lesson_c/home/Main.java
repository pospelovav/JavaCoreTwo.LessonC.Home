package ru.geekbrains.java_two.lesson_c.home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {


    public static void main (String[] args){
        String textString = "It is a new text\nFor matrix text\nNew text string matrix\nMatrix is string from text\nString from matrix text";

        Text text1 = new Text(textString);

        for (int i = 0; i < text1.getMatrixString().length; i++) {
            for (int j = 0; j < text1.getMatrixString()[i].length; j++) {
                System.out.print(text1.getMatrixString()[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(text1.getListTextFromMatrix());
        System.out.println();
        System.out.println(text1.getHashMapText());
        System.out.println();

//второе задание не получилось сделать(, видимо, я Вас не внимательно слушаю
//код оставил только для того, чтобы показать, что пытался, хоть и тщетно
        Person p1 = new Person("Petrov", "54596255", "Petrov1@sadd.ru");
        Person p2 = new Person("Sidorov", "111145654465", "Sidorov@asdas.com");
        Person p3 = new Person("Smirnov", "65555333", "Smirnov@esdsdfs.ru");
        Person p4 = new Person("Petrov", "1111111111111", "Petrov2@esdsdfs.ru");

        Person[] pArr = {p1, p2, p3, p4};

        ArrayList<Person> listPhone = new ArrayList<>();
        listPhone.add(pArr[0]);
        for (int i = 1; i < pArr.length; i++) {
                if ((listPhone.contains(pArr[i]))){
                    listPhone.add(pArr[i]);
                }
        }

        ArrayList<Person> listPhone2 = new ArrayList<>();
        listPhone2.add(pArr[1]);
        for (int i = 2; i < pArr.length; i++) {
            if ((listPhone2.contains(pArr[i]))){
                listPhone2.add(pArr[i]);
            }
        }

        ArrayList<Person> listPhone3 = new ArrayList<>();
        listPhone3.add(pArr[2]);
        for (int i = 3; i < pArr.length; i++) {
            if ((listPhone3.contains(pArr[i]))){
                listPhone3.add(pArr[i]);
            }
        }

        PhoneBook pb = new PhoneBook(p1, listPhone);
        pb.setMap(p2, listPhone2);
        pb.setMap(p3, listPhone3);
        System.out.println(pb.getMapPhoneBook());


    }

}
