public class Book {
    // book properties
    private String title, author, ISBN;
    private int pageCount;
    private double price;

    // no args constructor
    public Book(){}

    // set methods
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // get methods
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getISBN() {
        return ISBN;
    }
    public int getPageCount() {
        return pageCount;
    }
    public double getPrice() {
        return price;
    }


    public static class Main {
        // creating book objects
        public static void main(String[] books) {

            Book book1 = new Book();
            Book book2 = new Book();
            Book book3 = new Book();

            // setting book3 properties
            book1.setTitle("No Sweetness Here");
            book1.setAuthor("Ama Atta Aidoo");
            book1.setISBN("9781558616202");
            book1.setPageCount(166);
            book1.setPrice(3.99);


            // setting book3 properties
            book2.setTitle("Swimsuit");
            book2.setAuthor("James Patterson");
            book2.setISBN("0446561355");
            book2.setPageCount(400);
            book2.setPrice(11.99);

            // setting book3 properties
            book3.setTitle("The Final Quest");
            book3.setAuthor("Rick Joyner");
            book3.setISBN("192937190X");
            book3.setPageCount(170);
            book3.setPrice(7.99);

            //Display book1 details
            System.out.println("Book 1");
            System.out.println("Title: "+book1.getTitle());
            System.out.println("Author: "+book1.getAuthor());
            System.out.println("ISBN: "+book1.getISBN());
            System.out.println("Pages: "+book1.getPageCount());
            System.out.println("Price: $"+book1.getPrice()+"\n");

            //Display book2 details
            System.out.println("Book 2");
            System.out.println("Title: "+book2.getTitle());
            System.out.println("Author: "+book2.getAuthor());
            System.out.println("ISBN: "+book2.getISBN());
            System.out.println("Pages: "+book2.getPageCount());
            System.out.println("Price: $"+book2.getPrice()+"\n");

            // Display book3 details
            System.out.println("Book 3");
            System.out.println("Title: "+book3.getTitle());
            System.out.println("Author: "+book3.getAuthor());
            System.out.println("ISBN: "+book3.getISBN());
            System.out.println("Pages: "+book3.getPageCount());
            System.out.println("Price: $"+book3.getPrice()+"\n");
        }
    }
}

// code is shorter when args constructor is used for the class


