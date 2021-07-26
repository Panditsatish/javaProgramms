package collector;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindList {
    public static void main(String[] args) {
        FindList f = new FindList();
        ArrayList List = new ArrayList<String>();
        ArrayList ListAdd = new ArrayList<Integer>();
        ListAdd.add(1);
        ListAdd.add(2);
        ListAdd.add(3);
        ListAdd.add(4);
        ListAdd.add(5);
        List.add("satish");
        List.add("suraj");
        List.add("muzamil");
        List.add("Anmol");
        List.add("Riya");
        List.add("Ashish");
        List.add("pushkar");
        List.add("devendra");
        List.add("aman");
        List.add("vishal");
        List.add("ayushi");
        List.add("ayesha");
        ArrayList List1 = new ArrayList<String>();
        List1.add("diwakar");
        List1.add("shubham");
        List1.add("nitin");
        List1.add("kanika");
        List1.add("garima");
        List1.add("akshrita");
        List1.add("sita");
        List1.add("gita");
        List1.add("vishal");
        List1.add("ayushi");
        List1.add("ayesha");

        System.out.println("Required List is : "+f.find(List, "ay"));
        System.out.println("Similar Name in Both List is : "+f.findCom(List, List1));
        System.out.println("Sum of elements of  List is : "+f.listAdd(ListAdd));
        System.out.println("Number of partition in Book is : "+f.partition(123));

    }

    List<String> find(ArrayList<String> List, String str) {
        ArrayList list = new ArrayList<String>();
        for (int i = 0; i < List.size(); i++) {
            if (List.get(i).contains(str)) {
                list.add(List.get(i));
            }
        }
        return list;
    }

    List<String> findCom(ArrayList<String> List, ArrayList<String> List1) {
        ArrayList list = new ArrayList<String>();
        for (int i = 0; i < List.size(); i++) {
            for (int j = 0; j < List1.size(); j++) {
                if (List.get(i) == List1.get(j)) {
                    list.add(List1.get(j));
                }
            }
        }
        return list;
    }
   int listAdd(ArrayList<Integer> list){
        int sum=0;
        for (int ls:list) {
            sum=sum+ls;
        }
        return sum;
    }
    int partition(int PageNo){
        return PageNo/10 + 1;
    }

}