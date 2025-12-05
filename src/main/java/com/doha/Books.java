/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */package com.doha;

public class Books {
    private int id;
    private String Bookname;
    private String Author;
    private String Genre;
    private String Availability;

    public Books(int id, String Bookname, String Author, String Genre, String Availability) {
        this.id = id;
        this.Bookname = Bookname;
        this.Author = Author;
        this.Genre = Genre;
        this.Availability = Availability;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookname() {
        return Bookname;
    }

    public void setBookname(String Bookname) {
        this.Bookname = Bookname;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public String getAvailability() {
        return Availability;
    }

    public void setAvailability(String Availability) {
        this.Availability = Availability;
    }
   
}
