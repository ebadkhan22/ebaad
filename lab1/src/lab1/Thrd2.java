package lab1;

public class Thrd2 extends Thread {
		Lab5 c=new Lab5();
		public void run() {
			c.printQueue(10);
		}
}
