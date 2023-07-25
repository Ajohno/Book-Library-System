import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Inventory {

    //Fields

    //Store the ISBN and the respective books
    private HashMap<Integer, Book> bookMap = new HashMap<>();
    //Store a list of the registered users
    private List<User> listOfUsers;

    //Constructor
    public Inventory(HashMap<Integer, Book> bookMap, List<User> listOfUsers){

        this.bookMap = bookMap;
        this.listOfUsers = listOfUsers;
    }

    //Getters

    public HashMap<Integer, Book> getBookMap() {
        return bookMap;
    }

    public List<User> getListOfUsers() {
        return listOfUsers;
    }

    //Setters

    public void setBookMap(HashMap<Integer, Book> bookMap) {
        this.bookMap = bookMap;
    }

    public void setListOfUsers(List<User> listOfUsers) {
        this.listOfUsers = listOfUsers;
    }

    /**
     *
     * @return
     */
    public Book makeNewBook(){
        return new Book(makeNewBook().getISBN(), makeNewBook().getTitle(), makeNewBook().getAuthor(), makeNewBook().getPublish_date(), makeNewBook().getNumber_of_pages());
    }

    /**
     * Make a new book
     * @return newBook
     */
    public Book addNewBook() {

        Scanner scanner = new Scanner(System.in);
        String input;

        //New book
        Book newBook = new Book();

        //Date for new book
        int[] newDate = {0,0,0};


        //Take in the ISBN
        System.out.print("Enter ISBN: ");
        newBook.setISBN(Integer.parseInt(scanner.nextLine()));
        System.out.println("");

        //Take in the book title
        System.out.print("Enter title:");
        newBook.setTitle(scanner.nextLine());
        System.out.println("");

        //Take in the book author
        System.out.print("Enter author name: ");
        newBook.setAuthor(scanner.nextLine());
        System.out.println("");

        //Take in the publishing date (mm/dd/yy)
        System.out.println("Format for date (mm/dd/yy)");
        //month
        System.out.print("Enter month of publishing date: ");
        newDate[0] = Integer.parseInt(scanner.nextLine());
        System.out.println("");

        //day
        System.out.print("Enter day of publishing date: ");
        newDate[1] = Integer.parseInt(scanner.nextLine());
        System.out.println("");

        //year
        System.out.print("Enter day of publishing date: ");
        newDate[2] = Integer.parseInt(scanner.nextLine());
        System.out.println("");

        //Date array
        newBook.setPublish_date(newDate);

        //Take in the number of pages
        System.out.print("Enter number of pages: ");
        newBook.setNumber_of_pages(Integer.parseInt(scanner.nextLine()));
        System.out.println("");

        return newBook;
    }

    /**
     *
     * @param book
     */
    public void printBook(Book book){

        //Print ISBN
        System.out.println("ISBN: " + book.getISBN());

        //Print Title
        System.out.println("Title: " + book.getTitle());

        //Print Author
        System.out.println("Author: " + book.getAuthor());

        //Print Publish Date
        System.out.println("Publish Date: " + formatDate(book));

        //Print Number of Pages
        System.out.println("Number of Pages: " + book.getNumber_of_pages());
    }

    /**
     * Format the date of the publishing date in mm/dd/yyyy
     * @param book
     * @return formattedDate
     */
    public String formatDate(Book book){

        int[] date = new int[3];

        date = book.getPublish_date();

        String formattedDate = date[0] + "/" + date[1] + "/" + date[2];

        return  formattedDate;
    }
}
