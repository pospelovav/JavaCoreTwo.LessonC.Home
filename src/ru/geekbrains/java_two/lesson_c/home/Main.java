package ru.geekbrains.java_two.lesson_c.home;

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


    }
}
