
package multithreading;
                                                                                 ________________________________________________
class MyThread extends Thread{                                                          first MyThread run for infinite loop
	public void run() {  // override the run method of class Thread                  
		int i=1;
		while(true) {
			System.out.println(i+"Hello");
			i++;
		}
	}
}

public class Test {
	public static void main(String[] args) {
		MyThread t = new MyThread();    // create object of MyThread class
		t.start();   // start the thread using start() method                      _______________________________________________________
                                                                                   program does'nt stop and continue itself 
    /* running main method simultaneously */
		int i=1;
		while(true) {
			System.out.println(i+"world");                                          ---------------------------------------------------------------
			i++;                                                                               main() loop run  for infinite  
		}
	}

}
