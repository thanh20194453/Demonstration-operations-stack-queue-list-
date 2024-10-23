package Screen;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.ArrayList;

import Main.MainMenu;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
 
public class MainScreen extends Application {
   	static Group group = new Group();
	static Group group1 = new Group();
	static int locationX = 10; //vitri cua cacs phims chucs nawng
	static int locationY = 90;
	
	static int location1X = 30; //vitri cua cacs button so
	static int location1Y = 350;
    static Button btnBack = new Button();
    
    public static void MainScreen() {
    	
    	Label l = new Label("Choose the data structure");
    	l.setFont(new Font("Arial", 24));
		l.setLayoutX(100);
		l.setLayoutY(40);
		group1.getChildren().addAll(l);
		
		final Button btnList = new Button();
		btnList.setPrefHeight(100);
		btnList.setPrefWidth(100);
		btnList.setText("List");
		btnList.setLayoutX(60);
		btnList.setLayoutY(200);
		btnList.setStyle("-fx-background-color: #00ffff");
		group1.getChildren().addAll(btnList);
		
		btnList.setOnAction(new EventHandler<ActionEvent>() {
		    public void handle(ActionEvent event) {
		    	calllist();
		    }
		});
		final Button btnStack = new Button();
		btnStack.setPrefHeight(100);
		btnStack.setPrefWidth(100);
		btnStack.setText("Stack");
		btnStack.setLayoutX(270);
		btnStack.setLayoutY(200);
		btnStack.setStyle("-fx-background-color: #00ffff");
		group1.getChildren().addAll(btnStack);
		
		btnStack.setOnAction(new EventHandler<ActionEvent>() {
		    public void handle(ActionEvent event) {
		    	callstack();
		    }
		});
		final Button btnQueue = new Button();
		btnQueue.setPrefHeight(100);
		btnQueue.setPrefWidth(100);
		btnQueue.setText("Queue");
		btnQueue.setLayoutX(480);
		btnQueue.setLayoutY(200);
		btnQueue.setStyle("-fx-background-color: #00ffff");
		group1.getChildren().addAll(btnQueue);
		
		btnQueue.setOnAction(new EventHandler<ActionEvent>() {
		    public void handle(ActionEvent event) {
		    	callqueue();
		    }
		});
    }
//----------------------------khai bao cac bien---------------------------------------
    @Override
    public void start(Stage primaryStage) throws Exception {
    	MenuBar menuBar = new MenuBar();
        VBox vBox = new VBox(menuBar);
        Menu menuselect = new Menu("Data Structures");
        Menu help = new Menu();
        Menu quit = new Menu();
        menuBar.getMenus().add(menuselect);
        menuBar.getMenus().add(help);
        menuBar.getMenus().add(quit);
        MenuItem list = new MenuItem("List");
        MenuItem stack = new MenuItem("Stack");
        MenuItem queue = new MenuItem("Queue");

        menuselect.getItems().add(list);
        menuselect.getItems().add(stack);
        menuselect.getItems().add(queue);
        menuselect.setOnHidden(new EventHandler<Event>() {
			public void handle(Event e) {
				cleargroup();
				}
		});
        
        Label h = new Label("Help");
        h.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
            	new Help();
            }
        });
        help.setGraphic(h);
        
        Label q = new Label("Quit");
        q.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
            	//Platform.exit();
            	System.exit(0);
            }
        });
        quit.setGraphic(q);
        
        list.setOnAction(new EventHandler<ActionEvent>() {
		    public void handle(ActionEvent event) {
		    	calllist();
		    }
		});
        stack.setOnAction(new EventHandler<ActionEvent>() {
 		    public void handle(ActionEvent event) {
		    	callstack();
 		    }
 		});
        queue.setOnAction(new EventHandler<ActionEvent>() {
 		    public void handle(ActionEvent event) {
		    	callqueue();
 		    }
 		});
    	btnBack.setText("Back to Menu");
		btnBack.setLayoutX(520);
		btnBack.setLayoutY(420);
		btnBack.setVisible(false);
		group.getChildren().addAll(btnBack);
		
		btnBack.setOnAction(new EventHandler<ActionEvent>() {
		    public void handle(ActionEvent event) {
		    	cleargroup();
				btnBack.setVisible(false);
		    	group1.getChildren().clear();
		    	group1.getChildren().addAll();
				MainScreen();
		    }
		});
		MainScreen();
        group.getChildren().addAll(vBox,group1);
    	//group1.getChildren().addAll(AnimationStack.run());
        Scene scene = new Scene(group, 640, 480);
        primaryStage.setScene(scene);
        primaryStage.setTitle("MainScreen");
        primaryStage.show();
    }
    public static void run() {
        Application.launch();
    }
    
	public static void main(String[] args) {
		new MainMenu().setVisible(true);
	}
	
    public static void cleargroup() {
    	AnimationList.group.getChildren().clear();
    	AnimationStack.group.getChildren().clear();
    	AnimationQueue.group.getChildren().clear();
    }
    public static void calllist() {
    	group1.getChildren().clear();
    	group1.getChildren().addAll(AnimationList.run());
    	btnBack.setVisible(true);
    }
    public static void callstack() {
    	group1.getChildren().clear();
    	group1.getChildren().addAll(AnimationStack.run());
    	btnBack.setVisible(true);
    }
    public static void callqueue() {
    	group1.getChildren().clear();
	    	group1.getChildren().addAll(AnimationQueue.run());
			btnBack.setVisible(true);
    }
 
}
