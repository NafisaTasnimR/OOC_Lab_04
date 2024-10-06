import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

public class Book {

    private String title;
    private String author;
    private String genre;
    private int pages;
    private String dateFinished;

    Book(String title, String author, String genre, int pages, String dateFinished) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pages = pages;
        this.dateFinished = dateFinished;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }

    public String getDateFinished() {
        return dateFinished;
    }

    public String getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }
}

