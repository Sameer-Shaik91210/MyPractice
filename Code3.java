class MyThread extends Thread{
public void run(){
	 System.out.println("Inside My run method");
	 //System.out.println(this.currentThread());
	 //System.out.println(this);
	try{Thread.sleep(2000);}catch( InterruptedException e){ }
	 System.out.println("End of run method");
  }
}
class Code3{
 public static void main(String[] args){
   System.out.println("main started");
  // System.out.println("Before Thread Object Definition: "+ java.lang.Thread.activeCount());
   
   MyThread th=new MyThread();
  // System.out.println("After Object Def: "+java.lang.Thread.activeCount());
   th.start();
  // System.out.println("After  start() call: "+java.lang.Thread.activeCount());
    
	try{Thread.sleep(1000);}catch( InterruptedException e){ };
   System.out.println("main ends");
 }
}