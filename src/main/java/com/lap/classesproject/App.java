package com.lap.classesproject;

import com.lap.classesproject.model.Book;

import static com.lap.classesproject.MethodsUtils.*;

/**
 * Created by Lenovo on 14.03.2017.
 */
public class App {
    /*
    1. Дан список книг. Книга содержит название, автора и год издания.
    Необходимо: найти самую старую книгу и вывести ее автора;
    найти книгу определенного автора и вывести ее название (или названия);
    найти книги, изданные ранее введенного года и вывести всю информацию по ним.

    1.1* Дополнение к первому заданию - книга дополнительно содержит издательство,
    может содержать нескольких авторов.
    Необходимо: найти книги определенного автора,
    написанные в соавторстве с кем-то (т.е. он не единственный автор книги)
    и вывести всю инфу по ним;
    найти книги, где 3 и более авторов и вывести всю инфу по ним.
    */

    public static void main(String[] args) {
        Book[] books = new Book[5];

        String[] authors0 = {"Author0"};
        books[0] = new Book("Title0", authors0, "Edition0", 2000);

        String[] authors1 = {"Author0", "Author1"};
        books[1] = new Book("Title1", authors1, "Edition1", 2001);

        String[] authors2 = {"Author0", "Author1", "Author2"};
        books[2] = new Book("Title2", authors2, "Edition2", 2002);

        String[] authors3 = {"Author0", "Author1", "Author2", "Author3"};
        books[3] = new Book("Title3", authors3, "Edition3", 2003);

        String[] authors4 = {"Author0", "Author1", "Author2", "Author3", "Author4"};
        books[4] = new Book("Title4", authors4, "Edition4", 2004);

        findTheOldestBook(books);
        findBooksOfTheAuthor("Author2", books);
        findBooksEarlierThenYear(2003, books);
        findBooksOfTheAuthorWithCoauthors("Author0", books);
        findBooksWithTreeOrMoreAuthors(books);

    }
}
