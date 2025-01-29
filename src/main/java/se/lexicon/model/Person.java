package se.lexicon.model;
/**
 * This class represents a Person model with properties and methods
 * to manage personal details and interactions with the library system.
 */
public class Person {
    // todo: needs completion

    private int sequencer = 0;
    private int id;

    private String firstName;
    private String lastName;

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
    }

    public int getNextId()
    {
        return 0;
    }

    public void loanBook()
    {
    }

    public void returnBook()
    {
    }

    public String getPersonInformation()
    {
        return null;
    }
}