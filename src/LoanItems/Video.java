package LoanItems;

public class Video extends LoanItem{

    Video(String title, int itemNumber){
        setTitle(title);
        setType("Video");
        setItemNumber(itemNumber);
    }
}