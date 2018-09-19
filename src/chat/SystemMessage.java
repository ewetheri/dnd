package chat;

import gui.SystemUser;
import javafx.scene.Group;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class SystemMessage extends Message {

	
	SystemMessage(String contents)
	{
		super(SystemUser.get(), contents);
	}
	
	@Override
	public Group toGUI()
	{
		Group output = new Group();
		
		HBox all = new HBox();
		
		HBox info = new HBox();
		
		VBox contents = new VBox();
		
		Text date = new Text(mDate.format(dt) + " | ");
		date.setFont(Message.font());
		date.setFill(Color.GRAY);
		
		Text user = new Text("[" + this.username() + "]");
		user.setFont(Message.font());
		user.setFill(Color.ORANGE);
		
		Text colon = new Text(": ");
		colon.setFont(Message.font());
		colon.setFill(Color.GRAY);
		
		Text content = new Text(this.contents);
		content.setFont(Message.font());
		content.setFill(Color.GRAY);
		
		info.getChildren().add(date);
		info.getChildren().add(user);
		info.getChildren().add(colon);
		
		contents.getChildren().add(content);
		
		all.getChildren().add(info);
		all.getChildren().add(contents);
		
		output.getChildren().add(all);
		
		return output;
	}
}
