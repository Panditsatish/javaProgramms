package Interface;

 class Boby implements DAd,Mom{
     @Override
     public void love() {
         System.out.println("mom love boby");

     }

     @Override
     public void pacience() {
         System.out.println("Dad is give the protection to his boby");
     }
 }
class main{
     public static void main(String [] args){
         Boby bb=new Boby();
         bb.love();
         bb.pacience();
     }
}