package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Anything that will count the repetition of symptoms and keep them in memory from a data source.
 * The Important part is, the return value from Operation which is a Map with
 * keys String wich contains Symptoms and a Value integer contains occurence of symptom.
 */

public interface ISymptomCounter {

    /**
     **If no data is availaible return an empty map. @return a Map of All Symptoms and The Number Of Each Symptoms.
      * @param symptomsList
     * @return A Map of symptoms associated with the number of repetitions.
     */

    Map<String,Integer> GetTheFrequencyOfSymptoms(List<String>symptomsList);

}
