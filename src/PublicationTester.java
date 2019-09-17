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
        Magazine m1 = new Magazine();
        System.out.println(m1);

        // lets declare an array of Publication references (not objects!!)
        Publication[] pubs = new Publication[4];
        pubs[0] = b1;
        pubs[1] = p1;
        pubs[2] = b2;
        pubs[3] = m1;

        for (Publication pub : pubs) {
            // at runtime pub is dynamically bound (dynamic binding) to an
            // actual Magazine or Book object
            System.out.println(pub);
            System.out.println(pub.getClass());
            System.out.println(pub.hashCode());
            System.out.println(pub.generateCopyright());
            System.out.println("*****************************");
        }
    }
}
