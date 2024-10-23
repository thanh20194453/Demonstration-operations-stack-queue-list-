package Main;
import Button.*;
import Button.Help;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Screen.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.Event;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.EventHandler;

import java.util.ArrayList;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
 

public class MainMenu extends JFrame{

	public MainMenu()  {
		// TODO Auto-generated constructor stub
		JMenu menuselect = new JMenu();
		JMenuItem HelpMenu = new JMenuItem();
		JMenuItem quit = new JMenuItem();
		JMenuItem a = new JMenuItem();
		JMenuItem StackMenu = new JMenuItem();
		JMenuItem QueueMenu = new JMenuItem();
		JMenuItem ListMenu = new JMenuItem();
		JMenuBar jMenuBar = new JMenuBar();
		JLabel jLabel = new JLabel();
		this.setTitle("Main Menu");
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		jLabel.setFont(new Font("Tahoma", 0, 24));
		jLabel.setText("Demonstration of operations on stack, queue, list");
		HelpMenu.setText("Help");
		HelpMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	HelpMenuActionPerformed(evt);
            }
        });
		quit.setText("Quit");
		quit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	btnQuitActionPerformed(evt);
            }
        });
		
		a.setText("Animation");
		a.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	btnActionPerformed(evt);
            }
        });
		
		menuselect.setText("Data Structures");
		
		StackMenu.setText("Stack");
		StackMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                StackMenuActionPerformed(evt);
            }
        });
		QueueMenu.setText("Queue");
		QueueMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	QueueMenuActionPerformed(evt);
            }
        });
		ListMenu.setText("List");
		ListMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ListMenuActionPerformed(evt);
            }
        });
		menuselect.add(ListMenu);
		menuselect.add(StackMenu);
		menuselect.add(QueueMenu);
		jMenuBar.add(menuselect);
		jMenuBar.add(HelpMenu);
		jMenuBar.add(a);
		jMenuBar.add(quit);
		jMenuBar.setSize(270, 25);
		this.add(jMenuBar, BorderLayout.SOUTH);
		
		GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel, GroupLayout.PREFERRED_SIZE, 640, GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel, GroupLayout.PREFERRED_SIZE, 480, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        pack();
	}
	private void StackMenuActionPerformed(ActionEvent evt) {
        StackButton stackButton = new StackButton();
        stackButton.setVisible(true);
    }
	
	private void QueueMenuActionPerformed(ActionEvent evt) {
		QueueButton queueButton = new QueueButton();
		queueButton.setVisible(true);
	}
	
	private void ListMenuActionPerformed(ActionEvent evt) {
		ListButton listButton = new ListButton();
		listButton.setVisible(true);
	}
	
	private void HelpMenuActionPerformed(ActionEvent evt) {
        new Help();
	}
	private void btnQuitActionPerformed(ActionEvent evt) {
		int option = JOptionPane.showConfirmDialog(this, "Are you sure you want quit the application?");
		if (option == JOptionPane.YES_OPTION) {
			this.dispose();
		}
		if (option == JOptionPane.NO_OPTION) {
		}
	}
	
	private void btnActionPerformed(ActionEvent evt) {
		MainScreen.run();
	}
	

}
