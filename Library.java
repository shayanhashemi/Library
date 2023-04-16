package university.step4;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private final String name;
    private final Book[] books;
    private final ArrayList<Rent> rents;
    private final ArrayList<Person> members;

    public Library(String name, Book[] books) {
        this.name = name;
        this.books = books;
        this.rents = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void rentBook(String bookName) {
        for (Book book : this.books) {
            if (book.getName().equals(bookName)) {
                if (!book.isBorrowed()) {
                    System.out.println("We have " + book.getName() + ", written by " + book.getAuthor() + " in our library. To borrow this book, you must become a member.");
                    addMember();
                    Person person = members.get(members.size() - 1);
                    Rent rent = new Rent(book, person);
                    rents.add(rent);
                    book.setBorrowed(true);
                    return;
                } else {
                    System.out.println("Sorry. The book " + bookName + " by " + book.getAuthor() + " has already been borrowed.");
                    return;
                }
            }
        }
        System.out.println("Sorry. We have no book named " + bookName + " in our library.");
    }

    public void returnBook(String bookName, String personName) {
        for (Rent rent : this.rents) {
            if (rent.getBook().getName().equals(bookName) && rent.getPerson().getName().equals(personName)) {
                Book book = rent.getBook();
                book.setBorrowed(false);
                rents.remove(rent);
                System.out.println("Thanks for returning " + book.getName() + " to our library.");
                return;
            }
        }
        System.out.println("Sorry. " + personName + " did not borrow " + bookName + " from our library.");
    }

    public void addMember() {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name= input.nextLine();
        Scanner input_2=new Scanner(System.in);
        System.out.print("Enter your phone number: ");
        String phoneNumber=input_2.nextLine();


        for (Person person : members) {
            if (person.getName().equals(name)) {
                System.out.println("You are already a member of our library!");
                return;
            }
        }

        Person person = new Person(name, phoneNumber);
        members.add(person);
        System.out.println("Welcome " + person.getName() + "! You are now a member of our library.");
    }

}

