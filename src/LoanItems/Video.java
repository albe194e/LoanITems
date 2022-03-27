package LoanItems;

public class Video extends LoanItem{

    Video(String title, int itemNumber){
        super(title, itemNumber);
        setType("video");
    }
}