package com.hemebiotech.analytics;

import java.util.Map;

 /** Anything that will write the frequency of symptoms in data.
  * The important part is to write the map with string and integer in data.
  * The implementation needs to maintain ascending order.
         */


public interface ISymptomWriter {

     /**
      *
      * @param symptomMapCount A Map of symptoms associated with the number of repetitions.
      *
      * @return Write in the data symptoms in alphabetical order with their associated value.
      */


    boolean writeTheFrequencyOfSymptoms(Map<String, Integer> symptomMapCount);


}
