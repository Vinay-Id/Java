import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");

        int age = sc.nextInt();
        // if (age >= 18) {

        // System.out.println("eligible for vote");
        // } else {
        // System.out.println("not eligible for vote");

        // }
        String voteResult = (age >= 18) ? "eligible for vote" : "not eligible for vote";
        System.out.println(voteResult);

    }

}
