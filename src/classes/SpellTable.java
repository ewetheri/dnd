package classes;

public class SpellTable {
	
	private int[][] table;
	private int[] cantrips;
	private int[] spellsKnown;
	
	public SpellTable()
	{
		cantrips = new int[20];
		spellsKnown = new int[20];
		table = new int[20][9];
	}
	
	public SpellTable(int[][] table, int[] cantrips, int[] spellsKnown)
	{
		this.setCantrips(cantrips);
		this.setSpellsKnown(spellsKnown);
		this.setSpellTable(table);
	}
	
	public int getCantripsAtLevel(int level)
	{
		return cantrips[level];
	}
	
	public int getSpellsKnown(int level)
	{
		return spellsKnown[level];
	}
	
	public int[][] getSpellTable()
	{
		return table;
	}
	
	public SpellTable setSpellTable(int[][] spellTable)
	{
		if (table.length == 20 && table[0].length == 9)
		{
			this.table = table;
		}
		return this;
	}
	
	public SpellTable setCantrips(int[] cantrips)
	{
		if (cantrips.length == 9)
		{
			this.cantrips = cantrips;
		}
		return this;
	}
	
	public SpellTable setSpellsKnown(int[] spellsKnown)
	{
		if (spellsKnown.length == 9)
		{
			this.spellsKnown = spellsKnown;
		}
		return this;
	}

}
