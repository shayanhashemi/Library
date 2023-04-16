package university.step4;

import java.util.ArrayList;

public class run {
    public static void main(String[] args) {
        Book[] books = new Book[7];
        books[0] = new Book("The History of Tom Jones, a Foundling ", "Henry Fielding ", "NOVEL");
        books[1] = new Book("Pride and Prejudice", "Jane Austen ", "NOVEL");
        books[2] = new Book(" The Red and the Black ", "Stendhal", "NOVEL");
        books[3] = new Book("Le Pere Goriot", "Honoré de Balzac", "NOVEL");
        books[4] = new Book("David Copperfield", " Charles Dickens ", "NOVEL");
        books[5] = new Book("Madame Bovary", " Gustave Flaubert", "NOVEL");
        books[6] = new Book("Moby-Dick", "Wuthering Heights ", "NOVEL");
        Library new_data = new Library("shayan", books);
        new_data.rentBook("ASARmORAKAB");
        new_data.rentBook("Moby-Dick");
        new_data.rentBook("Moby-Dick");
        new_data.returnBook("aSARmORAKAB", "shayan");
        new_data.returnBook(" The Red and the Black", "shayan");
        new_data.returnBook("Moby-Dick", "amir");
        new_data.returnBook("Moby-Dick", "shayan");
        new_data.addMember();
        for (int i = 0; i <books.length ; i++) {
            System.out.println("the"+i+"book is"+books[i].getName());
        }
        for (Book item: books
             ) {
            System.out.println(item.getName());

        }
        }

    }

