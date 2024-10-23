package Button;
import dataStructure.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
 

public class Help extends JFrame {
 
    private JTextArea ta;
 
    public Help() {
 
        add(createMainPanel());
        setTitle("Help");
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        JPanel panelBottom = new JPanel();
        JButton btnOK = new JButton("OK");
        btnOK.addActionListener(new ActionListener() {
 
            @Override
            public void actionPerformed(ActionEvent e) {
            	setVisible(false); 
            }
        });
       
        panelBottom.add(btnOK, BorderLayout.CENTER);
        add(panelBottom, BorderLayout.PAGE_END);
    }
 
    private JPanel createMainPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        JPanel Label1 = new JPanel(new BorderLayout());
        JPanel Label2 = new JPanel(new BorderLayout());
        
        JLabel labelhelp = new JLabel("Help User");
        Label1.add(labelhelp, BorderLayout.PAGE_START);
        Label1.add(ta = createTextArea(40, 80), BorderLayout.CENTER);     
        panel.add(Label1, BorderLayout.PAGE_START);
        panel.add(Label2, BorderLayout.PAGE_END);
        
        return panel;
    }

    private JTextArea createTextArea(int row, int col) {
        JTextArea ta = new JTextArea(row, col);
        ta.setFont(new Font("Tahoma", 0, 16));
        ta.setText(""
				+ "In Main menu: Choose one in three Data Structures(stack,queue,list) in \"Data Sructures\" menu to start.\n"
				+ "\t-Click \"Quit\"-->\"Yes\" if you want to exit the application.\n"
				+ "\t-Click \"Help\" for more information about usage and aim of project.\n"
				+ "-------------------------------------------------------------------LIST------------------------------------------------------------------------------------\n"
				+ "Mainly the following these basic operations are performed in the List\n"
    			+ "*List may grow from zero to infinite size\n"
    			+ "  1.Add a positive integer number(eg: \"a\") in the fisrt blank -->Click \"Insert\" to add an element into the list.\n"
				+ "  2.Find index of element you want to remove and add it in the second blank --> Click \"Remove Index\" button to delete this element in stack.\n"
				+ "  3.Add a positive integer number(eg: \"c\") in the third blank -->Click \"Search\" to find element \"c\" in list and its index below.\n"
				+ "  4.Click \"Sort\" button to sort the elements in list.\n"
				+ "-Click \"Back\" to back to Main Menu.\n"
				+ "-------------------------------------------------------------------STACK----------------------------------------------------------------------------------\n"
				+ "Mainly the following these basic operations are performed in the stack\n"
    			+ "  1.Add a positive integer number(eg: \"a\") in the first blank  -->Click \"Create\" to make a stack with length a.\n"
				+ "  2.Add a positive integer number(eg: \"b\") in the second blank-->Click \"Push\" to push \"b\" into the stack.\n"
				+ "  3.Click \"Pop\" button to delete an element in stack.\n"
				+ "  4.Add a positive integer number(eg: \"c\") in the third blank -->Click \"Search\" to find element \"c\" in stack.\n"
				+ "  5.Click \"Sort\" button to sort the elements in stack.\n"
				+ "-Click \"Back\" to back to Main Menu.\n"
				+ "-------------------------------------------------------------------QUEUE----------------------------------------------------------------------------------\n"
				+"Mainly the following these basic operations are performed in the queue\n"
    			+ "  1.Add a positive integer number(eg: \"a\") in the fisrt blank -->Click \"Create\" to make a queue with length a.\n"
				+ "  2.Add a positive integer number(eg: \"b\") in the second blank-->Click \"Enqueue\" to push \"b\" into the queue.\n"
				+ "  3.Click \"Dequeue\" button to delete an element in corresponding data structure.\n"
				+ "  4.Add a positive integer number(eg: \"c\") in the third blank -->Click \"Search\" to find element \"c\" in the queue.\n"
				+ "  5.Click \"Sort\" button to sort the elements in the queue.\n"
				+ "-Click \"Back\" to back to Main Menu.\n");
        ta.setWrapStyleWord(true);
        ta.setLineWrap(true);
        return ta;
    }
}