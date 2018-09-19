package dnd;

public class Dice {
	
	private int num2;
	private int num3;
	private int num4;
	private int num6;
	private int num8;
	private int num10;
	private int num12;
	private int num20;
	private int num30;
	private int num50;
	private int num100;
	private int modifier;
	
	public Dice(Die die, int modifier)
	{
		this.initialize();
		
		this.addDie(die);
		
		this.modifier = modifier;
	}
	
	public Dice(int modifier)
	{
		this.initialize();
		
		this.modifier = modifier;
	}
	
	public Dice(Die die)
	{
		this(die, 0);
	}
	
	public Dice(Die[] dice, int modifier)
	{
		this.initialize();
		
		for(int i = 0; i < dice.length; i++)
		{
			this.addDie(dice[i]);
		}
		
		this.modifier = modifier;
	}
	
	public Dice(Die[] dice)
	{
		this(dice, 0);
	}
	
	public Dice addDie(Die die)
	{
		if (die.diceName().equals("d2"))
		{
			num2 += 1;
		}
		else if (die.diceName().equals("d3"))
		{
			num3 += 1;
		}
		else if (die.diceName().equals("d4"))
		{
			num4 += 1;
		}
		else if (die.diceName().equals("d6"))
		{
			num6 += 1;
		}
		else if (die.diceName().equals("d8"))
		{
			num8 += 1;
		}
		else if (die.diceName().equals("d10"))
		{
			num10 += 1;
		}
		else if (die.diceName().equals("d12"))
		{
			num12 += 1;
		}
		else if (die.diceName().equals("d20"))
		{
			num20 += 1;
		}
		else if (die.diceName().equals("d30"))
		{
			num30 += 1;
		}
		else if (die.diceName().equals("d50"))
		{
			num50 += 1;
		}
		else if (die.diceName().equals("d100"))
		{
			num100 += 1;
		}
		
		
		return this;
	}
	
	public void setModifier(int modifier)
	{
		this.modifier = modifier;
	}
	
	private void initialize()
	{
		num2 = 0;
		num3 = 0;
		num4 = 0;
		num6 = 0;
		num8 = 0;
		num10 = 0;
		num12 = 0;
		num20 = 0;
		num30 = 0;
		num50 = 0;
		num100 = 0;
		modifier = 0;
	}
	
	public int numDice()
	{
		return num2+num3+num4+num6+num8+num10+num12+num20+num30+num50+num100;
	}
	
	public boolean hasMod()
	{
		return (modifier != 0);
	}
	
	public Roll roll()
	{
		int numResults = this.numDice();
		if(this.hasMod())
		{
			numResults += 1;
		}
		
		int[] results = new int[numResults];
		for(int i = 0; i < num2; i++)
		{
			results[i] = Die.D2.roll().result();
		}
		for(int i = num2; i < num2+num3; i++)
		{
			results[i] = Die.D3.roll().result();
		}
		for(int i = num2+num3; i < num2+num3+num4; i++)
		{
			results[i] = Die.D4.roll().result();
		}
		for(int i = num2+num3+num4; i < num2+num3+num4+num6; i++)
		{
			results[i] = Die.D6.roll().result();
		}
		for(int i = num2+num3+num4+num6; i < num2+num3+num4+num6+num8; i++)
		{
			results[i] = Die.D8.roll().result();
		}
		for(int i = num2+num3+num4+num6+num8; i < num2+num3+num4+num6+num8+num10; i++)
		{
			results[i] = Die.D10.roll().result();
		}
		for(int i = num2+num3+num4+num6+num8+num10; i < num2+num3+num4+num6+num8+num10+num12; i++)
		{
			results[i] = Die.D12.roll().result();
		}
		for(int i = num2+num3+num4+num6+num8+num10+num12; i < num2+num3+num4+num6+num8+num10+num12+num20; i++)
		{
			results[i] = Die.D20.roll().result();
		}
		for(int i = num2+num3+num4+num6+num8+num10+num12+num20; i < num2+num3+num4+num6+num8+num10+num12+num20+num30; i++)
		{
			results[i] = Die.D30.roll().result();
		}
		for(int i = num2+num3+num4+num6+num8+num10+num12+num20+num30; i < num2+num3+num4+num6+num8+num10+num12+num20+num30+num50; i++)
		{
			results[i] = Die.D50.roll().result();
		}
		for(int i = num2+num3+num4+num6+num8+num10+num12+num20+num30+num50; i < num2+num3+num4+num6+num8+num10+num12+num20+num30+num50+num100; i++)
		{
			results[i] = Die.D100.roll().result();
		}
		
		if (this.hasMod())
		{
			results[results.length -1] = modifier;
		}
		
		return new Roll(results);
	}
	
	public Roll rollAdvantage()
	{
		Roll roll1 = this.roll();
		Roll roll2 = this.roll();
		if(roll1.result() > roll2.result())
		{
			return roll1;
		}
		else
		{
			return roll2;
		}
	}
	
	public Roll rollDisadvantage()
	{
		Roll roll1 = this.roll();
		Roll roll2 = this.roll();
		if(roll1.result() < roll2.result())
		{
			return roll1;
		}
		else
		{
			return roll2;
		}
	}
	
	public int[] checkDice()
	{
		return new int[] {num2, num3, num4, num6, num8, num10, num12, num20, num30, num50, num100, modifier};
	}
	
	public boolean equals(Dice other)
	{
		int[] value1 = this.checkDice();
		int[] value2 = other.checkDice();
		
		for (int i = 0; i < value1.length; i++)
		{
			if (value1[i] != value2[i])
			{
				return false;
			}
		}
		
		return true;
	}
	
	@Override
	public String toString()
	{
		String result = "";
		boolean first = true;
		
		if(num2 > 0)
		{
			if (!first)
			{
				result += " + ";
			}
			
			result += (num2 + "d2");
			
			first = false;
		}
		if(num3 > 0)
		{
			if (!first)
			{
				result += " + ";
			}
			
			result += (num3 + "d3");
			
			first = false;
		}
		if(num4 > 0)
		{
			if (!first)
			{
				result += " + ";
			}
			
			result += (num4 + "d4");
			
			first = false;
		}
		if(num6 > 0)
		{
			if (!first)
			{
				result += " + ";
			}
			
			result += (num6 + "d6");
			
			first = false;
		}
		if(num8 > 0)
		{
			if (!first)
			{
				result += " + ";
			}
			
			result += (num8 + "d8");
			
			first = false;
		}
		if(num10 > 0)
		{
			if (!first)
			{
				result += " + ";
			}
			
			result += (num10 + "d10");
			
			first = false;
		}
		if(num12 > 0)
		{
			if (!first)
			{
				result += " + ";
			}
			
			result += (num12 + "d12");
			
			first = false;
		}
		if(num20 > 0)
		{
			if (!first)
			{
				result += " + ";
			}
			
			result += (num20 + "d20");
			
			first = false;
		}
		if(num30 > 0)
		{
			if (!first)
			{
				result += " + ";
			}
			
			result += (num30 + "d30");
			
			first = false;
		}
		if(num50 > 0)
		{
			if (!first)
			{
				result += " + ";
			}
			
			result += (num50 + "d50");
			
			first = false;
		}
		if(num100 > 0)
		{
			if (!first)
			{
				result += " + ";
			}
			
			result += (num100 + "d100");
			
			first = false;
		}
		if(modifier != 0)
		{
			if (!first)
			{
				result += " ";
				
			}
			
			if (modifier > 0)
			{
				result += "+ " + modifier;
			}
			else
			{
				result += "- " + (-1 * modifier);
			}
			
			first = false;
		}
		
		
		
		return result;
	}

}
