package com.manisha.csv.parser;

import java.io.*;
import com.opencsv.CSVWriter;

public class MainClass {

    public static void main(String[] args) {
        try{
            read();
        }
        catch(Exception e){
            System.out.println("Exception " + e);
        }
    }

    public static void read() throws IOException, FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("filePath"));
        FileWriter writer = new FileWriter("OutputfilePath");
        CSVWriter csvWriter = new CSVWriter(writer);
        while(reader.readLine() != null) {
            String row = reader.readLine();
            String[] data = row.split(",");
            csvWriter.writeNext(data);
        }
        csvWriter.close();
        reader.close();
    }
}
