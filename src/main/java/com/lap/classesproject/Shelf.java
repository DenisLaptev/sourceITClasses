package com.lap.classesproject;

import com.lap.classesproject.model.Book;

/**
 * Created by Lenovo on 17.03.2017.
 */
public class Shelf {
    //Полка содержит массив книг.
    private Book[] books;


    //В конструкторе генерируем массив книг.
    Shelf() {
        books = generate();
    }


    //Методы полки для работы с массивом книг.
    //Методы, которые относятся непосредственно к книге будут в классе Book.
    private Book[] generate() {
        Book[] books = new Book[5];

        String[] authors0 = {"Author0"};
        books[0] = new Book("Title0", authors0, "Edition0", 2000);
        //Можно было в конструкторе написать:
        //public Book(String title, String edition, int year, String... authors) {

        String[] authors1 = {"Author0", "Author1"};
        books[1] = new Book("Title1", authors1, "Edition1", 2001);

        String[] authors2 = {"Author0", "Author1", "Author2"};
        books[2] = new Book("Title2", authors2, "Edition2", 2002);

        String[] authors3 = {"Author0", "Author1", "Author2", "Author3"};
        books[3] = new Book("Title3", authors3, "Edition3", 2003);

        String[] authors4 = {"Author0", "Author1", "Author2", "Author3", "Author4"};
        books[4] = new Book("Title4", authors4, "Edition4", 2004);

        return books;
    }


    public void findTheOldestBook() {
        int indexOfTheOldestBook = 0;
        int yearOfTheOldestBook = books[0].getYear();
        for (int i = 0; i < books.length; i++) {
            //if (yearOfTheOldestBook > books[i].getYear()) {
            if (books[i].isOlderThenYear(yearOfTheOldestBook)) {
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


    public void findBooksOfTheAuthor(String author) {
        System.out.println("Книги автора " + author + ": ");
        for (int i = 0; i < books.length; i++) {
            if (books[i].hasThisAuthor(author)) {
                System.out.println(books[i]);
                System.out.println("Название: " + books[i].getTitle());
            }
        }
        System.out.println("----------------------------------------------------");
    }


    public void findBooksEarlierThenYear(int year) {
        System.out.println("Книги, изданные ранее " + year + " года: ");
        for (int i = 0; i < books.length; i++) {
            //if (books[i].getYear() < year) {
            if (books[i].isOlderThenYear(year)) {
                System.out.println(books[i]);
            }
        }
        System.out.println("----------------------------------------------------");
    }


    public void findBooksOfTheAuthorWithCoauthors(String author) {
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


    public void findBooksWithTreeOrMoreAuthors() {
        System.out.println("Книги, где 3 и более авторов: ");
        for (int i = 0; i < books.length; i++) {
            if (books[i].hasTreeOrMoreAuthors()) {
                System.out.println(books[i]);
            }
        }
        System.out.println("----------------------------------------------------");
    }
}
