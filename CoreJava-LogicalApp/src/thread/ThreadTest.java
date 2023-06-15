package thread;

public class ThreadTest extends Thread{
	
	public void run() {
		Thread th = Thread.currentThread();
		String name = th.getName();
		for(int i=1;i<=10;i++) {
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("The value of i is::"+i +name);
		}
	}

	public static void main(String[] args) {
		ThreadTest t1 = new ThreadTest();
		t1.start();
		
		Thread th = Thread.currentThread();
		String name = th.getName();
		for(int i=1;i<=5;i++) {
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("The value of i is::"+i +name);
		}

	}

}
