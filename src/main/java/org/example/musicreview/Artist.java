package org.example.musicreview;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private String name;

    private Integer listeners;

    private Integer playCount;

    private String bio;

    private Double rating;

    private String topSong1;

    private String topSong2;

    private String topSong3;

    private String topAlbum;

    private String similarArtist1;

    private String similarArtist2;

    private String similarArtist3;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getListeners() {
        return listeners;
    }

    public void setListeners(Integer listeners) {
        this.listeners = listeners;
    }

    public Integer getPlayCount() {
        return playCount;
    }

    public void setPlayCount(Integer playCount) {
        this.playCount = playCount;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getTopSong1() {
        return topSong1;
    }

    public void setTopSong1(String topSong1) {
        this.topSong1 = topSong1;
    }

    public String getTopSong2() {
        return topSong2;
    }

    public void setTopSong2(String topSong2) {
        this.topSong2 = topSong2;
    }

    public String getTopSong3() {
        return topSong3;
    }

    public void setTopSong3(String topSong3) {
        this.topSong3 = topSong3;
    }

    public String getTopAlbum() {
        return topAlbum;
    }

    public void setTopAlbum(String topAlbum) {
        this.topAlbum = topAlbum;
    }

    public String getSimilarArtist1() {
        return similarArtist1;
    }

    public void setSimilarArtist1(String similarArtist1) {
        this.similarArtist1 = similarArtist1;
    }

    public String getSimilarArtist2() {
        return similarArtist2;
    }

    public void setSimilarArtist2(String similarArtist2) {
        this.similarArtist2 = similarArtist2;
    }

    public String getSimilarArtist3() {
        return similarArtist3;
    }

    public void setSimilarArtist3(String similarArtist3) {
        this.similarArtist3 = similarArtist3;
    }
}
