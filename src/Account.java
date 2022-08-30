
public class Account {
	private int id;
	private double amount;
	
	public Account (int idNum, double amountNum)
	{
		setId(idNum);
		setAmount(amountNum);
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
