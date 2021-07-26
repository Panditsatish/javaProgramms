package Interface;

import java.util.Scanner;

class Perform{
    public static void main(String []args){

        System.out.println("enter the two no.");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Enter Your choice to perform the operation "+"\n1.Addition"+"\n2.subtraction"+"\n3.multipliction"
                +"\n4.Division");
        int choice =sc.nextInt();
        TaskPerform p=new TaskPerform();
        System.out.println(p.Operation(num1,num2,choice));


    }

}
