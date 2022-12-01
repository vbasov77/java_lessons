//Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//Вывести название каждой планеты и количество его повторений в списке.


package ru.example;

import java.util.*;
public class Main {


    public static String[] removeDuplicates(String[] arr) { //Удаляем повторы
        Set<String> set = new HashSet<String>(Arrays.asList(arr));
        String[] result = set.toArray(new String[set.size()]);
        return result;
    }

    public static void main(String[] args) {
        String[] arr = {"Сатурн", "Юпитер", "Сатурн", "Венера", "Уран", "Земля", "Марс", "Марс", "Марс"};
        String[] new_arr = removeDuplicates(arr);
        List result = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < new_arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (new_arr[i].equals(arr[j])) {
                    count++;
                }
            }
            result.add(new_arr[i] + ":" + count);
            count = 0;
        }

        System.out.println(result);
    }
}