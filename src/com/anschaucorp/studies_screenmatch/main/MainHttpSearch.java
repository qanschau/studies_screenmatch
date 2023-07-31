package com.anschaucorp.studies_screenmatch.main;

import com.anschaucorp.studies_screenmatch.connection.OmdbSearch;
import com.anschaucorp.studies_screenmatch.model.Title;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainHttpSearch {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner read = new Scanner(System.in);
        String search = "";

        List<Title> titles = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        System.out.println("************ WELCOME TO MOVIES LIST ************");
        System.out.println("\n>>> IMPORTANT, type \"exit\" to finish the movie search");

        while (true) {

            System.out.println("\nType one movie to search: ");
            search = read.nextLine();

            if (search.equalsIgnoreCase("exit")) {
                break;
            }

            OmdbSearch omdbSearch = new OmdbSearch("http://www.omdbapi.com/", "e2ab1d32");

            var title = omdbSearch.searchMovie(search, gson);

            if (!title.getTitle().equalsIgnoreCase("error")) {
                System.out.println("Converted Title");
                System.out.println(title);
                titles.add(title);
            } else {
                System.out.println("Movie not found!");
            }
        }

        System.out.println(titles);

        FileWriter fileWriter = new FileWriter("movies.json");
        fileWriter.write(gson.toJson(titles));
        fileWriter.close();
        System.out.println("Program end!");

    }
}
