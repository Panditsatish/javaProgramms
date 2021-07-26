import java.util.Scanner;

public class Operation {
    public static void main(String []args){
       int i=0;
        Scanner sc=new Scanner(System.in);
        do{ try{

        Operation o=new Operation();
        System.out.println("Enter two no.");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Enter Your choice to perform the operation "+"\n1.Addition"+"\n2.subtraction"+"\n3.multipliction"
        +"\n4.Division");
        int choice=sc.nextInt();
        System.out.println(o.performOperation(num1,num2,choice));
    }catch(Exception e){
            System.out.println("Exception Handle");
        e.printStackTrace();
        }

    }while(i==1);
    }
    public int performOperation(int num1,int num2,int choice){

        switch(choice){
            case 1:System.out.println("Your are choose : Addition");return num1+num2;
            case 2:System.out.println("Your are choose : Subtraction");return num1-num2;
            case 3:System.out.println("Your are choose : Multiplication");return num1*num2;
            case 4:System.out.println("Your are choose : Division");return num1/num2;
            default:
                System.out.println("choose no option");
        }
        return 0;
    }
}
