package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Simple brute force implementation
 *
 */

public class SymptomsCountWritingInFile implements ISymptomWriter {

    private String filepath;

    public SymptomsCountWritingInFile(String filepath) {
        this.filepath = filepath;
    }


    @Override
    public boolean writeTheFrequencyOfSymptoms(Map<String, Integer> symptomMapCount) {

                try {

                FileWriter fileWriter = new FileWriter(filepath, false);
                BufferedWriter mywriter = new BufferedWriter(fileWriter);


                for (Map.Entry<String, Integer> entry : symptomMapCount.entrySet()) {


                    mywriter.write(entry.getKey());
                    mywriter.write(" : " + entry.getValue().toString());

                    mywriter.newLine();

                }
                mywriter.close();
                return true;


            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Error");
                return false;
            }

    }
}



