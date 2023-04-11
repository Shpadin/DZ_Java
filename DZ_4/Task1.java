import java.util.LinkedList;
// 1) Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> myLinkList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            myLinkList.add(getRandomNumber());
        }
        System.out.println(myLinkList);

        for (int i = 0; i < 10; i++) {
            System.out.print(myLinkList.getLast() + ", ");
            myLinkList.removeLast();

        }
    }

    public static int getRandomNumber() { //#самый стандартный генератор самых стандартных самых случайных  чисел
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
        
    }
}
