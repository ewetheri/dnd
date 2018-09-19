package gui;

import chat.Message;
import chat.RollMessage;
import dnd.Dice;
import dnd.Die;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class DiceViewer {
	
	private static HBox all;
	
	private static final int NUM_DIE = 8;
	
	
	DiceViewer()
	{
		all = new HBox();
		all.setPadding(new Insets(10));
		all.setAlignment(Pos.BASELINE_CENTER);
		all.setSpacing(30);
		all.maxHeight(50);
		
		for (int i = 0; i < NUM_DIE; i++)
		{
			int dieNum = i;
			
			VBox panel = new VBox();
			panel.setAlignment(Pos.CENTER);
			panel.setSpacing(5);
			
			Text name = new Text(indexToDie(i).diceName());
			name.setFont(Main.medium);
			
			HBox multi = new HBox();
			TextField number = new TextField("0");
			number.setFont(Message.font());
			number.setMaxWidth(25);
			Button minus = new Button("-");
			minus.setFont(Message.font());
			Button plus = new Button("+");
			plus.setFont(Message.font());
			
			multi.getChildren().addAll(minus, number, plus);
			
			panel.getChildren().addAll(name, multi);
			
			all.getChildren().add(panel);
			
			EventHandler<MouseEvent> dieClick = new EventHandler<MouseEvent>()
			{ 
				@Override 
				public void handle(MouseEvent e) { 
					ChatViewer.add(new RollMessage(CurrentUser.get(), new Dice(indexToDie(dieNum))));
				} 
			};
			
			name.addEventFilter(MouseEvent.MOUSE_CLICKED, dieClick);
		}
		
		
		
	}
	
	public static HBox view()
	{
		return all;
	}
	
	private static Die indexToDie(int index)
	{
		switch (index)
		{
			case 0: return Die.D2;
			case 1: return Die.D4;
			case 2: return Die.D6;
			case 3: return Die.D8;
			case 4: return Die.D10;
			case 5: return Die.D12;
			case 6: return Die.D20;
			default: return Die.D100;
		}
			
			
	}

}
