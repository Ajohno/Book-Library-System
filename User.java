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


    //Getters

    public int getMemberID() {
        return memberID;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int[] getDOB() {
        return DOB;
    }

    public List<Book> getRented_books() {
        return rented_books;
    }

    public boolean getisMember(){
        return isMember;
    }

    //Setters


    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setDOB(int[] DOB) {
        this.DOB = DOB;
    }

    public void setRented_books(List<Book> rented_books) {
        this.rented_books = rented_books;
    }

    public boolean setisMember() {
        return isMember;
    }
}

