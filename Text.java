package com.company;

import java.io.*;

public class Text {
    private String fileNameReader = "c:/Users/User/data.txt";
    private String fileNameWriter = "c:/Users/User/result.txt";
    private String textFromFile;

    public String getFileNameReader() {
        return fileNameReader;
    }

    public String getFileNameWriter() {
        return fileNameWriter;
    }

    public String getTextFromFile() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(getFileNameReader()));
            textFromFile = bufferedReader.readLine();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return textFromFile;
    }

    public void setTextToFile(String textToFile) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(getFileNameWriter()));
            bufferedWriter.write(textToFile);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Невозможно записать в файл");
        }
    }
}
