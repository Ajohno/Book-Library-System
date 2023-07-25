import java.util.HashMap;
import java.util.List;

public class main {
    public static void main(String[] args) {

        HashMap<Integer, Book> bookMap = new HashMap<>();
        List<User> listOfUsers = null;

        Inventory inventory = new Inventory(bookMap, listOfUsers);

        //Add a new book to the inventory.
        //This makes the new book and adds it to the hashmap.
        bookMap.put(inventory.addNewBook().getISBN(), inventory.addNewBook());

    }


}
