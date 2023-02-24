public class Book {
    // book properties
    private String title, author, ISBN, publicationDate;
    private int numberOfPages;
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
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
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
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public String getPublicationDate() {
        return publicationDate;
    }

    // methods for checking publication status and book type
    public String checkPublication() {
        int currentYear = 2003;
        String a = "Recent Publication";
        String b = "Old Publication";
        if (Integer.parseInt(publicationDate) > (currentYear - 5)) {
            return a;
        } else {
            return b;
        }
    }
    public String typeOfBook() {
        String a = "Long";
        String b = "Short";
        if (numberOfPages > 500) {
            return a;
        } else {
            return b;
        }
    }
    public static class Main {
        public static void main(String[] books) {
            //creating book objects
            Book book1 = new Book();
            Book book2 = new Book();


            // setting book1 properties
            book1.setTitle("No Sweetness Here");
            book1.setAuthor("Ama Atta Aidoo");
            book1.setISBN("9781558616202");
            book1.setNumberOfPages(530);
            book1.setPublicationDate("2000");

            // setting book2 properties
            book2.setTitle("The Pragmatic Programmer");
            book2.setAuthor("Daniel Green");
            book2.setISBN("9781558616202");
            book2.setNumberOfPages(320);
            book2.setPublicationDate("2021");

            //Display book1 details
            System.out.println("Book 2" + "Title: " + book1.getTitle() + "\n" +
                    "Author: " + book1.getAuthor() +"\n" +
                    "ISBN: " + book1.getISBN() +"\n" +
                    "Pages: " + book1.getNumberOfPages() +", Type: "+book1.typeOfBook()+"\n" +
                    "Publication Date: " + book1.getPublicationDate() + ", Status: " + book1.checkPublication()+"\n"
            );

            // Display book2 details
            System.out.println("Book 2" + "Title: " + book2.getTitle() + "\n" +
                    "Author: " + book2.getAuthor() +"\n" +
                    "ISBN: " + book2.getISBN() +"\n" +
                    "Pages: " + book2.getNumberOfPages() +", Type: "+book2.typeOfBook()+"\n" +
                    "Publication Date: " + book2.getPublicationDate() + ", Status: " + book2.checkPublication()+"\n"
            );
        }
    }
}

// code is shorter when args constructor is used for setting the class properties
