package gui;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import places.Land;
import places.Map;

public class MapViewer {

	private Group mapHandle;
	private Rectangle[][] view;
	private Rectangle[] palette;
	private Land selected;
	private Map map;
	
	
	
	private final static int RECTANGLE_SIZE = 10;
	
	MapViewer(Map map)
	{
		
		this.mapHandle = new Group();
		this.view = new Rectangle[Map.dimensions()][Map.dimensions()];
		selected = Land.NONE;
		this.map = map;
		
		Rectangle bg = new Rectangle(0, 0, ((RECTANGLE_SIZE + 8)*view.length), ((RECTANGLE_SIZE + 2)*view.length));
		bg.setFill(Color.WHITE);
		mapHandle.getChildren().add(bg);
		
		
		this.buildMap();
		
		this.buildPalette();
		
	}
	
	private void buildMap()
	{
		for (int i = 0; i < Map.dimensions(); i++)
		{
			for (int j = 0; j < Map.dimensions(); j++)
			{
				view[i][j] = new Rectangle(((j+2)*RECTANGLE_SIZE), ((i+2)*RECTANGLE_SIZE), (RECTANGLE_SIZE), (RECTANGLE_SIZE));
				Land temp = map.get(i, j);
				view[i][j].setFill(temp.color());
				Text tooltip = new Text(temp.type());
				tooltip.setFont(Main.tiny);
				tooltip.toFront();
				
				int row = i;
				int column = j;
				
				EventHandler<MouseEvent> mapEnter = new EventHandler<MouseEvent>()
				{ 
					@Override 
					public void handle(MouseEvent e) { 
						tooltip.setText(map.get(row, column).type());
						tooltip.setX(e.getX() + RECTANGLE_SIZE);
						tooltip.setY(e.getY() - RECTANGLE_SIZE);
						mapHandle.getChildren().add(tooltip);
					} 
				};
				
				EventHandler<MouseEvent> mapClick = new EventHandler<MouseEvent>()
				{ 
					@Override 
					public void handle(MouseEvent e) { 
						System.out.println(map.get(row, column).type() + " at " + row + ", " + column + " set to " + temp.type() + ".");
						map.set(row, column, selected);
						view[row][column].setFill(selected.color());
					} 
				};
				
				EventHandler<MouseEvent> mapExit = new EventHandler<MouseEvent>()
				{ 
					@Override 
					public void handle(MouseEvent e) { 
						mapHandle.getChildren().remove(tooltip);
					} 
				};
				
				view[i][j].addEventFilter(MouseEvent.MOUSE_ENTERED_TARGET, mapEnter);
				view[i][j].addEventFilter(MouseEvent.MOUSE_CLICKED, mapClick);
				view[i][j].addEventFilter(MouseEvent.MOUSE_EXITED, mapExit);
				this.mapHandle.getChildren().add(view[i][j]);
			}
		}
	}
	
	public void buildPalette()
	{
		Land[] lands = Land.values();
		this.palette = new Rectangle[lands.length];
		
		int paletteOffsetX = (RECTANGLE_SIZE * (Map.dimensions() + 4));
		int paletteOffsetY = 2 * RECTANGLE_SIZE;
		Rectangle selectedLand = new Rectangle(paletteOffsetX, paletteOffsetY, (RECTANGLE_SIZE*2), (RECTANGLE_SIZE*2));
		paletteOffsetY += 2 * RECTANGLE_SIZE;
		selectedLand.setFill(selected.color());
		this.mapHandle.getChildren().add(selectedLand);
		
		for (int i = 0; i < palette.length; i++)
		{
			Land land = lands[i];
			if (paletteOffsetX == (RECTANGLE_SIZE * (Map.dimensions() + 4)) && i > (palette.length/2))
			{
				paletteOffsetX += RECTANGLE_SIZE;
				paletteOffsetY = 4 * RECTANGLE_SIZE;
			}
			palette[i] = new Rectangle((paletteOffsetX), paletteOffsetY, (RECTANGLE_SIZE), (RECTANGLE_SIZE));
			palette[i].setFill(land.color());
			
			Text tooltip = new Text(land.type());
			tooltip.setFont(Main.tiny);
			tooltip.toFront();
			
			EventHandler<MouseEvent> brushEnter = new EventHandler<MouseEvent>()
			{ 
				@Override 
				public void handle(MouseEvent e) { 
					tooltip.setX(e.getX() + RECTANGLE_SIZE);
					tooltip.setY(e.getY() - RECTANGLE_SIZE);
					mapHandle.getChildren().add(tooltip);
				} 
			};
			
			EventHandler<MouseEvent> brushClick = new EventHandler<MouseEvent>()
			{ 
				@Override 
				public void handle(MouseEvent e) { 
					selected = land;
					selectedLand.setFill(selected.color());
				} 
			};
			
			EventHandler<MouseEvent> brushExit = new EventHandler<MouseEvent>()
			{ 
				@Override 
				public void handle(MouseEvent e) { 
					mapHandle.getChildren().remove(tooltip);
				} 
			};
			
			palette[i].addEventFilter(MouseEvent.MOUSE_ENTERED_TARGET, brushEnter);
			palette[i].addEventFilter(MouseEvent.MOUSE_CLICKED, brushClick);
			palette[i].addEventFilter(MouseEvent.MOUSE_EXITED, brushExit);
			
			
			this.mapHandle.getChildren().add(palette[i]);
			paletteOffsetY += RECTANGLE_SIZE;
		}
	}
	
	public Rectangle[][] getMap()
	{
		return view;
	}
	
	public Group getHandle()
	{
		return mapHandle;
	}

}
