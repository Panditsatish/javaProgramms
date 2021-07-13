public class override {
    int override(int a, int b) {
        System.out.println("sum of int a&b="+(a+b));
          return (a + b);
    }

    int override(int a, int b, int c) {
        System.out.println("sum of int a,b&c="+(a+c+b));
        return (a + b + c);
    }

    long override(int a, long b) {
        long c = a + b;
        System.out.println("sum of long ="+c);
        return (c);
    }

    double override(double a, double b) {
        System.out.println("sum of double ="+(a+b));
        return (a + b);
    }
    public static void main(String [] args){
        override sc=new override();
        sc.override(12,85);
        sc.override(1222,528546);
        sc.override(12,52,369);
        sc.override(15.5,58855.63);
    }
}