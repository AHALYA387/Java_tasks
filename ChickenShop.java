import java.util.Scanner;

public class ChickenShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total chicken weight required (in grams): ");
        double totalWeight = scanner.nextDouble();

        double totalKg = totalWeight / 1000.0;

        double chickenWeight = 2.0;  

        int chickensRequired = (int) (totalKg / chickenWeight); 

        double remainder = totalKg % chickenWeight;

        if (remainder > 0) {
            chickensRequired++;
        }

        double totalSoldWeight = chickensRequired * chickenWeight;
        double remainingWeight = totalSoldWeight - totalKg;

        System.out.println("Total weight the user is getting: " + totalKg + " kg");
        System.out.println("Number of chickens required: " + chickensRequired);
        System.out.println("Remaining part of chicken not sold: " + remainingWeight + " kg");
    }
}
