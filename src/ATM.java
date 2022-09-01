import java.util.*;


public class ATM {
	private HashMap<Integer, Double> accounts;
	
	public ATM ()
	{
		accounts = new HashMap<Integer, Double>();
	}
	public void openAccount (int idNum)
	{
		accounts.put(idNum, 0.0);
	}
	public void openAccount (int idNum, double deposit)
	{
		accounts.put(idNum,deposit);
		
	}
	public void closeAccount(int idNum)
	{
		if (checkBalance(idNum)==0.0)
		{
			accounts.remove(idNum);
		}
	}
	public double checkBalance(int idNum)
	{
		if (accounts.containsKey(idNum))
			return Math.round(accounts.get(idNum)*100.0)/100.0;
		return 0.0;
	}
	public boolean depositMoney (int idNum, double deposit)
	{
		if (!accounts.containsKey(idNum))
			return false;
		if (deposit<0)
		{
			return false;
		}
		accounts.put(idNum, accounts.get(idNum)+deposit);
		return true;
	}
	public boolean withdrawMoney (int idNum, double withdraw)
	{
		if (!accounts.containsKey(idNum))
			return false;
		if (accounts.get(idNum)-withdraw<0)
			return false;
		if (withdraw<0)
			return false;
		accounts.put(idNum, accounts.get(idNum)-withdraw);
		return true;
	}
	
	
}
