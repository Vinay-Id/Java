public class patternNum {
        public static void main(String[] args) {
            int num =1;
            for (int i = 1; i <= 5; i++) {
                for (int k = 1; k <= i; k++) {
                    System.out.print(num+" ");
                    num++;
                }

                System.out.println();
            }
        }

     
}
