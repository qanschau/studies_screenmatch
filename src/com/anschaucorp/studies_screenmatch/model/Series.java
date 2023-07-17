package com.anschaucorp.studies_screenmatch.model;

public class Series extends Title{
    private int sessons;
    private boolean active;
    private int episodesPerSesson;
    private int minutesPerEpisode;

    public int getSessons() {
        return sessons;
    }

    public void setSessons(int sessons) {
        this.sessons = sessons;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getEpisodesPerSesson() {
        return episodesPerSesson;
    }

    public void setEpisodesPerSesson(int episodesPerSesson) {
        this.episodesPerSesson = episodesPerSesson;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    @Override
    public int getDurationInMinutes() {
        return (sessons * episodesPerSesson * minutesPerEpisode);
    }
}
