import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        String[][] numbers = new String[10][7];// массив для изображений цифр
        numbers[0][0] = "  ***  ";
        numbers[0][1] = " *   * ";
        numbers[0][2] = "*     *";
        numbers[0][3] = "*     *";
        numbers[0][4] = "*     *";
        numbers[0][5] = " *   * ";
        numbers[0][6] = "  ***  ";
        numbers[1][0] = " * ";
        numbers[1][1] = "** ";
        numbers[1][2] = numbers[1][3] = numbers[1][4] = numbers[1][5] = " * ";
        numbers[1][6] = "***";
        numbers[2][0] = " *** ";
        numbers[2][1] = "*   *";
        numbers[2][2] = "*  * ";
        numbers[2][3] = "  *  ";
        numbers[2][4] = " *   ";
        numbers[2][5] = "*    ";
        numbers[2][6] = "*****";
        numbers[3][0] = " *** ";
        numbers[3][1] = "*   *";
        numbers[3][2] = "    *";
        numbers[3][3] = " *** ";
        numbers[3][4] = "    *";
        numbers[3][5] = "*   *";
        numbers[3][6] = " *** ";
        numbers[4][0] = "    * ";
        numbers[4][1] = "   ** ";
        numbers[4][2] = "  * * ";
        numbers[4][3] = " *  * ";
        numbers[4][4] = "******";
        numbers[4][5] = "    * ";
        numbers[4][6] = "    * ";
        numbers[5][0] = "*****";
        numbers[5][1] = "*    ";
        numbers[5][2] = "*    ";
        numbers[5][3] = "**** ";
        numbers[5][4] = "    *";
        numbers[5][5] = "*   *";
        numbers[5][6] = " *** ";
        numbers[6][0] = " *** ";
        numbers[6][1] = "*   *";
        numbers[6][2] = "*    ";
        numbers[6][3] = "**** ";
        numbers[6][4] = "*   *";
        numbers[6][5] = "*   *";
        numbers[6][6] = " *** ";
        numbers[7][0] = "*****";
        numbers[7][1] = "    *";
        numbers[7][2] = "   * ";
        numbers[7][3] = "  *  ";
        numbers[7][4] = " *   ";
        numbers[7][5] = "*    ";
        numbers[7][6] = "*    ";
        numbers[8][0] = " *** ";
        numbers[8][1] = "*   *";
        numbers[8][2] = "*   *";
        numbers[8][3] = " *** ";
        numbers[8][4] = "*   *";
        numbers[8][5] = "*   *";
        numbers[8][6] = " *** ";
        numbers[9][0] = " *** ";
        numbers[9][1] = "*   *";
        numbers[9][2] = "*   *";
        numbers[9][3] = " ****";
        numbers[9][4] = "    *";
        numbers[9][5] = "*   *";
        numbers[9][6] = " *** ";
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scan.nextInt();
        int numL = (int) Math.log10(number) + 1;
        int[] numerals = new int[numL];// массив для введённого числа
        for (int i = numL - 1; i >= 0; i--) {
            numerals[i] = number % 10;
            number = number / 10;
        }
        for (int a = 0; a < 7; a++) { // цикл = высоте цифр
            for (int i = 0; i < numL; i++) { //цикл = количеству цифр
                System.out.print(numbers[numerals[i]][a] + "  ");
            }
            System.out.println();
        }
    }
    }
