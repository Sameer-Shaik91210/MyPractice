interface DRunnable{
	void run();
}
class DThread implements DRunnable{
	private DRunnable target;
	public DThread(DRunnable target) {
		this.target=target;
	}
	public DThread() {
		
	}
	public void start() {
		run();
		
	}
	public void run() {
		if(target!=null)
		   target.run();
		else 
		  System.out.println("You have created \nNo Param COnstructor of DThread Class\nso,Run is not executed");
		
		
	}
}
class MyClass2 implements DRunnable{
 @Override
 public void run(){
  System.out.println("Run is executed");
 }
}
class Code8{
 public static void main(String[] args){
  MyClass2 mc=new MyClass2();
  //mc.start();
  DThread th=new DThread(mc);
  th.start();
  DThread th1=new DThread();
  th1.start();
  DThread th2=new DThread(new MyClass2());
  th2.run();
 }
}
