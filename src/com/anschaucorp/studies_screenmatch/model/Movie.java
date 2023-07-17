package com.anschaucorp.studies_screenmatch.model;

public class Movie {
    private String title;
    private int releaseYear;
    private int durationInMinutes;
    private boolean addedIntoPlan;
    private double sumOfRates;
    private int totalNumberOfRates;

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

    public void setSumOfRates(double sumOfRates) {
        this.sumOfRates = sumOfRates;
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

    public void showMovieData(){
        System.out.println("model.com.anschaucorp.studies_screenmatch.model.Movie Title: " + title);
        System.out.println("Relaese Year: " + releaseYear);
        System.out.println(String.format("Rating: %.2d", avarageRate()));
    }


}
