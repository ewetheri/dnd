package gui;

import chat.Message;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Border;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ChatViewer {
	
	private static VBox view;
	private static VBox all;
	private static Message[] messages;
	private static int numMessages;
	
	ChatViewer()
	{
		all = new VBox();
		all.setPadding(new Insets(10,2,2,2));
		all.setSpacing(1);
		all.maxWidth(200);
		
		view = new VBox();
		view.setSpacing(1);
		view.setMinHeight(400);
		
		all.getChildren().add(view);
		
		HBox response = new HBox();
		
		TextField typeHere = new TextField();
		typeHere.setPromptText("Type here...");
		typeHere.setFont(Message.font());
		typeHere.setMinWidth(150);
		
		Button send = new Button("Send");
		send.setFont(Message.font());
		
		messages = new Message[10];
		numMessages = 0;
		
		response.getChildren().add(typeHere);
		response.getChildren().add(send);
		all.getChildren().add(response);
		
		EventHandler<MouseEvent> sendChat = new EventHandler<MouseEvent>()
		{ 
			@Override 
			public void handle(MouseEvent e) { 
				if (typeHere.getText() != null && typeHere.getText().length() > 0)
				{
					add(new Message(CurrentUser.get(), typeHere.getText()));
					typeHere.setText("");
				}
				
			} 
		};
		
		EventHandler<KeyEvent> sendChatEnter = new EventHandler<KeyEvent>()
		{
			@Override 
			public void handle(KeyEvent e) { 
				if (e.getCode().equals(KeyCode.ENTER) && typeHere.getText() != null && typeHere.getText().length() > 0)
				{
					add(new Message(CurrentUser.get(), typeHere.getText()));
					typeHere.setText("");
				}
				
			} 
		};
		
		send.addEventFilter(MouseEvent.MOUSE_CLICKED, sendChat);
		send.addEventFilter(KeyEvent.KEY_PRESSED, sendChatEnter);
		typeHere.addEventFilter(KeyEvent.KEY_PRESSED, sendChatEnter);
	}
	
	
	private static void expand()
	{
		Message[] newMessages = new Message[messages.length * 2];
		
		for (int i = 0; i < messages.length; i++)
		{
			newMessages[i] = messages[i];
		}
		
		messages = newMessages;
	}
	
	public static void add(Message message)
	{
		if (numMessages >= messages.length)
		{
			expand();
		}
		
		messages[numMessages] = message;
		
		numMessages++;
		
		view.getChildren().add(message.toGUI());
	}
	
	public static Message get(int index)
	{
		return messages[index];
	}
	
	public static int size()
	{
		return numMessages;
	}
	
	public static VBox view()
	{
		return all;
	}

}
