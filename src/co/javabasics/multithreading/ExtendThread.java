package co.javabasics.multithreading;

public class ExtendThread {

	public static void main(String[] args) {

		System.out.println("Thread 1");
		
		Hi hi = new Hi();
		Hello hello = new Hello();
		
		hi.start();
		hello.start();
		
		
	}

}


class Hi extends Thread{
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

class Hello extends Thread{
	
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