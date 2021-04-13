package multi;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		even thread1 = new even();
		prime thread2 = new prime();
		thread1.start();
		thread2.start();
		System.out.println("Hello world");
	}

}
