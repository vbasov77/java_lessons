//Заполнить список десятью случайными числами.
//Отсортировать список методом sort() и вывести его на экран.


package ru.example;


import java.util.Arrays;
import java.util.Random;

public class Main {
    private int[] generateArr() {
        int[] array = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100) + 1;
        }
        return array;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        int[] arr = obj.generateArr();
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);// Сортируем массив
        System.out.println(Arrays.toString(arr));
    }
}