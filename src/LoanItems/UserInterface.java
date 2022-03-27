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
        return in.nextLine();
    }
    public String titleInput(){
        return in.nextLine();
    }
    public void introduceTitle(){
        System.out.print("What is the title?: ");
    }
    public boolean displayExit(){
        System.out.println("Program will now exit");
        return false;
    }
    public void invalidType(){
        System.out.println("That type doesnt exist!");
    }

    public void introduction(){
        System.out.println("Welcome to LoanItems!\nHere are your choices:\n\"book\" to lend a book\n\"video\" to lend a video\n\"exit\" to exit");
    }

    public void displayItemNumber(int itemNumber){
        System.out.printf("Item #%d:\n",
                                   itemNumber);
    }
}