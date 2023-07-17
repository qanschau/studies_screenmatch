package com.anschaucorp.studies_screenmatch.model;

import com.anschaucorp.studies_screenmatch.calculation.Classification;

public class Episode implements Classification {
    private int number;
    private String name;
    private Series series;
    private int totalVisualization;

    public int getTotalVisualization() {
        return totalVisualization;
    }

    public void setTotalVisualization(int totalVisualization) {
        this.totalVisualization = totalVisualization;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    @Override
    public int getClassification() {
        if (totalVisualization > 100){
            return 4;
        } else {
            return 2;
        }
    }
}
