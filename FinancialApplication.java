import java.util.Scanner;

public class FinancialApplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter subtotal: ");

        double subtotal = input.nextDouble();

        System.out.print("Please enter gratuityRate: ");

        double gratuityRate = input.nextDouble();


        double gratuity = subtotal * (gratuityRate / 100);

        System.out.println("The gratuity is: " + gratuity + " The total is: " + (subtotal + gratuity));


    }
}
