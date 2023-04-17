import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;

public class Task6 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        noutbookClass nout1 = new noutbookClass("Appel_5", 0101, "Xiaomi");
        nout1.setColor("black");
        nout1.setHDD(1);
        nout1.setOS("Windows");
        nout1.setRAM(32);

        noutbookClass nout2 = new noutbookClass("Appel_3", 0103, "Acer");
        nout2.setColor("white");
        nout2.setHDD(2);
        nout2.setOS("MacOS");
        nout2.setRAM(16);

        noutbookClass nout3 = new noutbookClass("Apple_2", 0102, "XrComp");
        nout3.setColor("ping");
        nout3.setHDD(3);
        nout3.setOS("Windows");
        nout3.setRAM(16);

        noutbookClass nout4 = new noutbookClass("Apple_1", 0101, "hpCOm");
        nout4.setColor("black");
        nout4.setHDD(7);
        nout4.setOS("Linux");
        nout4.setRAM(64);

        noutbookClass nout5 = new noutbookClass("Apple", 0100, "Apple");
        nout5.setColor("silver");
        nout5.setHDD(4);
        nout5.setOS("macOS");
        nout5.setRAM(64);

        HashSet<noutbookClass> nouts = new HashSet<>(Arrays.asList(nout1, nout2, nout3, nout4, nout5));
        HashSet<noutbookClass> res = new HashSet<>();

        System.out.print(
                "Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Object> filters = new HashMap<>();
        while (n != 5) {
            if (n == 1) {
                System.out.println("Введите минимальную оперативную память");
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("RAM", temp);
            }
            if (n == 2) {
                System.out.println("Введите минимальный объем HDD");
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("HDD", temp);
            }
            if (n == 3) {
                System.out.println("Введите ОС");
                String temp = sc.nextLine();
                filters.put("OS", temp);
            }
            if (n == 4) {
                System.out.println("Введите цвет");
                String temp = sc.nextLine();
                filters.put("color", temp);
            }
            System.out.print(
                    "Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
            n = sc.nextInt();
            sc.nextLine();
        }
        for (Entry<String, Object> entry : filters.entrySet()) {
            if (entry.getKey().equals("RAM")) {
                Iterator it = nouts.iterator();
                while (it.hasNext()) {
                    noutbookClass nout = (noutbookClass) it.next();
                    if (nout.getRAM() >= (Integer) entry.getValue()) {
                        res.add(nout);
                    }
                }
            }
            if (entry.getKey().equals("HDD")) {
                Iterator it = nouts.iterator();
                while (it.hasNext()) {
                    noutbookClass nout = (noutbookClass) it.next();
                    if (nout.getHDD() >= (Integer) entry.getValue()) {
                        res.add(nout);
                    }
                }
            }
            if (entry.getKey().equals("OS")) {
                Iterator it = nouts.iterator();
                while (it.hasNext()) {
                    noutbookClass nout = (noutbookClass) it.next();
                    if (nout.getOS().equals(entry.getValue())) {
                        res.add(nout);
                    }
                }
            }
            if (entry.getKey().equals("color")) {
                Iterator it = nouts.iterator();
                while (it.hasNext()) {
                    noutbookClass nout = (noutbookClass) it.next();
                    if (nout.getColor().equals(entry.getValue())) {
                        res.add(nout);
                    }
                }
            }
        }

        Iterator it = res.iterator();
        while (it.hasNext()) {
            noutbookClass nout = (noutbookClass) it.next();
            System.out.println(nout.toString());
            System.out.println();
        }

    }
}