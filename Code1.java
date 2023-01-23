class Code1{
 public static void main(String[] args){
   System.out.println("main started");
   System.out.println("Before Thread Object Definition: "+ java.lang.Thread.activeCount());
   
   Thread th=new Thread();
   System.out.println("After Object Def: "+java.lang.Thread.activeCount());


   th.start();
   System.out.println("After  start() call: "+java.lang.Thread.activeCount());

   System.out.println("main ends");
 }
}