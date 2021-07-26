package ListClass;

import java.util.ArrayList;
import java.util.List;

public class FirstList {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        ls.add("Satish");
        ls.add("Satish");
        ls.add("Satish");
        ls.add("Satish");
        ls.add("Satish");
        ls.add("Sanjeet");
        ls.add("Saurabh");
        ls.add("Shashikant");
        ls.add("Sivashankar");
        ls.add("Sauray");
        ls.add("Shubham");
        ls.add("Sivendra");
        ls.add("Suraj");
        for (String st : ls) {
            System.out.println(st);
        }
    }
}
