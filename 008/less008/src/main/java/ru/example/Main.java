//Создать список типа ArrayList<String>.
//Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.


package ru.example;

import java.util.ArrayList;

import java.util.List;


public class Main {

    public static void main(String[] args) {
        List arr = new ArrayList<String>();
        arr.add("Привет");
        arr.add(4);
        arr.add("Амлет");
        arr.add(6);
        arr.add("Штеблет");
        arr.add(11);
        System.out.println(arr);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) instanceof Integer) {// Проверка элемента массива на Integer
                arr.remove(i);
            }
        }
        System.out.println(arr);
    }
}