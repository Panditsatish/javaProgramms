package StringProblems;

public class TryCatch {
    public static void main(String[] args) {
        try {
          double i=0.0;
          double a=100/i;
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
            System.out.println("ArithmeticException is occur");
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
            System.out.println("Array index out of bound ");
        } catch (Exception ex) {
            System.out.println("Exceptions is occur");
            ex.printStackTrace();
        }

    }
}
