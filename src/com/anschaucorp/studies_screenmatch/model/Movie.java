package com.anschaucorp.studies_screenmatch.model;

import com.anschaucorp.studies_screenmatch.calculation.Classification;

public class Movie extends Title implements Classification {
    private String director;

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public int getClassification() {
        return (int) avarageRate() / 2 ;
    }
}
