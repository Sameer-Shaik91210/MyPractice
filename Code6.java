class MyClass implements Runnable{
 @Override
 public void run(){
  System.out.println("Run is executed");
 }
}
class Code6{
 public static void main(String[] args){
  MyClass mc=new MyClass();
  //mc.start();
  Thread th=new Thread(mc);
  th.start();
 }
}