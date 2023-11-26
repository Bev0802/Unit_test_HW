package org.example.book;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookService(new InMemoryBookRepository());

        System.out.println(bookService.findAllBooks());

    }
}