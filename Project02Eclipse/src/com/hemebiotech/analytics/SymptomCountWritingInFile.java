package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;


public class SymptomCountWritingInFile {

    public SymptomsCounter symptomsCounterToWrite = new SymptomsCounter();

    /**
     * Used to Write the result.out file that counts the number of repetitions of each symptom
     *
     * @return The result.out file where all the symptoms are written in alphabetical order associated with the number of repetitions of each symptom.
     */
    public void GetTheFrequencyOfSymptomInFile() {


        try {
            FileWriter fileWriter = new FileWriter("result.out", false);
            BufferedWriter mywriter = new BufferedWriter(fileWriter);

            Map<String, Integer> symptomMapCount;

            symptomMapCount = symptomsCounterToWrite.GetTheFrequencyOfSymptoms();
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


