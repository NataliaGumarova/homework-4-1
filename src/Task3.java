import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите высоту треугольника");
        Scanner scan = new Scanner(System.in);
        int hight = scan.nextInt();
        for (int w = hight * 2 - 1; w >= 1; w = w - 2) {
            if (w == 1){
                System.out.print(" ");
                for (int a = 0; a < hight * 2 - 1; a++) {
                    System.out.print("*");
                }
                break;
            }
            for (int a = 0; a < w; a = a + 2) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int a = w + 2; a < hight * 2; a = a + 1) {
             System.out.print(" ");
             if (a >= hight*2 - 1 ) {
                 System.out.print("*");
             }
            }
        System.out.println(" ");

        }
        System.out.println(" ");
        for (int w = hight * 2 - 1; w >= 0; w = w - 2) {
            for (int a = 0; a < w; a = a + 2) {
                System.out.print(" ");
            }
            for (int a = w; a < hight * 2; a = a + 1) {
                System.out.print("*");
            }
            System.out.println(" ");}
    }
}
