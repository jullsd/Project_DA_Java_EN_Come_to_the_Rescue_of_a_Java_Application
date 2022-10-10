package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;


public class SymptomsCountWritingInFile implements ISymptomWriter {

    private String filepath;

    public SymptomsCountWritingInFile(String filepath) {
        this.filepath = filepath;
    }

    /**
     *
     * @param symptomMapCount A Map of symptoms associated with the number of repetitions.
     *  use to write the frequency of symptoms in a fileg
     */
    @Override
    public void writeTheFrequencyOfSymptoms(Map<String, Integer> symptomMapCount) {

        try {

            FileWriter fileWriter = new FileWriter(filepath, false);
            BufferedWriter mywriter = new BufferedWriter(fileWriter);


            for (Map.Entry<String, Integer> entry : symptomMapCount.entrySet()) {


                mywriter.write(entry.getKey());
                mywriter.write(" : " + entry.getValue().toString());

                mywriter.newLine();

            }
            mywriter.close();


        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error");

        }

    }
}



