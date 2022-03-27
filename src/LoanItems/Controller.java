package LoanItems;

import java.util.ArrayList;
import java.util.Locale;

public class Controller {

    UserInterface ui = new UserInterface();
    ArrayList<LoanItem> loanItems = new ArrayList<>();

    public void execute(){
        boolean programRunning = true;
        int j = 0;
        ui.introduction();

        while (programRunning){
            j++;
            ui.displayItemNumber(j);
            String typeOfItem = ui.typeOfItemInput().toLowerCase(Locale.ROOT);
            switch (typeOfItem){
                case "book" ->{
                    ui.introduceTitle();
                    String bookTitle = ui.titleInput();
                    loanItems.add(new Book(bookTitle,j));
                }
                case "video"->{
                    ui.introduceTitle();
                    String videoTitle = ui.titleInput();
                    loanItems.add(new Video(videoTitle,j));
                }
                case "exit"-> programRunning = ui.displayExit();
                default -> ui.invalidType();
            }
        }
        if (loanItems.size() > 0){
            System.out.println("LOAN OF ITEMS\n"+loanItems);
        }
    }
}