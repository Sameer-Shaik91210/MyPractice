class MyRunnable12 implements Runnable{
	@Override
	public void run() {
		System.out.println("run execution started");
		System.out.println("executing logic of "+ Thread.currentThread());
		System.out.println("run ends");
	}
}
public class Code12_CurrentThread {
	public static void main(String[] args) {
	
	Thread th1=new Thread(new MyRunnable12());
	Thread th2=new Thread(new MyRunnable12());
	th1.setName("My First Thread");
	th2.setName("My Second Thread");
	th1.start();
	th2.start();
	System.out.println("main ends");
	
	}
	

}
