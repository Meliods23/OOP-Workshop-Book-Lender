package se.lexicon.model;


import java.util.UUID;

/**
 * This class represents a Book model with properties and methods
 * to manage book-related information and operations.
 */
public class Book {
    // todo: needs completion

    // Generates a random Id for the book
    private final String id = UUID.randomUUID().toString();


    private Person borrower;
    private String title;
    private String author;
    public boolean available = true;

    public Book(String title, String author)
    {
        if(title != null)
        {
            this.title = title;
        }
        if(author != null)
        {
            this.author = author;
        }

    }

    public Book(String title, String author, Person borrower)
    {
        if(title != null)
        {
            this.title = title;
        }
        if(author != null)
        {
            this.author = author;
        }
        if(borrower != null)
        {
            this.borrower = borrower;
            borrower.loanBook(this);
        }

    }


    // Returns info about the book including : Name, Author, Id and lending status
    public String getBookInformation()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Book title: ").append(title + ", ")
                .append("Book author: ").append(author + ", ");

        if (!available)
        {
            sb.append("Borrowed : ").append("Yes, ")
                    .append("Book Id: ").append(id + "\n");
        }
        else
        {
            sb.append("Borrowed : ").append("No, ")
                    .append("Book Id: ").append(id + "\n");
        }


        return sb.toString();
    }

}