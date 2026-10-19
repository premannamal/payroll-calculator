import java.util.*;

public class PayrollCalculator {

    public static void main(String[] args) {
        String local_name = getName();
        int local_hours = getHours();
        float local_pay_rate = getPayRate();
        float local_gross_pay = calculateGrossPay(local_pay_rate,local_hours);

        System.out.println("name = " + local_name + " and gross_pay = " + local_gross_pay);
    }

    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? "); // read name
        String name = scanner.nextLine();
        return name;
    }

    public static int getHours() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("how many hours did you work?? "); // read hrs worked
        int hours = scanner.nextInt();
        return hours;
    }

    public static float getPayRate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your hourly pay rate?"); // read pay_rate
        float pay_rate = scanner.nextFloat();
        return pay_rate;
    }

    public static float calculateGrossPay(float pay_rate,int hours) {
        float gross_pay = pay_rate * hours;

        // Overtime_rate = 1.5 * pay_rate; for hours > 40;

        if (hours > 40) {
            gross_pay = pay_rate * 40f + (hours - 40f) * 1.5f * pay_rate;
        }
        return gross_pay;
    }

}