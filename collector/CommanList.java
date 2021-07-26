package collector;

import java.util.ArrayList;

public class CommanList implements InterfaceClass{
    public void call(int num){
        ArrayList List = new ArrayList<String>();
        ArrayList ListAdd = new ArrayList<Integer>();
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
        ArrayList list = new ArrayList<String>();
        for (int i = 0; i < List.size(); i++) {
            for (int j = 0; j < List1.size(); j++) {
                if (List.get(i) == List1.get(j)) {
                    list.add(List1.get(j));
                }
            }
        }
        System.out.println(list);

    }
}
