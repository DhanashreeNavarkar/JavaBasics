package co.javabasics.multithreading;

public class IsAliveAndJoinMethod {

	public static void main(String[] args) throws InterruptedException {

		Runnable obj1 = new Runnable() {
			
			@Override
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
		};
		
		Runnable obj2 = new Runnable() {
			
			@Override
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
		};
		
		Thread t1 =  new Thread(obj1);
		Thread t2 =  new Thread(obj2);
		
		t1.start();
		t2.start();

		

		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println("*******************************************************");
		
		t1.join();
		t2.join();
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println("*******************************************************");
		
		
		System.out.println("*******************************************************");
		System.out.println("Bye");

	}

}
