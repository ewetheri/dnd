package gui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Test extends Application {
	
	public Font huge = null;
	public Font big = null;
	public Font medium = null;
	public Font small = null;
	public Font tiny = null;
	private final int ANIMATION_LENGTH = 2;
	
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		huge = Font.loadFont(new FileInputStream(new File(".\\fonts\\Supernatural_Knight.ttf")), 100);
		big = Font.loadFont(new FileInputStream(new File(".\\fonts\\Supernatural_Knight.ttf")), 36);
		medium = Font.loadFont(new FileInputStream(new File(".\\fonts\\Supernatural_Knight.ttf")), 20);
		small = Font.loadFont(new FileInputStream(new File(".\\fonts\\Supernatural_Knight.ttf")), 16);
		tiny =  Font.loadFont(new FileInputStream(new File(".\\fonts\\Supernatural_Knight.ttf")), 12); 
		
		primaryStage.setTitle("Campfire Knights"); 
		primaryStage.setResizable(false);
		
		Group root = new Group();
		ObservableList<Node> rootList = root.getChildren();
		
		//background
		Rectangle bg = new Rectangle(10,10,980,580);
		//rectangle.setFill(Color.web("0xFFEDA3"));
		bg.setFill(Color.WHITE);
		bg.setArcHeight(25);
		bg.setArcWidth(50);
		rootList.add(bg);
		
		titleScreen(primaryStage, root);
		
		Scene scene = new Scene(root, 1000, 600);
		scene.setFill(Color.BLACK);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	
	public static void main (String[] args)
	{
		launch(args);
	}
	
	public void titleScreen(Stage primaryStage, Group root) throws Exception
	{
		ObservableList<Node> rootList = root.getChildren();
				
		//Title CK
		Text c = new Text("C");
		c.setX(50);
		c.setY(325);
		c.setFont(huge);
		Text k = new Text("K");
		k.setX(850);
		k.setY(325);
		k.setFont(huge);
				
		
				
		//image!
		Image image = new Image("file:\\" + System.getProperty("user.dir") + "\\images\\flame.png");
		ImageView imageView = new ImageView(image);
		imageView.setPreserveRatio(true);
		Glow glow = new Glow();
		glow.setLevel(0.2);
		imageView.setEffect(glow);
		imageView.setX(210);
		imageView.setY(10);
		imageView.setFitWidth(580);
		imageView.setFitHeight(580);
		
		//Button
		Button startButton = new Button("Click to Begin");
		startButton.setDefaultButton(true);
		startButton.setFont(medium);
		startButton.setPadding(new Insets(0, 5, 10, 5));
		startButton.setLayoutX(420);
		startButton.setLayoutY(525);
		
		//adding elements to scene
		rootList.add(imageView);
		rootList.add(c);
		rootList.add(k);
		rootList.add(startButton);
		
		//animation to play when clicking StartButton
		Timeline timeline = new Timeline(
			new KeyFrame(Duration.ZERO, 
				new KeyValue(glow.levelProperty(), 0.2),
				new KeyValue(imageView.opacityProperty(), 1),
				new KeyValue(c.opacityProperty(), 1),
				new KeyValue(k.opacityProperty(), 1),
				new KeyValue(c.translateXProperty(), 0),
				new KeyValue(k.translateXProperty(), 0)),
			new KeyFrame(Duration.seconds(ANIMATION_LENGTH),
				new KeyValue(glow.levelProperty(), 1),
				new KeyValue(imageView.opacityProperty(), 0.5),
				new KeyValue(c.opacityProperty(), 1),
				new KeyValue(k.opacityProperty(), 1),
				new KeyValue(c.translateXProperty(), 0),
				new KeyValue(k.translateXProperty(), 0)),
			new KeyFrame(Duration.seconds(ANIMATION_LENGTH*2),
				new KeyValue(glow.levelProperty(), 1),
				new KeyValue(imageView.opacityProperty(), 0),
				new KeyValue(c.opacityProperty(), 0),
				new KeyValue(k.opacityProperty(), 0),
				new KeyValue(c.translateXProperty(), 200),
				new KeyValue(k.translateXProperty(), -200))
		);
			    
			    
				
				
				//things to remove when clicking startButton
				EventHandler<MouseEvent> buttonClick = new EventHandler<MouseEvent>()
				{ 
					@Override 
					public void handle(MouseEvent e) { 
							rootList.remove(startButton);
							timeline.play();
					} 
			    }; 
			    
			    EventHandler<ActionEvent> openLogin = new EventHandler<ActionEvent>()
				{ 
					@Override 
					public void handle(ActionEvent e) {
							rootList.remove(c);
							rootList.remove(k);
							rootList.remove(imageView);
							
							try {
								login(primaryStage, root);
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
					} 
			    };
			    
			    timeline.setOnFinished(openLogin);
			    
			    
			    startButton.addEventFilter(MouseEvent.MOUSE_CLICKED, buttonClick);
				
			    
	}
	
	
	public void login(Stage primaryStage, Group root) throws Exception
	{
		ObservableList<Node> rootList = root.getChildren();
		
		String ip = Test.getIp();
		
		Text hostIP = new Text(ip);
		hostIP.setFont(small);
		
		TextField hostPort = new TextField("Port to use.");
		hostPort.setFont(small);
		
		TextField joinIP = new TextField("IP to connect to.");
		joinIP.setFont(small);
		
		TextField joinPort = new TextField("Port to connect to.");
		joinPort.setFont(small);
		
		Button host = new Button("Host");
		host.setFont(small);
		host.setMinWidth(300);
		
		Button join = new Button("Join");
		join.setFont(small);
		join.setMinWidth(300);
		
		GridPane form = new GridPane();
		
		form.setPadding(new Insets(200,180,200,180));
		form.setVgap(40);
		form.setHgap(30);
		
		form.add(hostIP, 0, 0);
		form.add(hostPort, 0, 1);
		form.add(host, 0, 2);
		form.add(joinIP, 1, 0);
		form.add(joinPort, 1, 1);
		form.add(join, 1, 2);
		
		rootList.add(form);
		
		//animation to play when clicking host button
		Timeline timeline = new Timeline(
			new KeyFrame(Duration.ZERO, 
				new KeyValue(form.opacityProperty(), 1)),
			new KeyFrame(Duration.seconds(ANIMATION_LENGTH),
				new KeyValue(form.opacityProperty(), 0))
			);
					    
		//things to remove when clicking startButton
		EventHandler<MouseEvent> buttonClick = new EventHandler<MouseEvent>()
		{ 
			@Override 
			public void handle(MouseEvent e) { 
				timeline.play();
			} 
		}; 
					    
		EventHandler<ActionEvent> openMenu = new EventHandler<ActionEvent>()
		{ 
			@Override 
			public void handle(ActionEvent e) {
				rootList.remove(form);
					
				try
				{
					mainMenu(primaryStage, root);
				}
				catch (Exception e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} 
		};
					    
		timeline.setOnFinished(openMenu);
					    
		host.addEventFilter(MouseEvent.MOUSE_CLICKED, buttonClick);
		
	}
	
	public void mainMenu(Stage primaryStage, Group root)
	{
		ObservableList<Node> rootList = root.getChildren();
		
		Line line1 = new Line(25, 50, 975, 50);
		rootList.add(line1);
		
		Line line2 = new Line(180, 60, 180, 580);
		rootList.add(line2);
		
		BorderPane hub = new BorderPane();
		hub.setPadding(new Insets(20,20,20,20));
		hub.setPrefWidth(980);
		hub.setPrefHeight(580);
		
		Text title = new Text("Campfire Knights");
		title.setFont(medium);
		hub.setTop(title);
		
		VBox navBar = new VBox();
		navBar.setMaxWidth(175);
		navBar.setSpacing(25);
		navBar.setPadding(new Insets(25, 0, 25, 0));
		
		Button characters = new Button("Characters");
		characters.setFont(small);
		characters.setMinWidth(150);
		Button map = new Button("Map");
		map.setFont(small);
		map.setMinWidth(150);
		Button lore = new Button("Lore");
		lore.setFont(small);
		lore.setMinWidth(150);
		
		navBar.getChildren().addAll(characters, map, lore);
		
		hub.setLeft(navBar);
		
		rootList.add(hub);
		
		
		
		EventHandler<MouseEvent> charactersClick = new EventHandler<MouseEvent>()
		{ 
			@Override 
			public void handle(MouseEvent e) { 
				BorderPane characterViewer = new BorderPane();
				characterViewer.setPadding(new Insets(10));;
				hub.setCenter(characterViewer);
				
				VBox charList = new VBox();
				charList.setSpacing(10);
				charList.setPadding(new Insets(10));
				
				Text charListTitle = new Text("Character List");
				charListTitle.setFont(small);
				
				charList.getChildren().add(charListTitle);
				
				//Insert code to retrieve characters here.
				//Each character should be a button, clicking sets characterViewer.center() to a view of that character's stats.
				
				characterViewer.setLeft(charList);
				
				Button newCharacter = new Button("Make a New Character");
				newCharacter.setFont(tiny);
				newCharacter.setMinWidth(300);
				newCharacter.setAlignment(Pos.CENTER);
				

				characterViewer.setAlignment(newCharacter, Pos.CENTER);
				
				characterViewer.setBottom(newCharacter);
			} 
		};
		
		EventHandler<MouseEvent> mapClick = new EventHandler<MouseEvent>()
		{ 
			@Override 
			public void handle(MouseEvent e) { 
				hub.setCenter(null);
			} 
		};
		
		EventHandler<MouseEvent> loreClick = new EventHandler<MouseEvent>()
		{ 
			@Override 
			public void handle(MouseEvent e) { 
				hub.setCenter(null);
			} 
		};
		
		characters.addEventFilter(MouseEvent.MOUSE_CLICKED, charactersClick);
		map.addEventFilter(MouseEvent.MOUSE_CLICKED, mapClick);
		lore.addEventFilter(MouseEvent.MOUSE_CLICKED, loreClick);
		
	}
	
	public static String getIp() throws Exception {
        URL whatismyip = new URL("http://checkip.amazonaws.com");
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(
                    whatismyip.openStream()));
            String ip = in.readLine();
            return ip;
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
