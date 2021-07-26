import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Form {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, str = "";
        int n, age;
        Map<String, String> mp = new HashMap<>();
        Set<Map.Entry<String, String>> entries = mp.entrySet();
        for (int i = 1; i > 0; i = sc.nextInt()) {
            System.out.println("Enter Your Name");
            name = sc.next();
            System.out.println("Your name is " + name);
            System.out.println("Enter your age");
            age = sc.nextInt();
            System.out.println("Your age is " + age);
            System.out.println("Enter Technology\n" + "Option like\n" + "1.Android\n" + "2.Flutter\n" + "3.React\n" + "4.Node\n" + "5.IOS");
            n = sc.nextInt();
            Switch(n);
            mp.put(name, str);
            for (Map.Entry<String, String> entry : entries) {
                System.out.print("Name: " + entry.getKey());
                System.out.println(", Technology: " + entry.getValue());
            }
            System.out.println("enter 1 for continue or enter 0 for exit");
        }
    }

    public static void Switch(int n) {

        String str = "";
        switch (n) {

            case 1:
                System.out.println((str = "Android"));
                break;
            case 2:
                System.out.println((str = "Flutter"));
                break;
            case 3:
                System.out.println((str = "React"));
                break;
            case 4:
                System.out.println((str = "Node"));
                break;
            case 5:
                System.out.println((str = "Ios"));
                break;
            default:
                System.out.println("Your are not choose any technology");
        }
    }
}
