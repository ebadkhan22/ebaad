package lab1;

public class Billing {
	private int B_no;
	private float B_amount;
	private Patient P_id;
	private Patient P_name;
	
	public Billing(int B_no,Patient P_id, Patient P_name,float B_amount ) {
		this.B_no=B_no;
		this.P_id=P_id;
		this.P_name=P_name;
		this.B_amount=B_amount;
	}
}
