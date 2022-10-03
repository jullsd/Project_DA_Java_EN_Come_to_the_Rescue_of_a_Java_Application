package com.hemebiotech.analytics;


import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) {

        ISymptomReader readSymptoms = new ReadSymptomDataFromFile("symptoms.txt");

        List<String> symptomsList = readSymptoms.getSymptoms();

        ISymptomCounter symptomsCounter = new SymptomsCounter();

        Map<String, Integer> symptomsCountMap = symptomsCounter.getTheFrequencyOfSymptoms(symptomsList);

        ISymptomWriter writeTheResult = new SymptomsCountWritingInFile("result.out");

        writeTheResult.writeTheFrequencyOfSymptoms(symptomsCountMap);

    }


}
