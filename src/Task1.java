import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите высоту треугольника");
        Scanner scan = new Scanner(System.in);
        int hight = scan.nextInt();
        for (int i = 0; i < hight - 1; i++) {
            for (int j = hight -1 - i; j >= 1; j--){
                System.out.print(" ");
            }
            if (i > 0) {System.out.print("*");}
            for (int a = i; 1 < a && a < hight - 1; a--) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int s = 0; s <= hight - 1; s++) {
            System.out.print("*");
        }
        System.out.println(" ");
        for (int k = 0; k <= hight - 1; k++) {
            for (int n = hight - 1 - k; n >= 1; n--){
                System.out.print(" ");
            }
            if (k > 0) {System.out.print("*");}
            for (int a = k; 1 < a && a <= hight - 1; a--) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
