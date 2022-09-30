package com.hemebiotech.analytics;


public class Application {

    public static void main(String[] args) {


        SymptomCountWritingInFile resultOfSymptomCount = new SymptomCountWritingInFile();

        resultOfSymptomCount.GetTheFrequencyOfSymptomInFile();

        System.out.println("The file : Result.out with the number of repetition of each symptom has been created");
    }


}
