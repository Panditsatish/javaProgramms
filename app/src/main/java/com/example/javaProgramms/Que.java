public class Que {
    public static void main(String[] args) {
        int array[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                array[i] = 5;
            } else
                array[i] = 2;
        }
        for (int ar : array) {
            System.out.print(" " + array[ar]);
        }
        System.out.println("");
    }
}
