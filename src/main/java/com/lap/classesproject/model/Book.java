package com.lap.classesproject.model;

import java.util.Arrays;

/**
 * Created by Lenovo on 14.03.2017.
 */
public class Book {

    private String title;
    private String[] authors;
    private String edition;
    private int year;

    public Book(String title, String[] authors, String edition, int year) {
        setTitle(title);
        setAuthors(authors);
        setEdition(edition);
        setYear(year);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title +
                ", authors=" + Arrays.toString(authors) +
                ", edition='" + edition +
                ", year=" + year +
                '}';
    }

    //Методы, относящиеся непосредственно к книге.
    public boolean isOlderThenYear(int year) {
        return this.year < year;
    }

    public boolean hasThisAuthor(String human) {

        for (int j = 0; j < authors.length; j++) {
            if (authors[j].equals(human)) {
                return true;
                //Если данный человек является автором, то мы возвращаем true
                //и выходим из метода.
            }
        }
        return false;
        //Если данный человек не встретился в цикле, то мы дошли до этой строчки.
        //Возвращаем false и выходим из метода.
    }

    public boolean hasTreeOrMoreAuthors() {
        return (authors.length >= 3);
    }
}
