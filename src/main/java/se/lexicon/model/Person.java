package se.lexicon.model;

import java.util.Arrays;
import java.util.UUID;

/**
 * This class represents a Person model with properties and methods
 * to manage personal details and interactions with the library system.
 */
public class Person {
    // todo: needs completion

    private static int sequencer = 0;
    private int id;

    private String firstName;
    private String lastName;

    private Book[] borrowedBooks = new Book[0];

    public Person(String firstName, String lastName)
    {
        if(firstName != null)
        {
            this.firstName = firstName;
        }
        if(lastName != null)
        {
            this.lastName = lastName;
        }

        // I´m guessing this is what the sequencer is for
        this.id = sequencer;
        sequencer++;
    }

    public int getId()
    {
        return this.id;
    }

    public void loanBook(Book book)
    {
        // Checks to see if the book is available
        if (!book.available)
        {
            System.out.println("Book is unavailable!");
            return;
        }


        // Borrows available book and changes it´s status to borrowed
        Book[] temp = borrowedBooks.clone();
        borrowedBooks = new Book[borrowedBooks.length + 1];

        for(int i = 0; i < temp.length; i++)
        {
            borrowedBooks[i] = temp[i];
        }

        borrowedBooks[borrowedBooks.length - 1] = book;
        book.available = false;
    }

    public void returnBook(Book book)
    {
        int indexToRemove = 0;
        boolean found = false;

        // Looks for the book we are returning amongst the borrowed books
        for(int i = 0; i < borrowedBooks.length; i++)
        {
            if(borrowedBooks[i].equals(book))
            {
                indexToRemove = i;
                found = true;
            }
        }


        // If the book is found we return it
        if (found)
        {
            Book[] temp = borrowedBooks.clone();
            borrowedBooks = new Book[borrowedBooks.length - 1];
            int index = 0;

            for(int i = 0; i < temp.length; i++)
            {
                if(i == indexToRemove)
                {
                }
                else
                {
                    borrowedBooks[index] = temp[i];
                    index++;
                }
            }

            book.available = true;
        }

    }

    // Returns information about the person including : Full name, Id and borrowed books
    public String getPersonInformation()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Name : ").append(firstName + " " + lastName + ", " + "Id : " + id + "\n")
                .append("Borrowed Books -->\n");

        for (Book book : borrowedBooks)
        {
            sb.append(book.getBookInformation());
        }


        return sb.toString();
    }
}