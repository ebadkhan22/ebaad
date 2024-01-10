package lab1;

public class Printer extends Thread{
    public void run() {
        for (int i = 0; i < 26; i++) {
            int randomAscii = (int) (Math.random() * (90 - 65 + 1) + 65);
            
            char randomChar = (char) randomAscii;
            
            System.out.print(randomChar+" ");
            
            try {
                Thread.sleep((long) (Math.random() * 400 + 100));
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}


