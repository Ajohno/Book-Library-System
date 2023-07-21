public class Book {

    //Fields
    private int ISBN;
    private String title;
    private String author;
    private int[] publish_date;
    private int number_of_pages;


    //Constructor
    public Book(int ISBN, String title, String author, int[] publish_date, int number_of_pages ){

        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publish_date = publish_date;
        this.number_of_pages = number_of_pages;

    }

    //Getters

    public int getISBN(){
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int[] getPublish_date() {
        return publish_date;
    }

    public int getNumber_of_pages() {
        return number_of_pages;
    }

    //Setters

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublish_date(int[] publish_date) {
        this.publish_date = publish_date;
    }

    public void setNumber_of_pages(int number_of_pages) {
        this.number_of_pages = number_of_pages;
    }
}
