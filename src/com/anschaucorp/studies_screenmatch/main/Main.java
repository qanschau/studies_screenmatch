package com.anschaucorp.studies_screenmatch.main;

import com.anschaucorp.studies_screenmatch.calculation.RecommedationFilter;
import com.anschaucorp.studies_screenmatch.calculation.TimeCalculation;
import com.anschaucorp.studies_screenmatch.model.Episode;
import com.anschaucorp.studies_screenmatch.model.Movie;
import com.anschaucorp.studies_screenmatch.model.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("O poderoso chefão",1970);
        myMovie.setDurationInMinutes(180);
        System.out.println("Duração do filme: " + myMovie.getDurationInMinutes());


        myMovie.rate(8);
        myMovie.rate(5);
        myMovie.rate(10);
        myMovie.showTitleData();
        System.out.println("Total de avaliações: " + myMovie.getSumOfRates());
        System.out.println(myMovie.avarageRate());

        Series lost = new Series("Lost", 2000);
        lost.showTitleData();
        lost.setSessons(10);
        lost.setEpisodesPerSesson(10);
        lost.setMinutesPerEpisode(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDurationInMinutes());

        Movie anotherMovie = new Movie("Avatar", 2023);
        anotherMovie.setDurationInMinutes(200);

        TimeCalculation timeCalculation = new TimeCalculation();
        timeCalculation.add(myMovie);
        timeCalculation.add(anotherMovie);
        timeCalculation.add(lost);
        System.out.println(timeCalculation.getTotalTime());

        RecommedationFilter recommedationFilter = new RecommedationFilter();
        recommedationFilter.filter(myMovie);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setName("Pilot");
        episode.setSeries(lost);
        episode.setTotalVisualization(300);

        recommedationFilter.filter(episode);

        var pauloMovie = new Movie("Dogville", 2003);
        pauloMovie.setDurationInMinutes(200);
        pauloMovie.rate(10);

        ArrayList<Movie> moviesList = new ArrayList<>();
        moviesList.add(pauloMovie);
        moviesList.add(myMovie);
        moviesList.add(anotherMovie);
        System.out.println("List lenght: " + moviesList.size());

        System.out.println("First movie: " + moviesList.get(0).getTitle());

        System.out.println(moviesList);

        for (Movie item : moviesList) {
            System.out.println("Movie Title: " + item.getTitle() );
        }
    }
}
