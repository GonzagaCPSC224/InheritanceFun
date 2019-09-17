public class PublicationTester {
    public static void main(String[] args) {
        // inheritance: a relationship between two classes
        // where one class includes ("inherits") the state
        // AND behavior of the other class

        // Publication is going to be a super class
        // task: create a Publication class
        // have title, publisher, number of pages, price
        // toString(): return comma separated list fields values
        // DVC and EVC
        // no need for getters and setters

        // make a few Publication objects
//        Publication p1 = new Publication();
//        System.out.println(p1);

        Book b1 = new Book();
        System.out.println(b1);
        Book b2 = new Book("some author");
        System.out.println(b2);

        Publication p1 = b1;
        System.out.println(p1);
        // polymorphism: same code, different behavior
        System.out.println(p1.generateCopyright());

        // task: define a Magazine class that inherits from Publication
        // a Magazine has a publication frequency (e.g. weekly, monthly, ...)
        // toString(), generateCopyright(), DVC, EVC
    }
}
