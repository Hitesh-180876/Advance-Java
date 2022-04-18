package multithreading;

public class MyTest implements Runnable {   // override run method in Runnable
	public void run() {
		int i=1;
		while(true) {
			System.out.println(i+"hello");           // Infinite loop
			i++;
		}
	}
	public static void main(String[] args) {
		MyTest t = new MyTest();                // creating object of MyTest class
		Thread th = new Thread(t);             // passing MyTest object into  Thread object 
    
		th.start();      // starting the thread
		
		int i=1;
		while(true) {               
			System.out.println(i+"world");        // Infinite loop
			i++;
		}
		
	}

}

