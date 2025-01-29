package se.lexicon;


import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {
        // todo: needs completion
        // Initialize and display Book & Person instances
        // Simulate borrowing a book
        // Simulate returning a book

        Person temp = new Person("Loai", "Alwan");

        Book book00 = new Book("Hello", "World00", temp);
        Book book01 = new Book("Hello", "World01", temp);
        Book book02 = new Book("Hello", "World02", temp);

        System.out.println(temp.getPersonInformation());

        temp.returnBook(book00);

        // Checks if the book was returned correctly
        System.out.println(temp.getPersonInformation());
        System.out.println(book00.getBookInformation());

        // Creates new person and borrows the returned book
        Person temp2 = new Person("Kusai", "Alwan");
        temp2.loanBook(book00);
        System.out.println(temp2.getPersonInformation());


    }

}
