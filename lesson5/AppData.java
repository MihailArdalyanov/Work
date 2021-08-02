package lesson5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData() {
    }

    public void save(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

        }
    }

}