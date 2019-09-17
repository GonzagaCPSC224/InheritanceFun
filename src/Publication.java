// abstract class: cannot be instantiated
// for example... Publication is too general to ever have
// a Publication object

// we cannot make Publication objects
public abstract class Publication extends Object {

    // fields
    protected String title;
    protected String publisher;
    protected int numPages;
    protected double price;

    // DVC
    public Publication() {
        title = "BLANK TITLE";
        publisher = "BLANK PUBLISHER";
        numPages = 0;
        price = 0.0;
    }

    // EVC
    public Publication(String title, String publisher, int numPages, double price) {
        this.title = title;
        this.publisher = publisher;
        this.numPages = numPages;
        this.price = price;
    }

    @Override
    public String toString() {
        return title + ", " + publisher + ", " + numPages + ", " + price;
    }

    // abstract method
    // that a subclass has to provide an implementation for (unless the subclass is abstract)
    public abstract String generateCopyright();

}
