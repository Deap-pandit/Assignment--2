import java.util.Scanner;

public class TaxCalculate {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter your income ");
        double income = input.nextDouble();
        System.out.print("are you married(Y/N)");
        String greet = input.next();
        int status;

        if(input.equals("y"))
        {
            status= TaxReturn.MARRIED;

        }
        else {
            status = TaxReturn.SINGLE;
        }

        TaxReturn taxReturn=new TaxReturn(income,status);

        System.out.println("Tax="+ taxReturn.getTax());

    }
}
