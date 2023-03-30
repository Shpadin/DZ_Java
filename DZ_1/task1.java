// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

package DZ_Java.DZ_1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner getNamber = new Scanner(System.in);
        System.out.println("Введите число:   ");
        int number = getNamber.nextInt();
        System.out.println("Вот ваше треугольное число!!!");
        System.out.println(getTreangle(number));
        System.out.println("Вот ваше факториальное число!!!");
        System.out.println(getFactorial(number));

    }
    public static int getTreangle(int n) {
           return (n+1)*n/2;
        }
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
        result = result * i;
        }
           return result;
        }
}

