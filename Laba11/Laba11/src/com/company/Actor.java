package com.company;

import java.util.ArrayList;
import java.util.List;

public class Actor {
    private String name;

    public Actor(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                '}';
    }
}