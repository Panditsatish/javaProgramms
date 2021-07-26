package StringProblems;

public class Excep {
    static void show(){
        try
        {
            int age=12;
            if(age<18) {
            throw new Exception("Not valid");
        }
            else System.out.println("valid");
        }catch(Exception ex){
            ex.printStackTrace();
            System.out.println("exception in show body");
        }
    }
    public  static void main(String []args){
        try{
            show();
        }catch(Exception ex){
            System.out.println("inside the main");
        }
    }
}
