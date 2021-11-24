package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Movie {
    private String name;
    public Movie(String name) {
        this.name = name;
    }

    private Set<Actor> actors = new HashSet<>();

    public void addActor(Actor actor) {
        this.actors.add(actor);
    }

    public Set<Actor> getActors() {
        return this.actors;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
//        return "Movie{" +
//                "name='" + name + '\'' +
//                ", actors=" + actors +
//                '}';
        return name;
    }
}

