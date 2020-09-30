package co.javabasics.multithreading;

public class ImplementRunnable {

	public static void main(String[] args) {

		System.out.println("Thread 1");
		
		Hie hie = new Hie();
		Helllo hello = new Helllo();
		
		Thread t1 = new Thread(hie);
		Thread t2 = new Thread(hello);
		
		t1.start();
		t2.start();
		
	}

}

class Hie implements Runnable{
	public void run() {
		for(int i=1; i<=5;i++) {

			System.out.println("Hi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Helllo implements Runnable{
	
	public void run() {
		for(int i=1; i<=5;i++) {

			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}
