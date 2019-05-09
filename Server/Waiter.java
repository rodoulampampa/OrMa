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

	public boolean isNew(this)
	{
		if (this.pos_charges == !NULL)
		{
			return false;
		}
		else
		{
			return true;
			void onPay();
		}
		
	}

	public boolean editData(Bundle new_info)
	{
		if (validateData(new_info))
		{
			return RESP_ACCEPTED;
		}
		else
		{
			return RESP_REJECTED;
		}

	}

	public boolean validateData(Bundle new_info)
	{
		if ((this.new_info == this.username) && (this.new_info == this.password))
		{
			showSuccess("Your data is valid!");
			//Waiter dismisses the message
			return RESP_ACCEPTED;
		}
		else
		{
			showFailure("Your data is not valid");
			//Waiter dismisses the message
			return RESP_REJECTED;
		
		}
		
	}

}
