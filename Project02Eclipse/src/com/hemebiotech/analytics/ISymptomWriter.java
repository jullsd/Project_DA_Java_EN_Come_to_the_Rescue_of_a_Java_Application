package com.hemebiotech.analytics;

import java.util.Map;

 /** Anything that will write the frequency of symptoms in data
         */


public interface ISymptomWriter {

     /**
      * @param symptomMapCount A Map of symptoms associated with the number of repetitions.
      *
      * @return Write the Map in the data.
      */


    void GetTheFrequencyOfSymptom(Map<String, Integer> symptomMapCount);


}
