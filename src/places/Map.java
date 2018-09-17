package places;

public class Map {
	
	private String name;					//name of this map
	private String description;				//brief description of this map and/or the land it details
	private Map[][] details;				//the contents of the map
	private Land land;						//if a leaf map, what it is. If part of bigger map, the summary of the lands it contains.
	
	private final static int MAP_DIMENSIONS = 20;
	
	public Map(String name, String description, Land land)
	{
		this.name = name;
		this.description = description;
		this.land = land;
		this.details = null;
	}
	
	public void set(int row, int column, Map map)
	{
		if (details == null)
		{
			details = new Map[MAP_DIMENSIONS][MAP_DIMENSIONS];
			for (int i = 0; i < MAP_DIMENSIONS; i++)
			{
				for (int j = 0; j < MAP_DIMENSIONS; j++)
				{
					details[i][j] = new Map(land.type(), "", land);
				}
			}
		}
		
		details[row][column].setLand(map.land());
		
		//this.calculateLand();
	}
	
	public void set(int row, int column, Land land)
	{
		this.set(row, column, new Map(land.type(), "", land));
	}
	
	public Land get(int row, int column)
	{
		if (details == null)
		{
			return this.land;
		}
		
		return details[row][column].land();
	}
	
	public static int dimensions()
	{
		return MAP_DIMENSIONS;
	}
	
	private void calculateLand()
	{
		if (details != null)
		{
			Land[] lands = Land.values();
			int[] bins = new int[lands.length];
			
			for (int i = 0; i < MAP_DIMENSIONS; i++)
			{
				for (int j = 0; j < MAP_DIMENSIONS; j++)
				{
					String type = this.get(i, j).type();
					
					for (int k = 0; k < bins.length; k++)
					{
						if (type.equals(lands[k].type()))
						{
							bins[k]++;
							k = bins.length;
						}
					}
				}
			}
			
			int mostIndex = 0;
			int mostValue = bins[0];
			
			for (int i = 1; i < bins.length; i++)
			{
				if (bins[i] > mostValue)
				{
					mostIndex = i;
					mostValue = bins[i];
				}
			}
			
			this.land = lands[mostIndex];
			
		}
	}
	
	public String name()
	{
		return name;
	}
	
	public String description()
	{
		return description;
	}
	
	public Land land()
	{
		return land;
	}
	
	public String getType()
	{
		return land.type();
	}
	
	public void setLand(Land land)
	{
		this.land = land;
	}
	
}