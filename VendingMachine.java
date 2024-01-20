import java.util.Scanner;
public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        // create vending machine
        // user can choose  the items from the menu options
        // ask person for amount /money
        // the user gets the item only if amount is equal or geater than the item price 
        String willUserContinue = "no";
        do{
            System.out.println("My Vending Machine Menu");
            System.out.println("Press 1 for Item 1 Coke rs.20");
            System.out.println("Press 2 for Item 2 Chocolate rs.30");
            System.out.println("Press 3 for Item 3 Chips rs.50");

            System.out.println("Enter your choice");
            int choice = sc.nextInt();// 
            sc.nextLine();

            int amount = 0;
            switch (choice) {
                case 1:
                    System.out.println("You have selected Item 1 Coke rs.20. Please put In the amount");
                    amount = sc.nextInt();
                    sc.nextLine();
                    break;
                case 2:
                    System.out.println("You have selected Item 2 Chocolate rs.30. Please put In the amount");
                    amount = sc.nextInt();
                    sc.nextLine();
                    break;
                case 3:
                    System.out.println("You have selected Item 3 Chips rs.50. Please put In the amount");
                    amount = sc.nextInt();
                    sc.nextLine();
                    break;
                default:
                    System.out.println("wrong Choice. please try again");
                    break;
            }

            if (amount >= 20 && choice == 1) {
                int change = amount - 20;
                System.out.println("Bought Item 1 Coke rs.20. Collect your remaining amount = "+ change+" enjoy");
            } 
            else if(amount >= 30 && choice == 2){
                int change = amount - 30;
                System.out.println("Bought Item 2 CHocolate rs.30. Collect your remaining amount = "+ change+" enjoy");

            }
            else if(amount >= 50 && choice == 3){
                int change = amount - 50;            
                System.out.println("Bought Item 3 Chips rs.50. Collect your remaining amount = "+ change+" enjoy");

            }
            else {
                System.out.println("amount is insufficient to buy the option selected.  Collect your remaining amount = "+ amount +" enjoy");
            }

            System.out.println("Do you wish too make another purchase. if yes type yes");

            willUserContinue = sc.nextLine();
            // System.out.println("you wish to continue is " + willUserContinue);
        }while(willUserContinue.equals("yes"));

    }
}
