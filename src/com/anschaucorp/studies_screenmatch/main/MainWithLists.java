package com.anschaucorp.studies_screenmatch.main;

import com.anschaucorp.studies_screenmatch.model.Movie;
import com.anschaucorp.studies_screenmatch.model.Series;
import com.anschaucorp.studies_screenmatch.model.Title;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MainWithLists {
    public static void main(String[] args) {

        var movieOne = new Movie("O poderoso chefão",1970);
        var movieTwo = new Movie("Avatar", 2023);
        var movieThree = new Movie("Dogville", 2003);
        var seriesOne = new Series("Lost", 2000);

        movieOne.rate(10);
        movieTwo.rate(7.5);
        movieThree.rate(6.4);
        seriesOne.rate(7.8);

        ArrayList<Title> list = new ArrayList<>();

        list.add(movieOne);
        list.add(movieTwo);
        list.add(movieThree);
        list.add(seriesOne);

//        list.forEach(item -> System.out.println(item.getTitle()));
//        list.forEach(System.out::println);

        for (Title item: list) {
            System.out.println(item.getTitle());
            if (item instanceof Movie) {
                Movie movie = (Movie) item;
                System.out.println("Classification: " + movie.getClassification());
            }
            if (item instanceof Movie movie && movie.getClassification() > 3) {
                System.out.println("Classification2: " + movie.getClassification());
            }
        }

        Movie filme1 = new Movie("Avatar", 2009);
        Movie filme2 = filme1;

        if (filme1 == filme2) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }

        ArrayList<String> actorsList = new ArrayList<>();

        actorsList.add("Tom Cruise");
        actorsList.add("Nicole Kidman");
        actorsList.add("Steve Segal");
        actorsList.add("Brad Prit");
        actorsList.add("Adam Sandler");

        System.out.println(actorsList);
        Collections.sort(actorsList);
        System.out.println("Lista ordenada: " + actorsList);

        Collections.sort(list);
        System.out.println(list);
        System.out.println("\nYear sort:");
        list.sort(Comparator.comparing(Title::getReleaseYear));
        System.out.println(list);

    }
}
