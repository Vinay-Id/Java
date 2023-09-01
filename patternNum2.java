public class patternNum2 {
    public static void main(String[] args) {
        int num=1;
        for (int i = 1; i <= 6; i++) {
             for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
                for (int k = 1; k <i; k++) {
                System.out.print(num+" ");
                num++;
            }

            System.out.println();
        }
    }

     
}
