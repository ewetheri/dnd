package places;

import javafx.scene.paint.Color;

public enum Land {
	
	NONE				("none", Color.web("FFFFFF")),
	FIELDS				("field", Color.web("A3FF93")),
	PLAINS				("plains", Color.web("FFEC48")),
	WOODS				("woods", Color.web("1DE852")),
	FOREST				("forest", Color.web("00BD1F")),
	DEEP_FOREST			("deep forest", Color.web("00971F")),
	GLADE				("glade", Color.web("1EAE66")),
	HILLS				("hills", Color.web("ADE841")),
	MOUNTAINS			("mountains", Color.web("94542C")),
	DESERT				("desert", Color.web("FFBF25")),
	DEEP_DESERT			("deep desert", Color.web("E89716")),
	MESA				("mesa", Color.web("FF8A18")),
	CANYON				("canyon", Color.web("B26111")),
	BEACH				("beach", Color.web("FFE368")),
	OCEAN				("ocean", Color.web("2740FF")),
	DEEP_OCEAN			("deep ocean", Color.web("18289E")),
	FRESHWATER			("freshwater", Color.web("5969FF")),
	RAINFOREST			("rainforest", Color.web("00FF00")),
	TUNDRA				("tundra", Color.web("E81E0C")),
	SNOW_FIELDS			("snowy fields", Color.web("EDFFF3")),
	SNOW_FOREST			("snowy forest", Color.web("B7FFC2")),
	ICY_PLAINS			("icy plains", Color.web("B1C0FF")),
	ICY_MOUNTAINS		("icy mountains", Color.web("7F94DE")),
	CAVE_ENTRANCE		("cave entrance", Color.web("2D332F")),
	STRUCTURE			("structure", Color.web("E4B1FF")),
	VILLAGE				("village", Color.web("D28DFF")),
	TOWN				("town", Color.web("BE68FF")),
	CITY				("city", Color.web("9D29FF")),
	SWAMP				("swamp", Color.web("59511D")),
	VOID				("void", Color.web("000000"))
	
	;
	
	private String name;
	private Color color;
	
	
	Land(String name, Color color)
	{
		this.name = name;
		this.color = color;
	}
	
	public String type()
	{
		return name;
	}
	
	public Color color()
	{
		return color;
	}

}
