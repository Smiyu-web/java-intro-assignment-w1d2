import java.util.Scanner;

public class ComputerTheVolumeOfACylinder {

    public static void main(String[] args) {

        final double p = 3.14159;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a radius: ");

        double radius = input.nextDouble();

        System.out.println("Please enter a length: "); 

        double length = input.nextDouble();

        double area = (radius * radius * p);

        double volume = (area * length);

        System.out.println("Area is: " + area + " Volume is: " + volume);

    }
    
}
