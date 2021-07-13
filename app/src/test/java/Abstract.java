public abstract class Abstract {
 abstract void hi();
}
class A extends Abstract{
 public void hi(){
  System.out.println("hi");
 }
 public static void main(String []args){
  Abstract obj = new A();
  obj.hi();
 }
}

