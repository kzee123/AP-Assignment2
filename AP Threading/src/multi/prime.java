package multi;

public class prime extends Thread{
	public void run() {
		int x = 1;
		int count = 0;
		for(int i = 1;i<10000;i++) {
			while(x<=i){
				if(i%x == 0) {
					count++;
				}
				x++;
			}
			x = 1;
			if(count == 2) {
				System.out.println("Thread2 "+i+" Prime");
			}
			count = 0;
		}
		System.out.println("Thread 2 finished");
	}

}
