package lab1;

public class Start extends Thread 
{ 
 public void run() 
 { 
 System.out.println("Thread is running..."); 
 } 
 public static void main(String args[]) 
 { 
 Start t1=new Start(); 
 // this will call run() method 
 t1.start(); 
 } 
} 
