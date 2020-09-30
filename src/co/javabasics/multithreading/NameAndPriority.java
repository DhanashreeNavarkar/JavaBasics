package co.javabasics.multithreading;

public class NameAndPriority {

	public static void main(String[] args) {

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
		
		t1.setName("Hi");
		t2.setName("Hello");
		System.out.println("Thread name: "+t1.getName());
		System.out.println("Thread name: "+t2.getName());
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Thread priority: "+t1.getPriority());
		System.out.println("Thread priority: "+t2.getPriority());
		
		t1.start();
		t2.start();


	}

}
