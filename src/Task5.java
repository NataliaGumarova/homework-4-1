import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите высоту параллелограмма");
        int hight = scan.nextInt();
        for (int i = 0; i <= hight - 1; i++) {
            if (i == 0) { // верхняя линия
                for (int a = 0; a < hight - 1; a++) {
                    System.out.print(" ");
                }
                for (int a = hight - 1; a <= hight * 7 - 2; a++) {
                    System.out.print("*");
                }
                System.out.println("*");
            } else if (i == hight - 1) { // нижняя линия
                for (int a = hight; a <= hight * 7; a++) {
                    System.out.print("*");
                }
            } else {
                    for (int a = i- 1; a < hight - 2; a++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    for (int a = hight; a < hight * 7 - 1; a++) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                }

        }
    }
}
