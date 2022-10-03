package com.hemebiotech.analytics;


import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Simple brute force implementation
 *
 */

public class SymptomsCounter implements ISymptomCounter {


    @Override
    public Map<String, Integer> getTheFrequencyOfSymptoms(List<String> symptomsList) {


        Map<String, Integer> counterOfSymptomsMap = new TreeMap<>();

        for (int x = 0; x < symptomsList.size(); x++) {

            String kSymptomName = symptomsList.get(x);


            counterOfSymptomsMap.putIfAbsent(kSymptomName, 0);
            counterOfSymptomsMap.put(kSymptomName, counterOfSymptomsMap.get(kSymptomName) + 1);


        }
        return counterOfSymptomsMap;
    }
}




