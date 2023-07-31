package com.anschaucorp.studies_screenmatch.connection;

import com.anschaucorp.studies_screenmatch.exceptions.ConvertStringToYearException;
import com.anschaucorp.studies_screenmatch.model.Title;
import com.anschaucorp.studies_screenmatch.model.TitleOmdb;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class OmdbSearch {
    private String url;
    private String key;

    public OmdbSearch(String url, String key) {
        this.url = url;
        this.key = key;
    }

    public String getUrl() {
        return url;
    }

    public String getKey() {
        return key;
    }

    public Title searchMovie(String search, Gson gson) {
        Title title = new Title("Error",0000);
        try {
            String url = getUrl().concat("?apikey=").concat(getKey()).concat("&t=").concat(search);
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            var json = response.body();


            TitleOmdb titleOmdb = gson.fromJson(json, TitleOmdb.class);

            if (!titleOmdb.response().equalsIgnoreCase("false")){
                title = new Title(titleOmdb);
            }

            return title;
        } catch (NumberFormatException e) {
            System.out.println("Error!");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Argument Error!");
        } catch (ConvertStringToYearException | IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
        return title;
    }
}
