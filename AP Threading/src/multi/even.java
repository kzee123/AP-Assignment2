package multi;

public class even extends Thread{
	@Override
	public void run() {
		for(int i = 1;i<10000;i++) {
			if(i%2 == 0)
				System.out.println("Thread1: "+i+" Even");
		}
		System.out.println("Thread 1 finished");
	}

}
