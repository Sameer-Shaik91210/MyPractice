//Develop a program in which we can see 1-20 numbers are printing on the console
public class Code17_sleep {
	public static void printNumbers() throws InterruptedException {
		System.out.println("This method is executed in "+ Thread.currentThread().getName());
		for (int i = 1; i <=20; i++) {
            System.out.print(i+" ");
            Thread.sleep(1000);
		}
	}
	public static void main(String[] args) throws InterruptedException {
	
		System.out.println("main starts");
		MyThread17 mt=new MyThread17();
		mt.start();
		Thread.sleep(20000);
		printNumbers();
	}

}
class MyThread17 extends Thread{
   @Override
   public void run() {
	   System.out.println("run of "+Thread.currentThread().getName());
	   try{Code17_sleep.printNumbers();}catch(InterruptedException e) {}
   }
}
