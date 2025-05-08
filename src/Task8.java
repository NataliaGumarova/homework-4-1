import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scan.nextInt();
        int sum = 0;
        int numbers = 0;
        int t = number;
        while (t > 0) {
            sum = sum + t % 10;
            numbers += 1;
            t = t / 10;
        }
        System.out.println("Сумма цифр = " + sum + " , количество цифр в числе = " + numbers);

    }
}
