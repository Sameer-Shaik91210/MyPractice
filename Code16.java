class MyThread16 extends Thread{
	@Override
	public void run() {
		System.out.println("This run method is executed from "+getName());//Thread-0 as output need necessarily not mean a thread is with name Thread-0 is actually created ,The created Thread object inside main method contains name information and that name is fetched here through getName() Method
        System.out.println("Active Threads "+Thread.activeCount());
        System.out.println("Executed in Thread "+Thread.currentThread().getName());
 }
}
public class Code16 {
  public static void main(String[] args) {
	MyThread16 mt =new MyThread16();
	mt.run();
  }
}
