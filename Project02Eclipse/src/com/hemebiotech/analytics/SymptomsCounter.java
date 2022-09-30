package com.hemebiotech.analytics;


import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Simple brute force implementation
 */

public class SymptomsCounter implements ISymptomCounter {


    List<String> symptomsList;
    /**
     * Used to count and store the number of repetitions of each symptom.
     * @param symptomList A list of all symptoms with possible duplicates.
    */

     /**
     * @return A Map hat stores the symptoms in alphabetical order and the corresponding number of repetition.
     */
    @Override
    public Map<String, Integer> GetTheFrequencyOfSymptoms() {

        ReadSymptomDataFromFile symptomsReader = new ReadSymptomDataFromFile("symptoms.txt");



        symptomsList = symptomsReader.GetSymptoms();

        Map<String, Integer> counterOfSymptomsMap = new TreeMap<>();

        for (int x = 0; x < symptomsList.size(); x++) {

            String kSymptomName = symptomsList.get(x);


            counterOfSymptomsMap.putIfAbsent(kSymptomName, 0);
            counterOfSymptomsMap.put(kSymptomName, counterOfSymptomsMap.get(kSymptomName) + 1);


        }
        return counterOfSymptomsMap;
    }
}




