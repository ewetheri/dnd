package dnd;

public class Money {

	private int copper;
	private int silver;
	private int electrum;
	private int gold;
	private int platinum;
	
	Money (int copper)
	{
		this(copper, 0, 0, 0, 0);
	}
	
	Money (int copper, int silver)
	{
		this(copper, silver, 0, 0, 0);
	}
	
	Money (int copper, int silver, int electrum)
	{
		this(copper, silver, electrum, 0, 0);
	}
	
	Money (int copper, int silver, int electrum, int gold)
	{
		this(copper, silver, electrum, gold, 0);
	}
	
	Money (int copper, int silver, int electrum, int gold, int platinum)
	{
		this.copper = copper;
		this.silver = silver;
		this.electrum = electrum;
		this.gold = gold;
		this.platinum = platinum;
		
		this.simplify();
	}
	
	public int numCopper()
	{
		return copper;
	}
	
	public int numSilver()
	{
		return silver;
	}
	
	public int numElectrum()
	{
		return electrum;
	}
	
	public int numGold()
	{
		return gold;
	}
	
	public int numPlatinum()
	{
		return platinum;
	}
	
	public int value()
	{
		return (int)this.valueInCopper();
	}
	
	public double valueInCopper()
	{
		return copper + (silver * 10) + (electrum * 50) + (gold * 100) + (platinum * 1000);
	}
	
	public double valueInSilver()
	{
		return ((double)copper * 0.1) + silver + (electrum * 5) + (gold * 10) +  (platinum * 100);
	}
	
	public double valueInElectrum()
	{
		return ((double)copper * 0.02) + ((double)silver * 0.2) + electrum + (gold * 2) + (platinum * 20);
	}
	
	public double valueInGold()
	{
		return ((double)copper * 0.01) + ((double)silver * 0.1) + ((double)electrum * 0.5) + gold + (platinum * 10);
	}
	
	public double valueInPlatinum()
	{
		return ((double)copper * 0.001) + ((double)silver * 0.01) + ((double)electrum * 0.05) + ((double)gold * 0.1) + platinum;
	}
	
	public void simplify()
	{
		//simplifying excess amounts of smaller coins into larger coins.
		while (copper > 9)
		{
			copper -= 10;
			silver += 1;
		}
		while (silver > 4)
		{
			silver -= 5;
			electrum += 1;
		}
		while (electrum > 1)
		{
			electrum -= 2;
			gold += 1;
		}
		while (gold > 9)
		{
			gold -= 10;
			platinum += 1;
		}
		
		
		//simplifying negative amounts of coins into positive by reducing larger coins.
		while (copper < 0)
		{
			silver -= 1;
			copper += 10;
		}
		while (silver < 0)
		{
			electrum -= 1;
			silver += 5;
		}
		while (electrum < 0)
		{
			gold -= 1;
			electrum += 2;
		}
		while (gold < 0)
		{
			platinum -= 1;
			gold += 10;
		}
		
		//check we went far enough, otherwise try again
		if (copper < 0 || silver < 0 || electrum < 0 || gold < 0 || platinum < 0
				|| copper > 9 || silver > 4 || electrum > 1 || gold > 9)
		{
			this.simplify();
		}
	}
	
	public void add(Money value)
	{
		this.gain(value);
	}
	
	public void gain(Money value)
	{
		this.copper += value.numCopper();
		this.silver += value.numSilver();
		this.electrum += value.numElectrum();
		this.gold += value.numGold();
		this.platinum += value.numPlatinum();
		
		this.simplify();
	}
	
	public void spend(Money value)
	{
		if (this.value() < value.value())
			throw new IllegalArgumentException("You cannot spend more money than you have.");
		else
		{
			this.copper -= value.numCopper();
			this.silver -= value.numSilver();
			this.electrum -= value.numElectrum();
			this.gold -= value.numGold();
			this.platinum -= value.numPlatinum();
			
			this.simplify();
		}
	}
	
	public String toString()
	{
		return copper + "cp " + silver + "sp " + electrum + "ep " + gold + "gp " + platinum + "pp";
	}
	
	public boolean equals(Money other)
	{
		if (this.value() == other.value())
		{
			return true;
		}
		
		return false;
	}
	
}
