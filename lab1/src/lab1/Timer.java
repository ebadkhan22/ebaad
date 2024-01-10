package lab1;

public class Timer extends Thread {
	public void run() {

		for (int i = 0; i <= 10; i++) {
			System.out.println("Current Time:" + i + " Seconds");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Time Player Thread Interrupted");
			}
		}
	}
}