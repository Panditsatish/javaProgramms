package StringProblems;

import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string ");
        String str = sc.nextLine();
        SearchString s=new SearchString();
    s.strf(str);
    }

    void strf(String str){
        String A[] = str.split(" ");
        for (int i = A.length - 1; i >= 0; i--)
            System.out.print(A[i] + " ");
        System.out.println();
    }

}
