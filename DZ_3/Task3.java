import java.util.ArrayList;
import java.util.Random;
// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.
public class Task3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> arrlst = new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            arrlst.add(rnd.nextInt(0,10));
        }
        System.out.println(arrlst.toString());
        int max = arrlst.get(0);
        int min = arrlst.get(0);
        int sum = 0;
        for(int i=0;i<arrlst.size();i++){
            if (arrlst.get(i)>max) max = arrlst.get(i);
            if (arrlst.get(i)<min) min = arrlst.get(i);
            sum=sum+arrlst.get(i);
        }
        System.out.printf("MAX = %d",max);
        System.out.printf("; MIN = %d",min);
        System.out.printf("; AVERG = %.1f",((float)sum/arrlst.size()));
      
    }
}
