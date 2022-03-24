package LoanItems;

import java.util.Scanner;

public class UserInterface {

    Scanner in = new Scanner(System.in);

    public int numOfItemsInput(){
        System.out.print("How many items do you want to lend?: ");
        return in.nextInt();
    }
    public String typeOfItemInput(){
        System.out.print("What type of item?: ");
        return in.next();
    }
    public String titleInput(){
        return in.nextLine();
    }
    public void initializeTitleInput(){
        System.out.print("What is the title?: ");
    }
    public void invalidType(){
        System.out.println("That type doesnt exist!");
    }

    public void displayItemNumber(int itemNumber){
        System.out.printf("Item #%d:\n",
                                   itemNumber);
    }
}