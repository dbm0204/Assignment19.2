package com.example.dbm0204.assignment92;

import android.graphics.Bitmap;

import java.util.Date;

/**
 * Created by dbm0204 on 7/10/17.
 */

public class Movie {
    private String MovieName;
    private int    MovieVoteCount;
    private int    MovieId;
    private double Vote_average;
    private Bitmap MoviePoster;
    private Date   first_air_date;
    private float  popularityIdx;
    private int    genreId;
    private int    language;
    private String backdrop_path;
    private String overview;



    public Movie(){}
    public Movie(String movieName, int movieVoteCount, int movieId, double vote_average, Bitmap moviePoster, Date first_air_date, float popularityIdx, int genreId, int language, String backdrop_path, String overview) {
        this.MovieName = movieName;
        this.MovieVoteCount = movieVoteCount;
        this.MovieId = movieId;
        this.Vote_average = vote_average;
        this.MoviePoster = moviePoster;
        this.first_air_date = first_air_date;
        this.popularityIdx = popularityIdx;
        this.genreId = genreId;
        this.language = language;
        this.backdrop_path = backdrop_path;
        this.overview = overview;
    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public int getMovieVoteCount() {
        return MovieVoteCount;
    }

    public void setMovieVoteCount(int movieVoteCount) {
        MovieVoteCount = movieVoteCount;
    }

    public int getMovieId() {
        return MovieId;
    }

    public void setMovieId(int movieId) {
        MovieId = movieId;
    }

    public double getVote_average() {
        return Vote_average;
    }

    public void setVote_average(double vote_average) {
        Vote_average = vote_average;
    }

    public Bitmap getMoviePoster() {
        return MoviePoster;
    }

    public void setMoviePoster(Bitmap moviePoster) {
        MoviePoster = moviePoster;
    }

    public Date getFirst_air_date() {
        return first_air_date;
    }

    public void setFirst_air_date(Date first_air_date) {
        this.first_air_date = first_air_date;
    }

    public float getPopularityIdx() {
        return popularityIdx;
    }

    public void setPopularityIdx(float popularityIdx) {
        this.popularityIdx = popularityIdx;
    }

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    public int getLanguage() {
        return language;
    }

    public void setLanguage(int language) {
        this.language = language;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }
}
