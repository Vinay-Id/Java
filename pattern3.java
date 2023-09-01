public class pattern3 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
