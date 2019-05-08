public class Waiter extends Employee {
	private double cash;
	private double pos_charges;
	private double billing_account_charges;
	public MobileDevice device;

	public Waiter(double c, double pos_c, double bill_account, MobileDevice dev)
	{
		this.cash = c;
		this.pos_charges = pos_c;
		this.billing_account_charges = bill_account;
		this.device = dev;
	}

	public static Waiter findBestForTable(Table t)
	{
 		
	}
	
	public boolean notify(Notification n)
	{
		boolean res = n.show();
		return res;
	
	}

	public boolean isNew()
	{
		
	}

	public boolean editData(Bundle new_info)
	{

	}

	public boolean validateData(Bundle new_info)
	{

	}

}
