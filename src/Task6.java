import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество ступенек");
        int step = scan.nextInt();
        for(int i = 1; i <= step; i++) {
                int s = 4*i -4 ;
                while (s > 0) {
                    System.out.print(" ");
                    s -= 2;
            }
            for (int a = 0; a <=2; a++) {
                System.out.print("*");
            }
            for (int a = 0; a <=1; a++) {
                System.out.println();
            }
            int s1 = 4*i-4;
            while (s1 > 0) {
                System.out.print(" ");
                s1 -= 2;
            }
            if (i < step) {
                System.out.print("  ");
                System.out.println("*");
                System.out.println(" ");
            }
        }
    }
}
