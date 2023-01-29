/* Two Threads are trying to execute a static method Addition.add() 
 * Though they are running concurrently ,the result is always the correct not like with non-static method 
 * because static method's memory is alloted inside the current thread which is accessing it in a new stackframe , 
 * so Thread1 has stackframe for Addition.add() method inside it has the memories of two given values ,
 * similarly Thread2 has it's own stackframe for Addition.add() method inside it,the memories of given values are stored 
 * so howmuch ever time the Thread is paused ,the result is always based on current thread's stackframe static method values. 
*/
class Addition{
	public static void add(int x,int y) throws InterruptedException {
		int a=x;
		int b=y;
		Thread.sleep(6000);
		int res=a+b;
		System.out.println(Thread.currentThread().getName()+"'s result:  "+res);
	}
}



class Thread1 extends Thread{
	public Thread1(String name) {
		super(name);
	}
	@Override
	public void run() {
		Thread thread=Thread.currentThread();
		System.out.println(thread.getName()+" started");
		try {
			Addition.add(50, 10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(thread.getName()+" ended");
	}
}



class Thread2 extends Thread{
	public Thread2(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		Thread thread=Thread.currentThread();
		System.out.println(thread.getName()+" started");
		try {
			Addition.add(30, 10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(thread.getName()+" ended");
	}
}





public class Code19_CommonObject {
  public static void main(String[] args) {
	  System.out.println("main starts");
	  Thread1 thread1=new Thread1("First Thread");
	  Thread2 thread2=new Thread2("Second Thread");
	
	thread1.start();
	thread2.start();
	
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	System.out.println("main ends");
 }
}
