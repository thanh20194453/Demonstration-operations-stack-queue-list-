package Screen;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.Duration;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.ArrayList;

import DataStructures.MyQueue;
import DataStructures.MyStack;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
 
public class AnimationStack {
	static ArrayList<Button> btn = new ArrayList<Button>();
	static Group group = new Group();	//gop cac button chuc nang
	static Group group1 = new Group(); //gop cac button so
	
	static int locationX = MainScreen.locationX;
	static int locationY = MainScreen.locationY;
	
	static int location1X = MainScreen.location1X;
	static int location1Y = MainScreen.location1Y;
	
	static Label l = new Label("Demonstration of operations on Stack ");
	static Label lb1 = new Label();
    static public Group run() {
    	
//----------------------------khai bao cac bien---------------------------------------
		l.setFont(new Font("Arial", 24));
		l.setLayoutX(100);
		l.setLayoutY(40);
		final Button Menuselect1 = new Button();
		Menuselect1.setPrefSize(38, 116);
		Image menuselect1img = new Image("menuselect1.png");
	    ImageView view1 = new ImageView(menuselect1img);
	    view1.setPreserveRatio(true);
	    
	    Menuselect1.setGraphic(view1);
		final Button Menuselect2 = new Button();
		Menuselect2.setPrefSize(38, 116);
	    
	    Image menuselect2img = new Image("menuselect2.png");
	    ImageView view2 = new ImageView(menuselect2img);
	    view2.setPreserveRatio(true);
	    
	    Menuselect2.setGraphic(view2);
	    Menuselect2.setVisible(false);

//-------------------------------------------button create---------------------------------
    	final Button btnCreate = new Button();
		btnCreate.setText("Create Random");
		btnCreate.setOnAction(new EventHandler<ActionEvent>() {
		    public void handle(ActionEvent event) {
		    	MyStack.CreateRandom();
		    	update();
		    	btnCreate.setText("Create Again");
		    }
		});
		
		btnCreate.setLayoutX(locationX+60);
		btnCreate.setLayoutY(locationY);
		group.getChildren().addAll(btnCreate);
//------------------------------------button push--------------------------------------------
		
		final Button btnPushRandom = new Button();
		btnPushRandom.setText("Push Random");
		btnPushRandom.setVisible(false);
		btnPushRandom.setOnAction(new EventHandler<ActionEvent>() {
		    public void handle(ActionEvent event) {
		    	int value = (int)Math.floor(Math.random()*(99-0+1)+0);
		        push(value);
		    }
		});
		
		
		btnPushRandom.setLayoutX(locationX+120);
		btnPushRandom.setLayoutY(locationY+33);
		group.getChildren().addAll(btnPushRandom);

		final TextField push = new TextField();
		push.setVisible(false);
		push.setLayoutX(locationX+320);
		push.setLayoutY(locationY+33);
		group.getChildren().addAll(push);
		
		final Button btnPushValue = new Button();
		btnPushValue.setText("Push Value");
		btnPushValue.setVisible(false);
		btnPushValue.setLayoutX(locationX+230);
		btnPushValue.setLayoutY(locationY+33);
		group.getChildren().addAll(btnPushValue);
		btnPushValue.setOnAction(new EventHandler<ActionEvent>() {
		    public void handle(ActionEvent event) {
		    	int value = Integer.parseInt(push.getText());
		        push(value);
		    }
		});
		
		final Button btnPush = new Button();
		btnPush.setText("Push");
		btnPush.setLayoutX(locationX+60);
		btnPush.setLayoutY(locationY+33);
		group.getChildren().addAll(btnPush);
		btnPush.setOnAction(new EventHandler<ActionEvent>() {
		    public void handle(ActionEvent event) {
		    	if (btnPushRandom.isVisible() == false) {
		    	btnPushRandom.setVisible(true);
		    	btnPushValue.setVisible(true);
				push.setVisible(true);
		    	}
		    	else {
			    	btnPushRandom.setVisible(false);
			    	btnPushValue.setVisible(false);
					push.setVisible(false);
		    	}
		    }
		});
		
//----------------------------------------button pop-------------------------------------
		
		final Button btnPop = new Button();
		btnPop.setText("Pop");
		btnPop.setOnAction(new EventHandler<ActionEvent>() {
		    public void handle(ActionEvent event) {
		    	pop();
		    }
		});
		
		btnPop.setLayoutX(locationX+60);
		btnPop.setLayoutY(locationY+66);
		group.getChildren().addAll(btnPop);
		
//--------------------------------button reset------------------------------------------
		
		final Button btnReset = new Button();
		btnReset.setText("Reset");
		btnReset.setOnAction(new EventHandler<ActionEvent>() {
		    public void handle(ActionEvent event) {
		    	btn.clear();
		    	group1.getChildren().clear();
		    	btnCreate.setText("Create Random");
		    }
		});
		
		btnReset.setLayoutX(locationX+60);
		btnReset.setLayoutY(locationY+100);
		group.getChildren().addAll(btnReset);
		
//................................menu chuc nang.....................................
	    Menuselect1.setOnAction(new EventHandler<ActionEvent>() {
		    public void handle(ActionEvent event) {
		    	btnCreate.setVisible(false);
		    	btnPush.setVisible(false);
		    	btnPop.setVisible(false);
		    	btnReset.setVisible(false);
		    	btnPushRandom.setVisible(false);
		    	btnPushValue.setVisible(false);
				push.setVisible(false);
		    	Menuselect1.setVisible(false);
		    	Menuselect2.setVisible(true);
		    }
		});

	    Menuselect2.setOnAction(new EventHandler<ActionEvent>() {
		    public void handle(ActionEvent event) {
		    	btnCreate.setVisible(true);
		    	btnPush.setVisible(true);
		    	btnPop.setVisible(true);
		    	btnReset.setVisible(true);
//		    	btnPushRandom.setVisible(true);
//		    	btnPushValue.setVisible(true);
		    	Menuselect2.setVisible(false);
		    	Menuselect1.setVisible(true);
		    	
		    }
		});		
	    
	    Menuselect1.setLayoutX(locationX);
	    Menuselect1.setLayoutY(locationY);
	    Menuselect2.setLayoutX(locationX);
	    Menuselect2.setLayoutY(locationY);
	    
		group.getChildren().addAll(Menuselect1,Menuselect2);
		group.getChildren().addAll(group1);

//----------------------------------------------------------------------
        
        group.getChildren().addAll(l);
        return group;
    }
//------------------------------------------------------------------------
    public static void update() {
		btn.clear();
		for (int i = 0; i < MyStack.getSize(); i++) {
    		btn.add(new Button(String.valueOf(MyStack.getStack().get(i))));
        	btn.get(i).setLayoutX(50*i+location1X);
        	btn.get(i).setLayoutY(location1Y);
        }
		
    	group1.getChildren().clear();
	    group1.getChildren().addAll(btn);
    }
//-------------------------------------------------------------------------
    public static void push(int value) {
    	Button n1 = new Button(String.valueOf(value));
        n1.setLayoutX(btn.size()*50+location1X);
        n1.setLayoutY(location1Y+50);
        btn.add(n1);
        group1.getChildren().addAll(n1);
        TranslateTransition transition1 = new TranslateTransition(Duration.millis(2000),n1);
        transition1.setByX(0);
        transition1.setByY(-50);
        transition1.play();
    }
 //------------------------------------------------------------------------
    public static void pop() {
    	if (btn.size() !=0) {
	        TranslateTransition transition2 = new TranslateTransition(Duration.millis(2000),btn.get(btn.size()-1));
	        transition2.setByX(0);
	        transition2.setByY(-50);
	        transition2.play();
	        transition2.setOnFinished(new EventHandler<ActionEvent>() {

	            public void handle(ActionEvent event) {
			        group1.getChildren().remove(btn.get(btn.size()-1));
			        btn.remove(btn.size()-1);
	            }
	        });
        }
    }
    public static void reset() {
    	
    }
}
