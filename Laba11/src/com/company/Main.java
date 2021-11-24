package com.company;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        DataBase db = new DataBase();

        Movie movie1 = new Movie("Один дома");
        Movie movie2 = new Movie("Гарри Поттер");
        Movie movie3 = new Movie("Иллюзия обмана 2");
        Movie movie4 = new Movie("Веном 2");
        Movie movie5 = new Movie("Пираты Карибского моря");
        Movie movie6 = new Movie("Алиса в Зазеркалье");

        Actor actor1 = new Actor("Калкин");
        Actor actor2 = new Actor("Эмма Уотсон");
        Actor actor3 = new Actor("Дэниель Рэдклифф");
        Actor actor4 = new Actor("Вуди Харрельсон");
        Actor actor5 = new Actor("Марк Руффало");
        Actor actor6 = new Actor("Том Харди");
        Actor actor7 = new Actor("Наоми Харрис");
        Actor actor8 = new Actor("Джонни Депп");
        Actor actor9 = new Actor("Энн Хэтэуей");
        Actor actor10 = new Actor("Алан Рикман");
        Actor actor11 = new Actor("Джейсон Стейтем");
        Actor actor12 = new Actor("Бред Питт");

        db.addMovie(movie1);
        db.addMovie(movie2);
        db.addMovie(movie3);
        db.addMovie(movie4);
        db.addMovie(movie5);
        db.addMovie(movie6);

        db.addActor(actor1);
        db.addActor(actor2);
        db.addActor(actor3);
        db.addActor(actor4);
        db.addActor(actor5);
        db.addActor(actor6);
        db.addActor(actor7);
        db.addActor(actor8);
        db.addActor(actor9);
        db.addActor(actor10);
        db.addActor(actor11);
        db.addActor(actor12);

        movie1.addActor(actor1);
        movie2.addActor(actor2);
        movie2.addActor(actor3);
        movie3.addActor(actor3);
        movie3.addActor(actor4);
        movie3.addActor(actor5);
        movie3.addActor(actor7);
        movie4.addActor(actor4);
        movie4.addActor(actor6);
        movie4.addActor(actor7);
        movie5.addActor(actor7);
        movie5.addActor(actor8);
        movie6.addActor(actor8);
        movie6.addActor(actor9);
        movie6.addActor(actor10);

       // Map<Actor, Movie> map = new HashMap<Actor, Movie>();
        Map<Actor, HashSet<Movie>> map = new HashMap<Actor, HashSet<Movie>>();

        map.put(actor1, (HashSet<Movie>) movie1);
        map.put(actor2, (HashSet<Movie>) movie2);
        map.put(actor3, (HashSet<Movie>) movie2);
        map.put(actor3, (HashSet<Movie>) movie3);
        map.put(actor4, (HashSet<Movie>) movie3);
        map.put(actor4, (HashSet<Movie>) movie4);
        map.put(actor5, (HashSet<Movie>) movie3);
        map.put(actor6, (HashSet<Movie>) movie4);
        map.put(actor7, (HashSet<Movie>) movie3);
        map.put(actor7, (HashSet<Movie>) movie4);
        map.put(actor7, (HashSet<Movie>) movie5);
        map.put(actor8, (HashSet<Movie>) movie5);
        map.put(actor8, (HashSet<Movie>) movie6);
        map.put(actor9, (HashSet<Movie>) movie6);
        map.put(actor10, (HashSet<Movie>) movie6);

        System.out.println(map.entrySet());

//
//        System.out.println(db.noMovie());
//        System.out.println(db.getActorsWhoWorkTogether(actor4));
//           System.out.println(db.getMoviesWithTheLargestNumberOfActors());
    }
}