package ru.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(1);
        list.add("hello");
        list.add(null);

        System.out.println(list);
    }
}