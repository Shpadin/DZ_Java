package DZ_2;

import java.io.FileWriter;
import java.util.Arrays;

/**
 * task1
 * Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
результат после каждой итерации запишите в лог-файл.
 */
public class task1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int[] arr = {5,5,6,3,9,2,1,4,58,2,1,1,7};
        int max;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    max = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = max;
                }
                sb.append(Arrays.toString(arr)).append("\n");
                try {
                    FileWriter fw = new FileWriter("log_task1.txt", false);
                    fw.write(sb.toString());
                    fw.close();
                } catch (Exception e) {
                    System.out.println("ERROR!");
                }  
            }
        }

    }
}