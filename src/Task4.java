import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите высоту ромба");
        // высота (длина большей диагонали) ромба для корректного отображения в заданных условиях должна быть нечётным числом
        // в случае ввода чётного числа его значение будет увеличено на 1
        Scanner scan = new Scanner(System.in);
        int hight = scan.nextInt();
        if (hight % 2 == 0) {
            hight = hight + 1;
        }
        // 1 ромб (верх)
        for (int w = hight - 1; w >= 0; w = w - 2) {
            for (int a = 0; a < w; a = a + 2) {
                System.out.print(" ");
            }
            for (int a = w; a < hight; a++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        // 1 ромб(низ)
        for (int w = 0; w <= hight - 2; w = w + 2) {
            System.out.print(" ");
            for (int a = w; a > 0; a = a - 2){
                System.out.print(" ");
            }
            for (int a = hight - 2; a > w; a--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        //2 ромб(верх)
        System.out.println(" ");
        for (int w = hight - 1; w >= 0; w = w - 2) {
            for (int a = 0; a < w; a = a + 2) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int a = w + 2; a < hight; a = a + 1) {
                System.out.print(" ");
                if (a >= hight- 1 ) {
                    System.out.print("*");
                }
            }
            System.out.println(" ");

        }
        // 2 ромб(низ)
        for (int w = 1; w <= hight - 2; w = w + 2) {
            for (int a = w; a > 0; a = a - 2) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int a = hight-2; a >= w + 2; a--) {
                System.out.print(" ");
                if (a == w+ 2) {
                    System.out.println("*");
                }
            }
        }
    }

}