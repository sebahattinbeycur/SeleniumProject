package Class08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _01_IteratorIntro {
    public static void main(String[] args) {
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(10.99);
        doubleList.add(5.56);
        doubleList.add(1.99);
        doubleList.add(107.87);
        doubleList.add(1103.00);
        doubleList.add(99.99);

        System.out.println("doubleList = " + doubleList);
        System.out.println("doubleList.get(2) = " + doubleList.get(2));

        System.out.println("==== for loop ====");
        for (int i = 0; i < doubleList.size(); i++) {
//            System.out.println(doubleList.get(i));
            System.out.println(doubleList.get(i).intValue());
        }
        System.out.println("==== Enhanced Loop ====");
        for (double dlist : doubleList){
            System.out.println(dlist);
        }
        System.out.println("==== Iterator Loop ====");
        Iterator<Double> doubleIterator = doubleList.listIterator();
        while (doubleIterator.hasNext()){
            System.out.println(doubleIterator.next());
        }
    }
}
