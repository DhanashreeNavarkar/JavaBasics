package co.javabasics.multithreading;

/*class MyTask{
	void executeTask() {
		for(int doc = 1; doc<=10; doc++) {
			System.out.println("Priting document from printer 2 : #"+doc);
		}
	}
}*/

class CA{
	
}

//class MyTask extends CA, Thread --> error- multiple inheritance not supported

class MyTask extends CA implements Runnable{ 
	@Override
	public void run() {
		for(int doc = 1; doc<=10; doc++) {
			System.out.println("Priting document from printer 2 : #"+doc);
		}
		
	}
}

//MyTask Is-A thread

/*class MyTask extends Thread{
	@Override
	public void run() {
		for(int doc = 1; doc<=10; doc++) {
			System.out.println("Priting document from printer 2 : #"+doc);
		}
	}
}*/

public class ThreadDemo {
	
	//main method represents main thread

	public static void main(String[] args) {
		
		//whatever we write here will be executed by main method
		//thread always executes a job in sequence
		//execution context
		
		//job 1
		System.out.println("Application started!!!");
		
		//job 2
		//MyTask m = new MyTask();	
		//child or worker thread
		//m.start();	 
		//start shall internally execute run method
		
		Runnable r = new MyTask();
		Thread task = new Thread(r);
		task.start();
		
		//till job 2 is not finished, below jobs are  waiting 
		//in case job 2 is long running operation, i.e.several documents are supposed to be printed
		//in such a use case OS/JVM gives a message app not responding
		//some sluggish behavior in app can be observed --> app seems to hang	
		
		//Now, main and MyTask are executing parallely or concurrently
		
		//some code to print documents
		//job 3
		for(int doc = 1; doc<=10; doc++) {
			System.out.println("Priting document from printer 1 : #"+doc);
		}
		
		//job 4
		System.out.println("Application Finished!!!");
		

	}

}


