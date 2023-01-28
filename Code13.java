
class MyRunnable13 implements Runnable{
	@Override
	public void run() {
		Thread th=Thread.currentThread();
		System.out.println("this run belongs to "+/* Thread.currentThread().getName()*/ th.getName()); 
	}
}
public class Code13 {
	public static void main(String[] args) {
		MyRunnable13 mr1 =new MyRunnable13();
		Thread th1=new Thread(new MyRunnable13());
		Thread th2=new Thread(mr1);
		th1.setName("My_Customized_Thread_1" );th1.setPriority(10);
		th2.setName("My_Customized_Thread_2" );
		th1.start();
		th2.start();
		try {Thread.sleep(3000);}catch(InterruptedException e) {}
		System.out.println("main ends");
		
	}
		



}
