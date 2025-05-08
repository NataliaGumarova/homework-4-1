import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scan.nextInt();
        int sum = 0;
        int t = number;
        while (t > 0) {
            System.out.print(t % 10);
            t = t / 10;
        }

    }
}
