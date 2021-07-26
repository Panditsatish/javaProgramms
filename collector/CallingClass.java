package collector;

import java.util.Scanner;

public class CallingClass {
public static void main(String []args){
    int i=0;
    do {
        SumOfList sl = new SumOfList();
        SearchList SL = new SearchList();
        CommanList cl = new CommanList();
        System.out.println("Choose Your Operation " + "  \n1 for Sum of List" + "\n2 for Searching elements from list" +
                "\n3 for find common name");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1:
                sl.call(0);
                break;
            case 2: SL.call(1);

                break;
            case 3:
                cl.call(0);
                break;
        }
        System.out.println("Press 1 for continue and 0 for exit");
        i=sc.nextInt();
    }while(i==1);
}
}
