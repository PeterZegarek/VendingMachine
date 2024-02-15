import java.util.Scanner;

public class VendingMachine{

    /*
     * A large variety of snacks are available for purchase.
• Each snack has a price associated with it.
• The user is welcomed and given usage instructions at the beginning of the transaction.
• The user can pick which snack they want to buy.
• The user can insert as much money as they would like to the machine, and only $1 bills are
accepted.
• Exact change must be given back to the user if they inserted too much money into the machine
after making their purchase.
• The user is asked for confirmation on the transaction before it is carried out, and if the user
decides to cancel the transaction, they are given a full refund.
• The user is given a departure message that makes them feel good about their snack choice.
     */
    public static void main(String args[]){
        System.out.println("Hello! Welcome to our vending machine.");
        System.out.println("You can choose one snack from a selection of different snacks.");
        // will have to include actual names of snacks
        System.out.println("Snacks that we have available: \nxxxx: $$$\nxxxx: $$$\nxxxx: $$$");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the amount of money you would like to insert into the machine. We only accept full dollar amounts.");
        int money = sc.nextInt();


        sc.close();
    }
}