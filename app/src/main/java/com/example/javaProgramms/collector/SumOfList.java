package collector;

import java.util.ArrayList;

public class SumOfList implements InterfaceClass {
    public void call(int num) {
        int sum=0;
        ArrayList list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(8);
        list.add(12);
        list.add(90);
        list.add(13);
        list.add(34);
        list.add(71);
        list.add(6);
        list.add(15);
        list.add(21);
        list.add(111);

        for (int i = 0; i <list.size(); i++) {
            sum = list.get(i).hashCode() + sum;
}
        System.out.println(sum);
    }
}

