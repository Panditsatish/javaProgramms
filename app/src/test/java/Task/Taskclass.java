package Task;

import java.util.Scanner;

public class Taskclass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of Array");
        int n = sc.nextInt();
        System.out.println("Enter the element of Array");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        Taskclass t=new Taskclass();
        t.sort(array);
    }
    void sort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i +1; j < array.length; j++) {
                if (array[i] > array[j]) {
                   int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.println("Smallest  element="+array[0]);
        System.out.println("largest  element="+array[array.length-1]);
    }

    public void Method() {
    }
}
