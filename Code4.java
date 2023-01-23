class MyThread extends Thread{
public void run(){
	/* System.out.println("Inside My run method");
	 //System.out.println(this.currentThread());
	 //System.out.println(this);
	//try{Thread.sleep(2000);}catch( InterruptedException e){ }
	 System.out.println("End of run method");*/
	  for(int i=0;i<20;i++){
	    System.out.println(i+1);
   }
  }
}
class Code4{
 public static void main(String[] args){
   System.out.println("main started");
 
   MyThread th=new MyThread();

   th.start();
   for(int i=0;i<20;i++){
	    System.out.println(i+1);
   }
   System.out.println();


    
	//try{Thread.sleep(1000);}catch( InterruptedException e){ };
   //System.out.println("main ends");
 }
}