// Вывести все простые числа от 1 до 1000

package DZ_Java.DZ_1;

import java.util.Scanner;

/**
 * tast2
 */
public class tast2 {

    public static void main(String[] args) {
        System.out.println("Введите положительное число до 1000: ");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        boolean b = true;
        for (int i = 2; i <= input; i++) {
            b = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }

            }
            if (b) {
                System.out.println(i);
            }
        }
    }
}