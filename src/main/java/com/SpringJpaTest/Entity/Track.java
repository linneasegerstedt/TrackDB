package com.SpringJpaTest.Entity;

/**
 * Created by lise on 06/02/2017.
 */
public class Track {

    private int trackId;
    private String title;
    private String artist;

    public Track(int trackId, String title, String artist) {
        this.trackId = trackId;
        this.title = title;
        this.artist = artist;
    }

    public Track() {}

    public int getId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
