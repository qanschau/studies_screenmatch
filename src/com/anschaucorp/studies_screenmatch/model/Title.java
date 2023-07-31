package com.anschaucorp.studies_screenmatch.model;

import com.anschaucorp.studies_screenmatch.exceptions.ConvertStringToYearException;

public class Title implements Comparable<Title>{


    private String title;
    private int releaseYear;
    private int durationInMinutes;
    private boolean addedIntoPlan;
    private double sumOfRates;
    private int totalNumberOfRates;

    public Title(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public Title(TitleOmdb titleOmdb) {
        this.title = titleOmdb.title();
        if (titleOmdb.year().length() > 4){
            throw new ConvertStringToYearException("String year has more than 4 digits!!!!");
        }
        this.releaseYear = Integer.valueOf(titleOmdb.year());
        this.durationInMinutes = Integer.valueOf(titleOmdb.runtime().substring(0,3).trim());
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setAddedIntoPlan(boolean addedIntoPlan) {
        this.addedIntoPlan = addedIntoPlan;
    }

    public boolean getAddedIntoPlan() {
        return addedIntoPlan;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public double getSumOfRates() {
        return sumOfRates;
    }

    public void rate (double ratingValue){
        sumOfRates += ratingValue;
        totalNumberOfRates++;
    }

    public double avarageRate(){
        return (sumOfRates / totalNumberOfRates);
    }

    public void showTitleData(){
        System.out.println("Title: " + title);
        System.out.println("Relaese Year: " + releaseYear);
        System.out.println(String.format("Rating: %.2f", avarageRate()));
    }

    @Override
    public int compareTo(Title t) {
        return this.getTitle().compareTo(t.getTitle());
    }

    @Override
    public String toString() {
        return "( title: " + title + " |" +
                " releaseYear: " + releaseYear + " |" +
                " duration: " + durationInMinutes+ " )";
    }
}
