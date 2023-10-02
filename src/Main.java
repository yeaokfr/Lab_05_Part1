import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tax = 0.02;
        System.out.println("How much does your item cost?");
        int itemPrice = scan.nextInt();
        double total = (double)itemPrice * tax;
        if (itemPrice <= 100) {
            System.out.println("Your total cost is: $" + ((double)itemPrice + total));
        } else {
            System.out.println("Your total cost is: $" + itemPrice);
        }

    }
}