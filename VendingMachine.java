import java.util.InputMismatchException;
import java.util.Scanner;

public class VendingMachine {
    /*
     * Peter Zegarek, Dawit Kasy
     * CSC109 Git Project
     */
    public static void main(String args[]) {
        // welcome message
        System.out.println("Hello! Welcome to our vending machine.");
        System.out.println("You can choose one snack from a selection of different snacks.");
        // print list of snacks
        System.out.println("Snacks that we have available: \n1. Doritos: $2.00\n2. Snickers: $1.50\n3. Pepsi: $4.00\n4. Lemonade: $3.00\n5. Skittles: $3.50");
        //snack values
        double doritos = 2.00;
        double snickers = 1.50;
        double pepsi = 4.00;
        double lemonade = 3.00;
        double skittles = 3.50;
        double change = 0.00;
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Please enter the amount of money you would like to insert into the machine. We only accept full dollar amounts.");
        int money = sc.nextInt();
        

        // if an item is not yet selected, this will loop
        boolean itemSelected = false;
        while (!itemSelected) {
            System.out.println("Please enter what snack you would like based on the associated number");
            int item = sc.nextInt();
            switch (item) {
                case 1:
                    System.out.println("You chose Doritos");
                    change = money - doritos;
                    System.out.println("Your change is:\n$" + change);
                    itemSelected = true;
                    break;
                case 2:
                    System.out.println("You chose Snickers");
                    change = money - snickers;
                    System.out.println("Your change is:\n$" + change);
                    itemSelected = true;
                    break;
                case 3:
                    System.out.println("You chose Pepsi");
                    change = money - pepsi;
                    System.out.println("Your change is:\n$" + change);
                    itemSelected = true;
                    break;
                case 4:
                    System.out.println("You chose Lemonade");
                    change = money - lemonade;
                    System.out.println("Your change is:\n$" + change);
                    itemSelected = true;
                    break;
                case 5:
                    System.out.println("You chose Skittles");
                    change = money - skittles;
                    System.out.println("Your change is:\n$" + change);
                    itemSelected = true;
                    break;
                default:
                    System.out.println("Please choose a valid item. You did not select one.");
            }
        }

        // if not enough money then the transaction automatically gets cancelled
        if (change < 0){
            System.out.println("You did not have enough money to purchase that snack. Cancelling transaction.");
        }
        else {
            // transaction confirmation
            System.out.println("Would you like to confirm your transaction? Type 1 for yes, and 2 for no.");
            int confirmation = sc.nextInt();
            if ( confirmation == 1){
                System.out.println("Thank you for your transaction. You have $" + change + " in change.");
            }else if( confirmation == 2){
                System.out.println("Transaction successfully canceled. Your change is\n" + money);
            }
            System.out.println("Thank you for snacking with us.\nHave a great day.");
        }

        // close scanner
        sc.close();

    }
}