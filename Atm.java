import java.util.Scanner;

class Atm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter initial amount: ");
        int balance = scanner.nextInt();  
        
        System.out.println("Total balance = " + balance);
        
        System.out.print("Enter amount to withdraw: ");
        int withdrawAmount = scanner.nextInt();
        
        if (balance - withdrawAmount < 100) {
            System.out.println("You reached the minimum balance, cannot withdraw this amount.");
        } else {
            balance -= withdrawAmount;  
            System.out.println("Withdrawal successful. Your new balance is: " + balance);
        }
        
        System.out.print("Do you want to check your balance (y/n)? ");
        char checkBalance = scanner.next().charAt(0);

        if (checkBalance == 'y' || checkBalance == 'Y') {
            System.out.println("Your balance is: " + balance);
        } else {
            System.out.println("Thank you for visiting the ATM!");
        }
        scanner.close();
    }
}
