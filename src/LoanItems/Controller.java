package LoanItems;

import java.util.ArrayList;

public class Controller {

    UserInterface ui = new UserInterface();
    ArrayList<LoanItem> loanItems = new ArrayList<>();

    public void execute(){
        int numOfItems = ui.numOfItemsInput();
        for (int i = 0, j = 1; i < numOfItems; j++, i++) {
            ui.displayItemNumber(j);
            String typeOfItem = ui.typeOfItemInput();
            String title;
            if (typeOfItem.equals("book")){
                ui.initializeTitleInput();
                title = ui.titleInput();
                loanItems.add(new Book(title,j));
            } else if (typeOfItem.equals("video")){
                ui.initializeTitleInput();
                title = ui.titleInput();
                loanItems.add(new Video(title,j));
            } else {
                ui.invalidType();
                i--; j--;
            }
        }
        System.out.println("LOAN OF ITEMS\n"+loanItems);
    }
}
