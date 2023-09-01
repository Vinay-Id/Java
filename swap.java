import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of A ");

        int a = sc.nextInt();
        System.out.println("enter value of B ");
        int b = sc.nextInt();
        System.out.println("value of A before swap is  " + a + " value of B before swap is " + b);
        a = b + a;
        b = a - b;
        a = a - b;
        System.out.println("value of A after swap  is  " + a + " value of after swap B is " + b);
        sc.close();
    }

}
