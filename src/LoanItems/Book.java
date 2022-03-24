package LoanItems;

public class Book extends LoanItem {

    Book(String title, int itemNumber){
        setTitle(title);
        setItemNumber(itemNumber);
        setType("Book");
    }
}
