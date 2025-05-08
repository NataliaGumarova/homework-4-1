import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("Введите высоту первого яруса и число ярусов");
        Scanner scan = new Scanner(System.in);
        int hight = scan.nextInt();
        int jar = scan.nextInt();
        for (int i = 0; i < jar; i++) {
            int r = (hight + jar - 1) * 2 -1;// максимальное кол-во пробелов
// (hight +i) * 2 - 1 кол-во пробелов для вершины первого яруса если он расположен с краю
            for (int w = 0; w <= (hight +i) * 2 - 1; w = w + 2) {
                for (int a = r - w; a > 0; a = a - 2) {

                    System.out.print(" ");
                }
                for (int a =(hight +i) * 2 - 1 - w; a < (hight + i) * 2; a = a + 1) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
    }
}
