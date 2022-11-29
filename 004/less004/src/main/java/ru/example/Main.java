// Напишите метод, который вернет содержимое текущей папки в виде массива строк.
// Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
// Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения,
//  оно должно записаться в лог-файл.


package ru.example;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {

        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        writer();
        System.out.println(getFiles());
    }

    private static void writer() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("arr_files.txt");
        try {

            ArrayList<String> files = getFiles();

            for (String file : files) {
                file += "\n";
                fileOutputStream.write(file.getBytes());
            }
        } catch (NullPointerException nullPointerException) {
            logger.info("В предыдущем методе файл вернул null");
        }
        fileOutputStream.close();
    }


    public static ArrayList<String> getFiles() {
        File file = new File("../less004/test");
        File[] files = file.listFiles();
        ArrayList<String> names;
        try {
            names = new ArrayList<String>(Arrays.asList(file.list()));
            return names;
        } catch (NullPointerException nullPointerException) {
            logger.warning("Файлы не найдены в этой папке");

        }
        return null;
    }
    
}