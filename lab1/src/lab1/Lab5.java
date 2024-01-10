package lab1;

public class Lab5 {
	int page = 10;

	synchronized void avlpages(int page) {
		System.out.print("Printing Started");
		if (this.page < page) {
			System.out.println("Less pages remaining for pages");
			try {

				wait();
			} catch (Exception e) {
			}
			this.page -= page;
			System.out.println("Printing Complete");
		}
	}

	synchronized void printQueue(int page) {
		System.out.println("pages avail start print");
		this.page += page;
		System.out.println("printing completed");
	}
}