public class Assignment04A {
    public static void main(String[] args) {
        int a = 0;
        int b = 5;
        int i = 0;
        int j = 2;
        
        while (a++ < b || i++ < j) {
            System.out.print("+ ");
            
            if (a == b) {
                System.out.println();
                a = 0;
                b--;
            }

            if (i == j) {
                if (j < 5) {
                    System.out.println();
                    i = 0;
                    j++;
                }
            }
        }
    }
}
