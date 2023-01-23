class MyClass1 implements Runnable{
 @Override
 public void run(){
  System.out.println("Run is executed");
 }
}
class Code7{
 public static void main(String[] args){
  MyClass1 mc=new MyClass1();
  //mc.start();
  Thread th=new Thread(mc);
  th.start();
 }
}