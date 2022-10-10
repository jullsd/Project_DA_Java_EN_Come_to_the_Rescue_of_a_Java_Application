package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {

    /**
     * This method is used to orchestrate the different actions of our analytical counter
     * List the symptoms from a file,
     * count the symptoms by sorting them and writing the result in a file.
     */

    void orchestratorAnalyticsCounter() {


        ISymptomReader readSymptoms = new ReadSymptomDataFromFile("symptoms.txt");

        ISymptomCounter symptomsCounter = new SymptomsCounterSorted();

        ISymptomWriter writeTheResult = new SymptomsCountWritingInFile("result.out");

        List<String> symptomsList = readSymptoms.getSymptoms();

        Map<String, Integer> symptomsCountMap = symptomsCounter.getTheFrequencyOfSymptoms(symptomsList);

        writeTheResult.writeTheFrequencyOfSymptoms(symptomsCountMap);

    }
}


