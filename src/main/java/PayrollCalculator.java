import java.util.*;

public class PayrollCalculator {

    public static void main(String[] args) {
        System.out.print("What is your name? "); // read name
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("how many hours did you work?? "); // read hrs worked
        int hours = scanner.nextInt();
        System.out.print("What is your hourly pay rate?"); // read pay_rate
        float pay_rate = scanner.nextFloat();
        float gross_pay = pay_rate * hours;
        System.out.println("name = " + name + " and gross_pay = " + gross_pay);
    }
}
