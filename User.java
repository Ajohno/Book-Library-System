import java.util.List;

public class User {

    //Fields
    private int memberID;
    private String first_name;
    private String last_name;
    private int[] DOB;
    private List<Book> rented_books;
    private boolean isMember;

    //Constructor
    public User(int memberID, String first_name, String last_name, int[] DOB, List<Book> rented_books, boolean isMember){

        this.memberID = memberID;
        this.first_name = first_name;
        this.last_name = last_name;
        this.DOB = DOB;
        this.rented_books = rented_books;
        this.isMember = isMember;
    }


}
