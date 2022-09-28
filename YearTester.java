//assignment-2 ,project-1
import java.util.Scanner;

public class YearTester {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        Year year = new Year();
        System.out.println("Enter the number ");
        int passvalue = input.nextInt();
        year.setYearvalue(passvalue);

        if(year.isLeapYear())
        {
            System.out.println("Leap year ");

        }
        else
        {
            System.out.println("not leap year ");
        }
    }
}
