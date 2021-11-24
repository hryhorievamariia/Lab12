package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Actor {
    private String name;

    public Actor(String name) {
        this.name = name;
    }


    private Set<Movie> movies = new HashSet<>();

    public void addMovie (Movie movie) {
        this.movies.add(movie);
    }

    public Set<Movie> getMovies() {
        return this.movies;
    }

    public String getName() {
        return this.name;
    }


    @Override
    public String toString() {
//        return "Actor{" +
//                "name='" + name + '\'' +
//                '}';
        return name;
    }
}