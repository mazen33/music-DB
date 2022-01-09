package com.mazen.model;

import java.lang.ref.PhantomReference;

public class Album {
    private int id;
    private String name;
    private int artistId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getartistId() {
        return artistId;
    }

    public void setartistId(int artistId) {
        artistId = artistId;
    }
}
