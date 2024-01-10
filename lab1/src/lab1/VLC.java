package lab1;

public class VLC {
	public static void main(String[] args) {
		Video video = new Video();
		Audio audio = new Audio();
		Timer timer = new Timer();

		video.start();
		audio.run();
		timer.run();

		try {
			video.join();
			audio.join();
			timer.join();

		} catch (InterruptedException e) {
			System.out.println("Thread Interrupted");
		}
		System.out.println("VLC Media Player Has Finished Playing Audio And Video");

	}

}
