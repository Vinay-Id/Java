import java.util.Scanner;

public class remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dividend");

        int dividend = sc.nextInt();
        System.out.println("divisor");

        int divisor = sc.nextInt();
        int quotiont = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("The Quotient and the remainder after divising is ");
    }
}
