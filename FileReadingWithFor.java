package com.derekfdeans;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FileReadingWithFor {
    public static void main(String[] args) {
        String path = "C:\\Users\\kimde\\IdeaProjects\\Java Sandbox\\src\\com\\derekfdeans\\text.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            for (String currentLine = reader.readLine(); currentLine != null;) {
                System.out.println(currentLine);
                currentLine = reader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
