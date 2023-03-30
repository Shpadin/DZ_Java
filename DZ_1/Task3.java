// Реализовать простой калькулятор (+ - / *)
package DZ_Java.DZ_1;

import java.util.Scanner;

/**
 * Task3
 */
public class Task3 {

    public static void main(String[] args) {
        System.out.println("Введите первоео число");
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        System.out.println("Введите второе число");
        int num2 = s.nextInt();
        System.out.println("Введите оператор: ");
        String myOper = s.nextLine();
        int sum = num1+num2;
        System.out.println("сложениение");
        System.out.println(sum);
        int mult = num1*num2;
        System.out.println("Произведение");
        System.out.println(mult);
        int razn = num1-num2;
        System.out.println("Разность");
        System.out.println(razn);
        float delit = num1/num2;
        System.out.println("деление");
        System.out.print(delit);
        
        

    }
}