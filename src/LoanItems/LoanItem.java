package LoanItems;

public abstract class LoanItem {
    private String type, title;
    private int itemNumber;

    LoanItem(String title, int itemNumber){
        this.title = title;
        this.itemNumber = itemNumber;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("\n--------------\nID    TYPE    TITLE\n%d     %s    %s",itemNumber,type,title);
    }
}