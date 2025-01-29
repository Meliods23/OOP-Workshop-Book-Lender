package se.lexicon.model;


/**
 * This class represents a Book model with properties and methods
 * to manage book-related information and operations.
 */
public class Book {
    // todo: needs completion

    private int id;
    private int borrower;

    private String title;
    private String author;

    private boolean available;

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

    public Book(String title, String author, int borrower)
    {
        if(title != null)
        {
            this.title = title;
        }
        if(author != null)
        {
            this.author = author;
        }
        if(borrower != 0)
        {
            this.borrower = borrower;
        }
    }


    public String getBookInformation()
    {

        return null;
    }
}