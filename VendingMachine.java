import java.util.InputMismatchException;
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
        System.out.println("Snacks that we have available: \n1. Doritos: $2.00\n2. Snickers: $1.50\n3. Pepsi: $4.00\n4. Lemonade: $3.00\n5. Skittles: $3.50");
        double doritos = 2.00;
        double snickers = 1.50;
        double pepsi = 4.00;
        double lemonade = 3.00;
        double skittles = 3.50;
        double change = 0.00;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the amount of money you would like to insert into the machine. We only accept full dollar amounts.");
        int money = sc.nextInt(); 
        System.out.println("Please enter what snack you would like based on the associated number");
        int item = sc.nextInt();
        switch(item){
            case 1:
            System.out.println("You chose Doritos");
            change = money - doritos;
            System.out.println("Your change is:\n$" + change);
        }

        sc.close();
        
    }
}