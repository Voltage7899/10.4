package com.company;

import java.io.BufferedReader;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws IOException {
        Main main = new Main();
        main.print("src/temp.txt");

    }




    void print(String path) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            }catch (ClassCastException e) {
                System.out.println("nice");
            }

        } else {
            char[] arr = new char[5];
            String[] arr1=new String[5];
            FileReader fileReader = new FileReader(file);
            fileReader.read(arr);
           // BufferedReader bufferedReader=new BufferedReader(fileReader);
           // bufferedReader.
            ArrayList<Character> list = new ArrayList();
            for (int i = 0; i < arr.length; i++) {
              list.add(arr[i]);
            }




            System.out.println(list);
        }


    }
}
