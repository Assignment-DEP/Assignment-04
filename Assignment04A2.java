public class Assignment04A2 {
    public static void main(String[] args) {

        int i = 5;
        int k = 2;
        System.out.println("n");

        while (i >= 1 || k <= 5) {
            int j = 0;
            while (j < i) {
                System.out.print("+ ");
                j++;
            }
            System.out.println();
            i--;

            if (i == 0 && k <= 5) {
                int m = 0;
                while (m < k) {
                    System.out.print("+ ");
                    m++;
                }
                System.out.println();
                k++;
            }
        }
    }
}
