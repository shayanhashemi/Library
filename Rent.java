package university.step4;

import java.util.Date;

public class Rent {
    private Book book;
    private Person person;
    private Date date;
    private int rentID;
    private static int nextID = 1;

    public Book getBook() {
        return book;
    }

    public Person getPerson() {
        return person;
    }

    public Rent(Book book, Person person) {
        this.book = book;
        this.person = person;
        this.date = date;
        this.rentID = nextID++;
        this.book.setBorrowed(true);
    }

    public String rentInfo() {
        return String.format("id: %d - book: %s - person: %s - date: %s", rentID, book.getName(), person.getName(), date.toString());
    }
}
