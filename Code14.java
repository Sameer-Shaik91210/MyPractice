
public class Code14 {
	public static void  trailMethod() {
		System.out.println("This method is executed from "+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		Thread th1=new Thread(new MyRunnable14());
		Thread th2=new Thread(new MyRunnable14());
		th1.setName("My_First_Thread");
		th2.setName("My_Second_Thread");
		th1.setPriority(10);
		th1.start();
		th2.start();
		try {Thread.sleep(2000);}catch(InterruptedException e) {}
		System.out.println("main ends ");
	}

}
class MyRunnable14 implements Runnable{
	@Override
	public void run() {
		Thread th=Thread.currentThread();
		System.out.println("This run belongs to "+th.getName());
		Code14.trailMethod();
		System.out.println(th.getName()+" 's run ends");
	}
}
