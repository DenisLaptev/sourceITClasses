package com.lap.classesproject;

import com.lap.classesproject.model.Book;


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
        //Создаём полку. В ней будет 5 книг. Массив книг создаётся в конструкторе Shelf().
        Shelf shelf = new Shelf();

        shelf.findTheOldestBook();

        shelf.findBooksOfTheAuthor("Author2");

        shelf.findBooksEarlierThenYear(2003);

        shelf.findBooksOfTheAuthorWithCoauthors("Author0");

        shelf.findBooksWithTreeOrMoreAuthors();
    }
}
