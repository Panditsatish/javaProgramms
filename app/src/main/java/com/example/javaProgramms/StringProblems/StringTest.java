package StringProblems;

public class StringTest {
    public static void main(String[] args) {
        String st = "Java World";
        System.out.println(st.length());
        System.out.println(st.toUpperCase().charAt(7));
        System.out.println(st.substring(0, 4).toUpperCase() + st.substring(4, st.length()).toLowerCase());
        try {
            String str = null;
            System.out.println(str.length());
        } catch (Exception e) {
            System.out.println("Exceptions is occur");
            e.printStackTrace();
        } finally {
            System.out.println("don't worry this is try catch block");
        }
    }
}
