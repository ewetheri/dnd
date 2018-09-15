package dnd;

public enum Size {
	TINY		(2.5),
	SMALL		(5),
	MEDIUM		(5),
	LARGE		(10),
	HUGE		(15),
	GARGANTUAN	(20);
	
	private final double diameter;
	
	Size (double diameter)
	{
		this.diameter = diameter;
	}
	
	public double diameter()
	{
		return diameter;
	}
	
}
