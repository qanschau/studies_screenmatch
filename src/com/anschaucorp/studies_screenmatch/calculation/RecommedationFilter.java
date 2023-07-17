package com.anschaucorp.studies_screenmatch.calculation;

public class RecommedationFilter {

    public void filter(Classification classification){
        if (classification.getClassification() >= 4){
            System.out.println("Clients FIRST option!!!!");
        } else if (classification.getClassification() >= 2){
            System.out.println("Top rated!!");
        } else {
            System.out.println("Add to \"My list\" to see later!");
        }
    }
}
