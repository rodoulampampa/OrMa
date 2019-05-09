public class WaitingGroup {

	private string name;
	private int number_of_people;	//perhaps to be a list
	private int priority;
	static List<WaitingGroup> WaitingGroup.name; //add to the domain model?

	public WaitingGroup(string n, int number_of_people, int priority)
	{
		this.name = n;
		this.number_of_people = number_of_people;
		this.priority = priority;

	}


	public void addToList(this.name, num_of_p)
	{
		for(WaitingGroup.name != this.name)
		{
			WaitingGroup.name = WaitingGroup.name + this.name;
			this.number_of_people = this.number_of_people + this.num_of_p;
		}
		else
		{
			return false;
		}
		
		return RESP_ACCEPTED;
		notifyWhenAvailable();
	}

	public void notifyWhenAvailable(number_of_people)
	{
		if (table.findFreeTable() == NULL && (this.priority <= this.)) 
			/////////////////need help here
		return RESP_ACCEPTED;
		else
		{
			return RESP_REJECTED;
		}
	}

	public void remove(this.name, num_of_p)
	{
		if (setTaken == TRUE)
		{
			priority = priority -1;
			WaitingGroup.name = WaitingGroup.name - this.name;
			this.number_of_people = this.number_of_people - this.num_of_p;
			return RESP_ACCEPTED;
		}
		else
		{
			return RESP_REJECTED;
		}
		
	}
}
