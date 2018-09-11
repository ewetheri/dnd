package dnd;

public class Roll {
	
	private final int[] results;
	private final int total;
	
	Roll(int[] results)
	{
		this.results = results;
		int total = 0;
		for (int i = 0; i < results.length; i++)
		{
			total += results[i];
		}
		
		this.total = total;
	}
	
	public int[] results()
	{
		return results;
	}
	
	public int result()
	{
		return this.total();
	}
	
	public int total()
	{
		return total;
	}

}
