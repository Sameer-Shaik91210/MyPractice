

class MyThread12  extends Thread implements Runnable{
	@Override
	public void run() {
		System.out.println("Run started "); 
		System.out.println(getName());
	}
}
public class Code11_RunnableObjectgetNameMethod {
	public static void main(String[] args) {
		
	
	MyThread12 mr =new MyThread12();
	MyThread12 mr1 =new MyThread12();
    Thread th1=new Thread(mr);
    Thread th2=new Thread(mr1);

    th1.setName("First Thread");
    th2.setName("Second Thread");
    th1.start();
    th2.start();
    System.out.println(th1.getName());
    System.out.println(th2.getName());
	}
    
    
	

}
