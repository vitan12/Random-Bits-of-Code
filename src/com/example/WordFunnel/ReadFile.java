package com.example.WordFunnel;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;


public class ReadFile {
    private String path;

    public ReadFile (String file_path){
        path = file_path;

    }

    public int readLines() throws IOException{

        FileReader file = new FileReader(path);
        BufferedReader bufffer = new BufferedReader(file);

        String line;
        int totalLines = 0;
        while((line = bufffer.readLine()) != null){
            totalLines ++;
        }

        bufffer.close();

        return totalLines;

    }

    public String[] OpenFile() throws IOException {

        FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);

        int numberOfLines = readLines();
        String[ ] textData = new String[numberOfLines];

        for (int i = 0; i<textData.length; i++){
            textData[i] = textReader.readLine();
        }
        textReader.close();
        return textData;

    }
}
