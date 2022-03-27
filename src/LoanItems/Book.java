package LoanItems;

public class Book extends LoanItem {

    Book(String title, int itemNumber){
        super(title,itemNumber);
        setType("Book");
    }
}
