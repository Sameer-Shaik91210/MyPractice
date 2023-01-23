class MyRunnable implements Runnable{
	 @Override
	 public void run() {
		 System.out.println("run execution started ");
		 for (int i = 20; i>=1;i--) {
			System.out.println("run: "+ i);
			
		}
		 System.out.println("\trun Ends");
	 }
}
public class Code9_PrintNumbers {
	public static void main(String[] args) {
		System.out.println("main started");
		MyRunnable mR=new MyRunnable();
		Thread th=new Thread(mR);
		th.start();
		 for (int i = 1; i<=20;i++) {
				System.out.println("main: "+ i);
				
			}
		 System.out.println("main ends");
		
	}

}
