public  class III implements Icall{
   public static void main(String [] args){
       III i=new III();
        i.show();
        i.dev();
    }

    @Override
    public void dev() {
        System.out.println("hello");

    }

    @Override
    public void show() {
        System.out.println("byee");
    }
}
