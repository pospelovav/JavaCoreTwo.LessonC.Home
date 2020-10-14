package ru.geekbrains.java_two.lesson_c.home;

import java.util.ArrayList;
import java.util.HashMap;

public class Text {
    private String[][] matrixString;
    private ArrayList listTextFromMatrix;
    private HashMap hashMapText;

    public String[][] getMatrixString(){
        return this.matrixString;
    }

    public ArrayList getListTextFromMatrix() {
        return listTextFromMatrix;
    }

    public HashMap getHashMapText() {
        return hashMapText;
    }

    private String[][] strToArray(String value) {   //строка в массив
        value = value.toLowerCase();
        String[] rows = value.split("\n");
        String[][] result = new String[rows.length][];
        for (int i = 0; i < result.length; i++) {
            result[i] = rows[i].split(" ");
            //result[i] = result[i].toLowerCase();

        }
        return result;
    }

    private HashMap listTextToMap (String[][] matrixString){    //заполнение поля hashMapText (ключ - слово, значение - сколько раз встречается в тексте)
        HashMap<String, Integer> hashMapText = new HashMap<>();
        for (int i = 0; i < matrixString.length; i++) {
            for (int j = 0; j < matrixString[i].length; j++) {
                if (hashMapText.get(matrixString[i][j]) != null){
                    hashMapText.put(matrixString[i][j],hashMapText.get(matrixString[i][j])+1);
                } else {
                    hashMapText.put(matrixString[i][j], 1);
                }
            }
        }
        return hashMapText;
    }

    public ArrayList textToListNotDuplicate (String[][] matrixString){  //создание списка из массива без дублей
        ArrayList<String> listText = new ArrayList<>();
        for (int i = 0; i < matrixString.length; i++) {
            for (int j = 0; j < matrixString[i].length; j++) {
                if (!(listText.contains(matrixString[i][j]))){
                    listText.add(matrixString[i][j]);
                }
            }
        }
        return listText;
    }

    public Text (String s){
        this.matrixString = strToArray(s);     //строка в массив
        this.listTextFromMatrix = textToListNotDuplicate(this.matrixString);  //создание списка из массива без дублей
        this.hashMapText = listTextToMap(this.matrixString);   //создание HashMap
    }
}
