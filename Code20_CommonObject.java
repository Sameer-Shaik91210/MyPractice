/*Here,Thread20("First Thread") calls the add method with values 50 and 10
 * Thread21("Second Thread") calls the add method with values 30 and 10 
 * so First Thread's expected output is 60 and Second  Thread's expected output is 40
 * But,we get either both 60 or 40  not the expected output 
 * 
 * both thread's are trying to access and modify the same Object memory in the heap area
 * First Thread accessed Object and updated values a and b with 50 and 10 and it is paused 
 * for 6 seconds while it is paused Second Thread accessed Object and updated a and b which are holding 50 ,10 with 30 &10
 * Now First Thread performs addition on a and b an prints 40 instead of expected 60
 * 
 */

class Addition2{
	private int a;
	private int b;
	public  void add(int x,int y) throws InterruptedException {
		Thread thread=Thread.currentThread();
		System.out.println(thread.getName()+" started");
		this.a=x;
		this.b=y;
		Thread.sleep(6000);
		int res=a+b;
		System.out.println(Thread.currentThread().getName()+"'s result:  "+res);
		System.out.println(thread.getName()+" ended");
	}
}



class Thread20 extends Thread{
	private Addition2 addition;
	public Thread20(String name,Addition2 addition2) {
		super(name);
		this.addition=addition2;
	}
	@Override
	public void run() {
		
		try {
			addition.add(50, 10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}



class Thread21 extends Thread{
	private Addition2 addition;
	public Thread21(String name,Addition2 addition2) {
		super(name);
		this.addition=addition2;
	}
	@Override
	public void run() {
		
		try {
			addition.add(30, 10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}





public class Code20_CommonObject {
  public static void main(String[] args) {
	  System.out.println("main starts");
	  Addition2 addition=new Addition2();
	  Thread20 thread1=new Thread20("First Thread",addition);
	  Thread21 thread2=new Thread21("Second Thread",addition);
	
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
