
public class COde15_mainThread {
	public static void main(String[] args) {
		Thread th =Thread.currentThread();
		System.out.println("Before modifying name and Priority :");
		System.out.println("name:  "+th.getName());
		System.out.println("Priority: "+th.getPriority());
		th.setName("new_main_name");
		th.setPriority(9);
		System.out.println();
		System.out.println("Before modifying name and Priority :");
		System.out.println("name:  "+th.getName());
		System.out.println("Priority: "+th.getPriority());
	}

}
