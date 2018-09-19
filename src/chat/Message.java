package chat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import gui.Main;
import gui.User;
import javafx.scene.Group;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Message {
	
	protected User user;
	protected Date dt;
	protected String contents;
	
	private static Font mFont = new Font(10);
	public static final DateFormat mDate = new SimpleDateFormat("HH:mm:ss");
	
	public Message(User user, String contents)
	{
		this.user = user;
		dt = new Date();
		this.contents = contents;
	}
	
	public static Font font()
	{
		return mFont;
	}
	
	public Date date()
	{
		return dt;
	}
	
	public User user()
	{
		return user;
	}
	
	public String username()
	{
		return user.username();
	}
	
	public boolean host()
	{
		return user.host();
	}
	
	public String contents()
	{
		return contents;
	}
	
	public Group toGUI()
	{
		Group output = new Group();
		
		HBox all = new HBox();
		
		HBox info = new HBox();
		
		VBox contents = new VBox();
		
		Text date = new Text(mDate.format(dt) + " | ");
		date.setFont(mFont);
		date.setFill(Color.GRAY);
		
		Text user = new Text("[" + this.username() + "]");
		user.setFont(mFont);
		if (this.user().host())
		{
			user.setFill(Color.DARKMAGENTA);
		}
		else
		{
			user.setFill(Color.CRIMSON);
		}
		
		Text colon = new Text(": ");
		colon.setFont(mFont);
		colon.setFill(Color.GRAY);
		
		Text content = new Text(this.contents);
		content.setFont(mFont);
		
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
