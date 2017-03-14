package com.lap.classesproject;

import com.lap.classesproject.model.Book;

/**
 * Created by Lenovo on 14.03.2017.
 */
public class MethodsUtils {

    public static void findTheOldestBook(Book[] books) {
        int indexOfTheOldestBook = 0;
        int yearOfTheOldestBook = books[0].getYear();
        for (int i = 0; i < books.length; i++) {
            if (yearOfTheOldestBook > books[i].getYear()) {
                yearOfTheOldestBook = books[i].getYear();
                indexOfTheOldestBook = i;
            }
        }
        System.out.println("Самая старая книга: ");
        System.out.println(books[indexOfTheOldestBook]);
        System.out.print("Авторы: ");
        String[] authorsOfTheOldestBook = books[indexOfTheOldestBook].getAuthors();
        for (int i = 0; i < authorsOfTheOldestBook.length - 1; i++) {
            System.out.print(authorsOfTheOldestBook[i] + ", ");
        }
        System.out.println(authorsOfTheOldestBook[authorsOfTheOldestBook.length - 1]);
        System.out.println("----------------------------------------------------");
    }


    public static void findBooksOfTheAuthor(String author, Book[] books) {
        System.out.println("Книги автора " + author + ": ");
        for (int i = 0; i < books.length; i++) {
            String[] authorsOfThisBook = books[i].getAuthors();
            for (int j = 0; j < authorsOfThisBook.length; j++) {
                if (authorsOfThisBook[j].equals(author)) {
                    System.out.println(books[i]);
                    System.out.println("Название: " + books[i].getTitle());
                }
            }
        }
        System.out.println("----------------------------------------------------");
    }


    public static void findBooksEarlierThenYear(int year, Book[] books) {
        System.out.println("Книги, изданные ранее " + year + " года: ");
        for (int i = 0; i < books.length; i++) {
            if (books[i].getYear() < year) {
                System.out.println(books[i]);
            }
        }
        System.out.println("----------------------------------------------------");
    }


    public static void findBooksOfTheAuthorWithCoauthors(String author, Book[] books) {
        System.out.println("Книги автора " + author + ", написанные в соавторстве с кем-то: ");
        for (int i = 0; i < books.length; i++) {
            String[] authorsOfThisBook = books[i].getAuthors();
            for (int j = 0; j < authorsOfThisBook.length; j++) {
                if (authorsOfThisBook[j].equals(author) && authorsOfThisBook.length > 1) {
                    System.out.println(books[i]);
                }
            }
        }
        System.out.println("----------------------------------------------------");
    }


    public static void findBooksWithTreeOrMoreAuthors(Book[] books) {
        System.out.println("Книги, где 3 и более авторов: ");
        for (int i = 0; i < books.length; i++) {
            String[] authorsOfThisBook = books[i].getAuthors();
            if (authorsOfThisBook.length >= 3) {
                System.out.println(books[i]);
            }
        }
        System.out.println("----------------------------------------------------");
    }
}
