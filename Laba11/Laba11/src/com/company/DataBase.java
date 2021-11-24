package com.company;

import java.util.*;

public class DataBase {

    private Set<Movie> allmovies = new HashSet<>();

    private  Set<Actor> allactors = new HashSet<>();

    public  void addMovie(Movie movie) {
        allmovies.add(movie);
    }

    public  void addActor(Actor actor) {
        allactors.add(actor);
    }

    public  Set<Movie> getMovies() {
        return allmovies;
    }

    public  Set<Actor> getActors() {
        return allactors;
    }

    public  Set<Actor> noMovie() {
        Set<Actor> resultSet = new HashSet<>();

        Iterator actorIterator = getActors().iterator();
        while (actorIterator.hasNext()) {
            Actor actor = (Actor) actorIterator.next();

            Iterator movieIterator = getMovies().iterator();
            boolean flag = false;
            while (movieIterator.hasNext()) {
                Movie movie = (Movie) movieIterator.next();
                if (movie.getActors().contains(actor)) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                resultSet.add(actor);
            }
        }
        return resultSet;
    }


    public Set<Actor> getActorsWhoWorkTogether (Actor actor) {
        Set<Actor> resultSet = new HashSet<>();

        for (Iterator<Movie> movieIterator = allmovies.iterator(); movieIterator.hasNext(); ) {
            Movie someMovie = movieIterator.next();
            if (someMovie.getActors().contains(actor)) {
                for (Iterator<Actor> actorIterator = someMovie.getActors().iterator(); actorIterator.hasNext(); ) {
                    Actor nextActor = actorIterator.next();
                    if (nextActor instanceof Actor) {
                        Actor someActor =  nextActor;
                        if (!(someActor.equals(actor) || resultSet.contains(someActor))) resultSet.add(someActor);
                    }
                }
            }
        }

        return resultSet;
    }


    public Movie getMoviesWithTheLargestNumberOfActors() {
        Movie maxActors = allmovies.get(0);
        for (Movie someMovie : allmovies) {
            if (someMovie.getActors().size() > maxActors.getActors().size()) {
                maxActors = someMovie;
            }
        }
        return maxActors;
    }
}





