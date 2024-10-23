package Screen;

import java.awt.BorderLayout;
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
        Label1.add(ta = createTextArea(25, 50), BorderLayout.CENTER);
        
        panel.add(Label1, BorderLayout.PAGE_START);
        panel.add(Label2, BorderLayout.PAGE_END);
        
        return panel;
    }

    private JTextArea createTextArea(int row, int col) {
        JTextArea ta = new JTextArea(row, col);
        ta.setText(""
				+ "+)STEP 1(In Main menu:): Choose one in three Data Structures(stack,queue,list) in \"Data Sructures\" menu to start.--> direct to the new window that guided in STEP 2 \n"
				+ "\t-Click \"Quit\"-->\"Yes\" if you want to exit the application.\n"
				+ "\t-Click \"Help\" for more information about usage and aim of project.\n"
				+ "+)STEP 2(In the corresponding table that take from STEP 1.): \n"
				+ "\t1.Add a positive integer number(eg: \"a\") in the fisrt blank -->Click \"Create\" to make a corresponding data structure with length a.\n"
				+ "\t2.Add a positive integer number(eg: \"b\") in the second blank-->Click \"Push\" to push \"b\" into the correspond data structure.\n"
				+ "\t3.Click \"Pop\" button to delete an element in corresponding data structure.\n"
				+ "\t4.Add a positive integer number(eg: \"c\") in the fisrt blank -->Click \"Search\" to find \"c\" in corresponding data structure.\n"
				+ "\t5.Click \"Sort\" button to sort the elements in data structure.\n"
				+ "-Click \"Back\" to back to Main Menu.");
        ta.setWrapStyleWord(true);
        ta.setLineWrap(true);
        return ta;
    }
}