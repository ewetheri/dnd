package dnd;

import java.util.concurrent.ThreadLocalRandom;

public enum Die {

	D2		("d2", 2),
	D3		("d3", 3),
	D4		("d4", 4),
	D6		("d6", 6),
	D8		("d8", 8),
	D10		("d10", 10),
	D12		("d12", 12),
	D20		("d20", 20),
	D30		("d30", 30),
	D50		("d50", 50),
	D100	("d100", 100);
	
	private final String name;
	private final int sides;
	
	Die(String name, int sides)
	{
		this.name = name;
		this.sides = sides;
	}
	
	public String diceName()
	{
		return name;
	}
	
	public int sides()
	{
		return sides;
	}
	
	public Roll roll()
	{
		int[] result = {ThreadLocalRandom.current().nextInt(1, this.sides() + 1)};
		return new Roll(result);
	}
	
	public Roll rollAdvantage()
	{
		int result1 = this.roll().result();
		int result2 = this.roll().result();
		return new Roll(new int[] {Math.max(result1, result2)});
	}
	
	public Roll rollDisadvantage()
	{
		int result1 = this.roll().result();
		int result2 = this.roll().result();
		return new Roll(new int[] {Math.min(result1, result2)});
	}
	
}
