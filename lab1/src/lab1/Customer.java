package lab1;

public class Customer {
	int amount=10000; 
	 
	synchronized void withdraw(int amount){ 
	System.out.println("going to withdraw..."); 
	 
	/*synchronized(this) {*/if(this.amount<amount){ 
	System.out.println("Less balance, waiting for deposit..."); 
	try{wait();}
	catch(Exception e){} 
	} 
	this.amount-=amount; 
	System.out.println("withdraw completed..."); 
	//} 
	}
	synchronized void deposit(int amount){ 
	System.out.println("going to deposit..."); 
	/*synchronized(this) {*/this.amount+=amount; 
	System.out.println("deposit completed... "); 
	notify(); 
	} 
	//}
}
