package com.hemebiotech.analytics;


import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class SymptomsCounterSorted implements ISymptomCounter {

    /**
     * @param symptomsList A list of symptoms
     * The important thing is the return which is a TreeMap with
     * the symptoms in alphabetical order associated with their repetitions.
     */
    @Override
    public Map<String, Integer> getTheFrequencyOfSymptoms(List<String> symptomsList) {


        Map<String, Integer> counterOfSymptomsMap = new TreeMap<>();


        for (String kSymptomName : symptomsList) {


            counterOfSymptomsMap.putIfAbsent(kSymptomName, 0);
            counterOfSymptomsMap.put(kSymptomName, counterOfSymptomsMap.get(kSymptomName) + 1);


        }
        return counterOfSymptomsMap;
    }
}




