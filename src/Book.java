public class Book extends Publication {
    // Book specific fields
    // author... all Books have an author but not all publications have an author
    protected String author;

    // add your constructors
    public Book() {
        super(); // example calling explicitly...
        // implicitly java calls the DVC of the super class
        // a call to the superclass constructor has to be the first executable
        // line of the constructor
        author = "BLANK AUTHOR";
    }

    public Book(String title, String publisher, int numPages, double price, String author) {
        super(title, publisher, numPages, price); // EVC of the super class
        this.author = author;
    }
}
