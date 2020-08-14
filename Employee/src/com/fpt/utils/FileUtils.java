package com.fpt.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class FileUtils<T> {

    public FileUtils() {
    }

    /**
     * Write data into file
     *
     * @param t
     * @param path
     */
    public void writeFile(List<T> t, String path) {
        try {
            FileWriter fileWriter = new FileWriter(path, true);
            try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                for (T e : t) {
                    bufferedWriter.write(e.toString() + "\r\n");
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Open file with notepad of window
     *
     * @param path
     */
    public void openFile(String path) {
        try {
            Runtime.getRuntime().exec("notepad.exe " + path);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
