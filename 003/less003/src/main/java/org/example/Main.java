// метод, который составит строку, состоящую из 100 повторений слова ТЕST
package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    private static String Repetitions(String str) {

        StringBuilder repetitions = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            repetitions.append(str);
        }
        return repetitions.toString();
    }

    public static void AddFile (String str){
        try (FileWriter writer = new FileWriter("test.txt", false)) {
            String text = Repetitions(str);
            writer.write(text);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
       String str = "TEST";
       AddFile(str);
    }
}