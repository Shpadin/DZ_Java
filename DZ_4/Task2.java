import java.util.LinkedList;
// 2) Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
public class Task2 {
    
    public static void main(String[] args) {
        LinkedList<Integer> myLinkList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            enqueue(myLinkList, getRandomNumber()); //#генерим самым стандартным генератором самых стандартных самых случайных  чисел
        }
        System.out.println(myLinkList);

        System.out.println(dequeue(myLinkList)); // удалили первый элемент
        System.out.println(myLinkList);

        System.out.println(first(myLinkList)); // принт первый элемент
        System.out.println(myLinkList);
    }

    public static void enqueue(LinkedList<Integer> ll, int num) {// помещает элемент в конец очереди
        ll.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> myLinkList) { // возвращает первый элемент из очереди и удаляет его
        int num = myLinkList.get(0);
        myLinkList.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> myLinkList) { // возвращает первый элемент из очереди, не удаляя
        int num = myLinkList.get(0);
        return num;
    }

    public static int getRandomNumber() { //#самый стандартный генератор самых стандартных самых случайных  чисел
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}
