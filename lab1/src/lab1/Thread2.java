package lab1;

class Thread2 extends Thread
{
Customer c=new Customer(); 
public void run()
{
c.deposit(10000);
}
}
