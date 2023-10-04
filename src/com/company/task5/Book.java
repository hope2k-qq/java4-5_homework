package com.company.task5;

import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private int year;
    private String publisher;
    private String genre;
    private int pageCount;

    public Book() {
        title = "";
        author = "";
        year = 0;
        publisher = "";
        genre = "";
        pageCount = 0;
    }

    public Book(String title, String author, int year, String publisher, String genre, int pageCount) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
        this.pageCount = pageCount;
    }

    public void inputBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter title name: ");
        while (true) {
            title = scanner.nextLine();
            if (title.length() >= 2) {
                break;
            } else {
                System.out.println("Error, title name must contain at least 2 characters.");
            }
        }
        System.out.print("Enter author: ");
        while (true) {
            author = scanner.nextLine();
            if (author.length() >= 3) {
                break;
            } else {
                System.out.println("Error, author must contain at least 3 characters.");
            }
        }
        while(true) {
            try {
                System.out.print("Enter year: ");
                year = scanner.nextInt();
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error, enter correct data!");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        System.out.print("Enter publisher: ");
        while (true) {
            publisher = scanner.nextLine();
            if (publisher.length() >= 1) {
                break;
            } else {
                System.out.println("Error, publisher must contain at least 1 characters.");
            }
        }
        System.out.print("Enter genre: ");
        while (true) {
            genre = scanner.nextLine();
            if (genre.length() >= 2) {
                break;
            } else {
                System.out.println("Error, genre must contain at least 2 characters.");
            }
        }
        while(true) {
            try {
                System.out.print("Enter page count: ");
                pageCount = scanner.nextInt();
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error, enter correct data!");
                scanner.nextLine();
            }
        }
    }

    public void showBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Publisher: " + publisher);
        System.out.println("Genre: " + genre);
        System.out.println("Page count: " + pageCount);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getGenre() {
        return genre;
    }

    public int getPageCount() {
        return pageCount;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
