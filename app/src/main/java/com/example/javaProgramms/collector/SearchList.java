package collector;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchList implements InterfaceClass {
    public void call(int num) {
        String str = "";
        ArrayList List1 = new ArrayList<String>();
        List1.add("satish ");
        List1.add("riya");
        List1.add("pushkar");
        List1.add("suraj");
        List1.add("sumit");
        List1.add("ashish");
        System.out.println("Enter name or character to find the list");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        System.out.println(find(List1, str));
    }
    List find(ArrayList<String> List1, String str) {
        ArrayList ListSearch = new ArrayList<String>();
        for (int i = 0; i < List1.size(); i++) {
            if (List1.get(i).contains(str)) {
                ListSearch.add(List1.get(i));
            }
        }
        return ListSearch;
    }
}
