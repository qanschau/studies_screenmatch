package com.anschaucorp.studies_screenmatch.calculation;

import com.anschaucorp.studies_screenmatch.model.Title;

public class TimeCalculation {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

//    public void add(Movie movie){
//        this.totalTime += movie.getDurationInMinutes();
//    }
//
//    public void add(Series series){
//        this.totalTime += series.getDurationInMinutes();
//    }

    public void add(Title title){
        this.totalTime += title.getDurationInMinutes();
    }

}
