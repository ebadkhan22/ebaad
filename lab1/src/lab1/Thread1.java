package lab1;

class Thread1 extends Thread
{
Customer c=new Customer(); 
public void run()
{
c.withdraw(15000);
}
}