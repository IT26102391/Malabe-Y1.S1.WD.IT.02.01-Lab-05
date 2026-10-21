import java.util.Scanner;

public class IT26102391Lab5Q3 {
    public static void main(String[] args) {

        final double ROOM_CHARGE_PER_DAY = 48000.0;

        int startDate, endDate;
        int numberOfDays;
        double totalAmount;
        double discountRate;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        endDate = input.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
        } 
        else if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
        } 
        else {
            numberOfDays = endDate - startDate;
            totalAmount = numberOfDays * ROOM_CHARGE_PER_DAY;
            discountRate = 0.0;

            if (numberOfDays >= 3 && numberOfDays <= 4) {
                discountRate = 0.10; 
            } else if (numberOfDays >= 5) {
                discountRate = 0.20; 
            }

            totalAmount = totalAmount - (totalAmount * discountRate);

            System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
            System.out.println("Number of Days Reserved: " + numberOfDays);
            System.out.println("Total Amount to be Paid: " + totalAmount);
        }

    }
}