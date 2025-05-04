import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите высоту треугольника");
        Scanner scan = new Scanner(System.in);
        int hight = scan.nextInt();
        for (int a = hight; 1 < a && a <= hight; a--) {
            System.out.print("*");
        }
        System.out.println("*");
        for (int k = 1; k < hight - 1 ; k++) {
            for (int a = 0; a < k; a++) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int r = k +2; r < hight; r++){
                System.out.print(" ");}
            System.out.println("*");
        }
        for (int y = hight - 1; y > 0 ; y--) {
            System.out.print(" ");}
        System.out.println("*");
        for (int a = hight; 1 < a && a <= hight; a--) {
            System.out.print("*");
        }
        System.out.println("*");
        for (int k = 1; k < hight - 1 ; k++) {
            for (int a = 0; a < k; a++) {
                System.out.print(" ");
            }
            for (int d = hight - k; d > 1; d--) {
            System.out.print("*");}
            System.out.println("*");
        }
        for (int r = hight - 1; r > 0 ; r--){
            System.out.print(" ");}
        System.out.println("*");
    }
}
