import java.util.Scanner;

public class FindTheNumberOfYears {

    public static void main(String[] args) {

        final int daysInAYear = 365;

        final int minsPerYear = 525600;

        final int minsPerDay = 1440;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enther how many minutes: ");

        int mins = input.nextInt();

        int year = (mins / minsPerYear);
        int reminder = (mins % minsPerYear);

        int days = (reminder / minsPerDay);

        System.out.println(year + "years and " + days + " days");


    }
    
}
