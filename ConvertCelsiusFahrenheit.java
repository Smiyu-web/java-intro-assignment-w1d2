import java.util.Scanner;

public class ConvertCelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a celsius: ");

        Double celsius = input.nextDouble();

        System.out.println("The fahrenheit is: " + ((9.0 / 5) * celsius + 32));
    }
}
