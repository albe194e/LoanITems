package LoanItems;

abstract public class LoanItem {
    private String type, title;
    private int itemNumber;


    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return String.format("\n--------------\nID    TYPE    TITLE\n%d    %s     %s",itemNumber,type,title);
    }
}