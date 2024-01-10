package lab1;

public class Stop extends Thread 
{ 
 public void run() 
 { 
 for(int i=1; i<5; i++) 
 { 
 try 
 { 
 // thread to sleep for 500 milliseconds 
 sleep(500); 
 System.out.println(Thread.currentThread().getName()); 
 }catch(InterruptedException e){System.out.println(e);} 
 System.out.println(i); 
 } 
 } 
 public static void main(String args[]) 
 { 
 // creating three threads 
	 Stop t1=new Stop (); 
	 Stop t2=new Stop (); 
	 Stop t3=new Stop (); 
 // call run() method 
 t1.start(); 
 t2.start(); 
 // stop t3 thread 
 t3.stop(); 
 System.out.println("Thread t3 is stopped"); 
 } 
} 
