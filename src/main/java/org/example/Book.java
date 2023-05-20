package org.example;

public class Book {
    public String name;
    public String author;
    public int year;
    public int rating;
    public String text;

    public Book(String name, String author, int year, int rating, String text){
        this.name = name;
        this.author = author;
        this.year = year;
        this.rating = rating;
        this.text = text;
    }
    public Book(String name, String author, int year){
        this(name,author,year,3," ");
    }

    public int up() {
        if (rating < 5) {
            this.rating++;
        }
        return rating;
    }
    public void down() {
        if (rating > 0) {
            this.rating--;
        }
    }

    public void append(String addText) {
        this.text += addText;

    }

    public String ToString(){
        return "[" + rating + "] "  + name + " " + author + " " + "(" + year + ")" + " " + text;
    }



}
