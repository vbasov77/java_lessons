//Напишите метод, который сжимает строку
// Пример: ааааbbbcdd -> a4b3cd2

package org.example;


public class Main {
    // удаляем все повторы в строке
    static String removeDuplicates(String s) {
        StringBuilder noDupes = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String si = s.substring(i, i + 1);
            if (noDupes.indexOf(si) == -1) {
                noDupes.append(si);
            }
        }
        return noDupes.toString();
    }

    // подсчёт количества каждого повторяющегося символа
    private static String Method(String arg) {
        String a = removeDuplicates(arg);
        StringBuilder str = new StringBuilder();
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < arg.length(); j++) {
                if (a.charAt(i) == arg.charAt(j)) {
                    count++;
                }
            }
            str.append(a.charAt(i));
            str.append(count);
            count = 0;
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String str = "ааааbbbcdd";
        System.out.println(Method(str));
    }
}