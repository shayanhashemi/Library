package university.step4;

import java.util.ArrayList;
import java.util.Date;

public class Book {
    private static int nextID = 1;
    private final String name;
    private final String author;
    private String description;
    private boolean borrowed;
    private final int bookID;

    // Constructor
    public Book(String name, String author, String description) {
        this.name = name;
        this.author = author;
        this.description = description;
        this.borrowed = false;
        this.bookID = nextID;
        nextID++;
    }

    // Method to get book info
    public void bookInfo() {
        System.out.println("id: " + this.bookID + " - name: " + this.name + " - author: " + this.author);
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public int getBookID() {
        return bookID;
    }

}
