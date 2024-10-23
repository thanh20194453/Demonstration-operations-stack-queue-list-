package Screen;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.Duration;
import javafx.event.EventHandler;
import java.util.ArrayList;

import DataStructures.MyList;
import javafx.scene.text.Font;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
 
public class AnimationList {
	static ArrayList<Button> btn = new ArrayList<Button>();
	static Group group = new Group();	//gop cac button chuc nang
	static Group group1 = new Group(); //gop cac button so
	
	static int locationX = MainScreen.locationX; //vitri menu
	static int locationY = MainScreen.locationY;
	
	static int location1X = MainScreen.location1X; //vitri button so
	static int location1Y = MainScreen.location1Y;
	
	static Label l = new Label("Demonstration of operations on List ");
	static Label lb1 = new Label();
	
	static public Group run() {
    	
//----------------------------khai bao cac bien---------------------------------------

		l.setFont(new Font("Arial", 24));
		l.setLayoutX(100);
		l.setLayoutY(40);
        group.getChildren().addAll(l);
		
		lb1.setFont(new Font("Arial", 18));
		lb1.setVisible(false);
		lb1.setLayoutX(locationX+20);
		lb1.setLayoutY(locationY+150);
		group.getChildren().addAll(lb1);
		
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
		btnCreate.setLayoutX(locationX+60);
		btnCreate.setLayoutY(locationY);
		group.getChildren().addAll(btnCreate);
		btnCreate.setOnAction(new EventHandler<ActionEvent>() {
		    public void handle(ActionEvent event) {
		    	MyList.CreateRandom();
		    	update();
		    	btnCreate.setText("Create Again");
		    }
		});
		
//------------------------------------button Insert--------------------------------------------		
		final Button btnInsertRandom = new Button();
		btnInsertRandom.setText("Insert Random");
		btnInsertRandom.setVisible(false);
		btnInsertRandom.setLayoutX(locationX+120);
		btnInsertRandom.setLayoutY(locationY+33);
		group.getChildren().addAll(btnInsertRandom);
		
		btnInsertRandom.setOnAction(new EventHandler<ActionEvent>() {
		    public void handle(ActionEvent event) {
		    	int v = (int)Math.floor(Math.random()*(99-0+1)+0);
		    	int ind = (int)Math.floor(Math.random()*(btn.size())+0);
		    	insert(ind, v);
		    }
		});

		final TextField Insert = new TextField();
		Insert.setPrefWidth(30);
		Insert.setVisible(false);
		Insert.setLayoutX(locationX+320);
		Insert.setLayoutY(locationY+33);
		group.getChildren().addAll(Insert);
		
		final TextField Index = new TextField();
		Index.setPrefWidth(30);
		Index.setVisible(false);
		Index.setLayoutX(locationX+440);
		Index.setLayoutY(locationY+33);
		group.getChildren().addAll(Index);
		
		final Label lb = new Label("|");
		lb.setFont(new Font("Arial", 18));
		lb.setVisible(false);
		lb.setLayoutX(locationX+220);
		lb.setLayoutY(locationY+33);
		group.getChildren().addAll(lb);
		
		final Button Indexlb = new Button("Index");
		Indexlb.setVisible(false);
		Indexlb.setLayoutX(locationX+370);
		Indexlb.setLayoutY(locationY+33);
		group.getChildren().addAll(Indexlb);
		
		final Button btnInsertValue = new Button();
		btnInsertValue.setText("Insert Value");
		btnInsertValue.setVisible(false);		
		btnInsertValue.setLayoutX(locationX+230);
		btnInsertValue.setLayoutY(locationY+33);
		group.getChildren().addAll(btnInsertValue);
		
		btnInsertValue.setOnAction(new EventHandler<ActionEvent>() {
		    public void handle(ActionEvent event) {
		    	int v = Integer.parseInt(Insert.getText());
		    	int ind = Integer.parseInt(Index.getText());
		    	insert(ind, v);
		    }
		});
		
		final Button btnInsert = new Button();
		btnInsert.setText("Insert");
		btnInsert.setLayoutX(locationX+60);
		btnInsert.setLayoutY(locationY+33);
		group.getChildren().addAll(btnInsert);
		
		btnInsert.setOnAction(new EventHandler<ActionEvent>() {
		    public void handle(ActionEvent event) {
		    	if (btnInsertRandom.isVisible() == false) {
		    	btnInsertRandom.setVisible(true);
		    	btnInsertValue.setVisible(true);
				Insert.setVisible(true);
				Index.setVisible(true);
				Indexlb.setVisible(true);
				lb.setVisible(true);
		    	}
		    	else {
			    	btnInsertRandom.setVisible(false);
			    	btnInsertValue.setVisible(false);
					Insert.setVisible(false);
					Index.setVisible(false);
					Indexlb.setVisible(false);
					lb.setVisible(false);
		    	}
		    }
		});

//----------------------------------------button Remove-------------------------------------
		final TextField rIndex = new TextField();
		rIndex.setPrefWidth(30);
		rIndex.setVisible(true);
		rIndex.setLayoutX(locationX+200);
		rIndex.setLayoutY(locationY+66);
		group.getChildren().addAll(rIndex);
		
		final Button rIndexlb = new Button("Index");
		rIndexlb.setVisible(true);
		rIndexlb.setLayoutX(locationX+140);
		rIndexlb.setLayoutY(locationY+66);
		group.getChildren().addAll(rIndexlb);
		
		final Button btnRemove = new Button();
		btnRemove.setText("Remove");
		btnRemove.setLayoutX(locationX+60);
		btnRemove.setLayoutY(locationY+66);
		group.getChildren().addAll(btnRemove);
		
		btnRemove.setOnAction(new EventHandler<ActionEvent>() {
		    public void handle(ActionEvent event) {
		    	int ind = Integer.parseInt(rIndex.getText());
		    	remove(ind);
		    }
		});
		
//--------------------------------button reset------------------------------------------
		
		final Button btnReset = new Button();
		btnReset.setText("Reset");
		btnReset.setLayoutX(locationX+60);
		btnReset.setLayoutY(locationY+100);
		group.getChildren().addAll(btnReset);
		btnReset.setOnAction(new EventHandler<ActionEvent>() {
		    public void handle(ActionEvent event) {
		    	reset();
		    	btnCreate.setText("Create Random");
		    }
		});
		
//................................menu chuc nang.....................................
	    Menuselect1.setOnAction(new EventHandler<ActionEvent>() {
		    public void handle(ActionEvent event) {
		    	btnCreate.setVisible(false);
		    	btnInsert.setVisible(false);
		    	btnRemove.setVisible(false);
		    	btnReset.setVisible(false);
		    	btnInsertRandom.setVisible(false);
		    	btnInsertValue.setVisible(false);
				Insert.setVisible(false);
				Index.setVisible(false);
				Indexlb.setVisible(false);
				rIndexlb.setVisible(false);
				lb.setVisible(false);
				rIndex.setVisible(false);
		    	Menuselect1.setVisible(false);
		    	Menuselect2.setVisible(true);
		    }
		});

	    Menuselect2.setOnAction(new EventHandler<ActionEvent>() {
		    public void handle(ActionEvent event) {
		    	btnCreate.setVisible(true);
		    	btnInsert.setVisible(true);
		    	btnRemove.setVisible(true);
		    	btnReset.setVisible(true);
		    	rIndex.setVisible(true);
		    	rIndexlb.setVisible(true);
		    	Menuselect2.setVisible(false);
		    	Menuselect1.setVisible(true);
		    	
		    }
		});		
	    
	    Menuselect1.setLayoutX(locationX);
	    Menuselect1.setLayoutY(locationY);
	    Menuselect2.setLayoutX(locationX);
	    Menuselect2.setLayoutY(locationY);
	    
		group.getChildren().addAll(Menuselect1,Menuselect2);

//----------------------------------------------------------------------
		group.getChildren().addAll(group1);
        return group;
    }
//-------------------------------------------------------------------------
	public static void update() {
		btn.clear();
		for (int i = 0; i < MyList.getSize(); i++) {
    		btn.add(new Button(String.valueOf(MyList.getList().get(i))));
        	btn.get(i).setLayoutX(50*i+location1X);
        	btn.get(i).setLayoutY(location1Y);
        }
		
    	group1.getChildren().clear();
	    group1.getChildren().addAll(btn);
	}
//------------------------------------------------------------------------
	public static void insert(final int index, final int value) {
    	MyList.insert(index, value);
    	Button n1 = new Button(String.valueOf(value));
    	n1.setLayoutX(index*50+location1X);
        n1.setLayoutY(location1Y+50);
        
    	lb1.setText("Insert number " + n1.getText() +" with index "+ index);
		lb1.setVisible(true);

        for (int i = index;i<btn.size();i++) {
        	TranslateTransition transition2 = new TranslateTransition(Duration.millis(2000),btn.get(i));
	        transition2.setByX(50);
	        transition2.setByY(0);
	        transition2.play();
        }
        btn.add(index,n1);
        group1.getChildren().addAll(n1);
        TranslateTransition transition1 = new TranslateTransition(Duration.millis(2000),n1);
        transition1.setByX(0);
        transition1.setByY(-50);
        transition1.play();
        transition1.setOnFinished(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
		        update();
            }
        });
	}
	//------------------------------------------------------------------------
	public static void remove(final int index) {
		MyList.remove(index);
    	lb1.setText("Remove number " + btn.get(index).getText() +" with index "+ index);
		lb1.setVisible(true);
	    TranslateTransition transition2 = new TranslateTransition(Duration.millis(2000),btn.get(index));
	    transition2.setByX(0);
	    transition2.setByY(-50);
	    transition2.play();
	    transition2.setOnFinished(new EventHandler<ActionEvent>() {
	    	public void handle(ActionEvent event) {
	    		group1.getChildren().remove(btn.get(index));
	    		btn.remove(index);
			        
	    		for (int i = index;i<btn.size();i++) {
	    			TranslateTransition transition2 = new TranslateTransition(Duration.millis(2000),btn.get(i));
	    			transition2.setByX(-50);
	    			transition2.setByY(0);
	    			transition2.play();
	    		}
	    	}
	    });
	}
	public static void reset() {
		MyList.reset();
		btn.clear();
    	lb1.setText("");
    	group1.getChildren().clear();
	}
}
