package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Anything that will count the frequency of symptoms from a symptom list
 * The important part is the return which is a Map with String associated with Integer
 */

public interface ISymptomCounter {

    /**
     * @param symptomsList A list of symptoms
     * @return A Map of symptoms associated with the number of repetitions.
     */

    Map<String, Integer> getTheFrequencyOfSymptoms(List<String> symptomsList);

}
