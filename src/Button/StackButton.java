package Button;
import dataStructure.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.swing.table.*;

import dataStructure.Stack;

import javax.swing.*;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StackButton extends JFrame {
	private Stack stack;
	private JButton btnCreate;
	private JButton btnPush;
	private JButton btnPop;
	private JButton btnSearch;
	private JButton btnSort;
	private JButton btnBack;
	private JTextField txtCreate;
	private JTextField txtPush;
	private JTextField txtPop;
	private JTextField txtSearch;
	private JLabel jLabel1;
	private JPanel jPanel1;
	private JPanel jPanel2;
	private JPanel jPanel3;
	private JScrollPane jScrollPane1;
	private JScrollPane jScrollPane2;
	private JTable tblStack1;
	private JTable tblStack2;

	public StackButton() {
		// TODO Auto-generated constructor stub
		initComponents();
	}
	
	private void initComponents() {
		jPanel1 = new JPanel();
		jLabel1 = new JLabel();
		
		btnCreate = new JButton();
		txtCreate = new JTextField();
		
		btnPush = new JButton();
		txtPush = new JTextField();
		
		btnPop = new JButton();
		txtPop = new JTextField();
		
		btnSearch = new JButton();
		txtSearch = new JTextField();
		
		btnSort = new JButton();
		
		btnBack = new JButton();
		
		jPanel2 = new JPanel();
		jScrollPane1 = new JScrollPane();
		tblStack1 = new JTable();
		
		jPanel3 = new JPanel();
		jScrollPane2 = new JScrollPane();
		tblStack2 = new JTable();
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		jLabel1.setText("Stack Operation   ");
		
		btnCreate.setText("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnCreateActionPerformed(evt);
			}
		});
		
		txtCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				txtCreateActionPerformed(evt);
			}
		});
		
		btnPush.setText("Push");
		btnPush.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnPushActionPerformed(evt);
			}
		});
		
		txtPush.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				txtPushActionPerformed(evt);
			}
		});
		
		txtPop.setBorder(null);
		txtPop.setEditable(false);
		btnPop.setText("Pop");
		btnPop.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnPopActionPerformed(evt);
			}
		});
		
		
		
		btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

		
		btnSort.setText("Sort");
	    btnSort.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent evt) {
	    		btnSortActionPerformed(evt);
	        }
	    });
	    
	    btnBack.setText("Back");
	    btnBack.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent evt) {
	    		btnBackActionPerformed(evt);
	        }
	    });
	    
	    GroupLayout layout1 = new GroupLayout(jPanel1);
	    jPanel1.setLayout(layout1);
	    
	    layout1.setHorizontalGroup(
	    	layout1.createParallelGroup(GroupLayout.Alignment.LEADING)
	    	.addGroup(layout1.createSequentialGroup()
	    		.addGap(19, 19, 19)
	    		.addGroup(layout1.createParallelGroup(GroupLayout.Alignment.LEADING, false)
	    			.addGroup(layout1.createSequentialGroup()
	    				.addGroup(layout1.createParallelGroup(GroupLayout.Alignment.LEADING, false)
	    					.addComponent(btnPop,GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
	    				.addPreferredGap(ComponentPlacement.UNRELATED)
		    			.addGroup(layout1.createParallelGroup(GroupLayout.Alignment.LEADING, false)
	    					.addComponent(txtPop,GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)))
	    			.addGroup(layout1.createSequentialGroup()
	    				.addGroup(layout1.createParallelGroup(GroupLayout.Alignment.LEADING, false)
	    					.addComponent(btnCreate,GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
	    					.addComponent(btnPush, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	    				.addPreferredGap(ComponentPlacement.UNRELATED)
	    				.addGroup(layout1.createParallelGroup(GroupLayout.Alignment.LEADING, false)
	    					.addComponent(txtPush, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
	    					.addComponent(txtCreate)))
	    			.addGroup(GroupLayout.Alignment.TRAILING, layout1.createSequentialGroup()
	    				.addGroup(layout1.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
	    					.addComponent(btnSort, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    					.addComponent(btnSearch, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
	    				.addPreferredGap(ComponentPlacement.UNRELATED)
	    				.addComponent(txtSearch, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
	    			.addComponent(btnBack, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
	    		.addContainerGap(19, Short.MAX_VALUE))
	    	);
	    
	    layout1.setVerticalGroup(
    		layout1.createParallelGroup(GroupLayout.Alignment.LEADING)
    		.addGroup(layout1.createSequentialGroup()
    			.addContainerGap()
    			.addComponent(jLabel1)
    			.addGap(31, 31, 31)
    			.addGroup(layout1.createParallelGroup(GroupLayout.Alignment.BASELINE)
    				.addComponent(btnCreate, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
    				.addComponent(txtCreate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
    			.addPreferredGap(ComponentPlacement.UNRELATED, 24, Short.MAX_VALUE)
    			.addGroup(layout1.createParallelGroup(GroupLayout.Alignment.BASELINE)
    				.addComponent(btnPush, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
    				.addComponent(txtPush, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
    			.addPreferredGap(ComponentPlacement.UNRELATED, 24, Short.MAX_VALUE)		
    			.addGroup(layout1.createParallelGroup(GroupLayout.Alignment.BASELINE)
	    				.addComponent(btnPop, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(txtPop, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
    			.addGap(28, 28, 28)
    			.addGroup(layout1.createParallelGroup(GroupLayout.Alignment.BASELINE)
	    				.addComponent(btnSearch, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(txtSearch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
    			.addGap(28, 28, 28)
    			.addComponent(btnSort, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
    			.addGap(28, 28, 28)
    			.addComponent(btnBack)
    			.addContainerGap(14, Short.MAX_VALUE))
	    	);
	    
	    tblStack1.setModel(new DefaultTableModel(
	            new Object [][] {

	            },
	            new String [] {
	                "Stack"
	            }
	        ));
	    jScrollPane1.setViewportView(tblStack1);
	    
	    tblStack2.setModel(new DefaultTableModel(
	    		new Object[][] {
	    		},
	    		new String [] {
	    			"Searching || Sorting"
	    		}
	    	));	
	    jScrollPane2.setViewportView(tblStack2);
	    
	    GroupLayout layout2 = new GroupLayout(jPanel2);
	    jPanel2.setLayout(layout2);
	    
	    layout2.setHorizontalGroup(
	    	layout2.createParallelGroup(GroupLayout.Alignment.LEADING)
	    	.addGroup(layout2.createSequentialGroup()
	    		.addContainerGap()
	    		.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
	    		.addPreferredGap(ComponentPlacement.RELATED)
	    		.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    		.addGap(22, 22, 22))
	    );
	    layout2.setVerticalGroup(
	    	layout2.createParallelGroup(GroupLayout.Alignment.LEADING)
	    	.addGroup(GroupLayout.Alignment.TRAILING, layout2.createSequentialGroup()
	    		.addGroup(layout2.createParallelGroup(GroupLayout.Alignment.TRAILING)
	    			.addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
	    		.addContainerGap())
	    );
	    
	    GroupLayout layout3 = new GroupLayout(jPanel3);
        jPanel3.setLayout(layout3);
        layout3.setHorizontalGroup(
        		layout3.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout3.createSequentialGroup()
                .addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout3.setVerticalGroup(
        	layout3.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        	.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 411, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
	}
	
	
	private void txtCreateActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
	}
	
	
	private void btnCreateActionPerformed(ActionEvent evt) {
		int size = 0;
		try {
			size = Integer.valueOf(txtCreate.getText());
		} catch(Exception e) {	
		}
		if (size <= 0) {
			JOptionPane.showMessageDialog(this, "ERROR: Only allow number > 0");
			return;
		}
		stack = new Stack(Integer.valueOf(txtCreate.getText()));
		initTable();
	}
	
	private void txtPushActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
	}
	
	
	private void btnPushActionPerformed(ActionEvent evt) {
		if(stack == null) {
			JOptionPane.showMessageDialog(this, "Please create the stack first");
			return;
		}
		if(stack.isFull()) {
			JOptionPane.showMessageDialog(this, "Stack is full");
			return;
		}
		int num = 0;
		try {
			num = Integer.valueOf(txtPush.getText());
		} catch (Exception e) {
		}
		if (num <= 0) {
			JOptionPane.showMessageDialog(this, "ERROR: Only allow number > 0");
			return;
		}
		stack.pushElementStack(num);
		updateTable();
		txtPush.setText("");
	}
	
	private void btnPopActionPerformed(ActionEvent evt) {
		if(stack == null) {
			JOptionPane.showMessageDialog(this, "Please create the stack first");
			return;
		}
		if (stack.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Stack is empty!");
            return;
        }
     
        stack.popElementStack();
        updateTable();
	}
	
	
	private void btnSearchActionPerformed(ActionEvent evt) {
		if (stack == null || stack.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nothing in stack to search");
            return;
        }
		int searchValue = 0;
        try {
            searchValue = Integer.valueOf(txtSearch.getText());
        } catch (Exception e) {
        }
        
        if (searchValue <= 0 ){
            JOptionPane.showMessageDialog(this, "ONLY allow numbers > 0");
            return;
        }
        Stack searchingStack = new Stack(stack.maxSize(), Arrays.copyOf(stack.getElements(), stack.getElements().length) , stack.getTop());
        
        int topValue = searchingStack.peek();
        while(topValue != searchValue){
            searchingStack.popElementStack();
            if(!searchingStack.isEmpty()){
                topValue = searchingStack.peek();
            } else {
                break;
            }           
        }
        if(searchingStack.isEmpty()){
            JOptionPane.showMessageDialog(this, "Not found: " + searchValue + " in stack.");
           
        }
        updateSecondTable(searchingStack, "Searched Stack");
	}
	
	private void btnSortActionPerformed(ActionEvent evt) {
        if(stack == null){
           JOptionPane.showMessageDialog(this, "Please create the stack first!");
           return;
       }
       if(stack.isEmpty()){
           JOptionPane.showMessageDialog(this, "Stack is Empty!");
           return;
       }
       
       Stack sortedStack = new Stack(stack.maxSize(), Arrays.copyOf(stack.getElements(), stack.getElements().length) , stack.getTop());
       sortedStack.sort();
       updateSecondTable(sortedStack, "Sorted Stack");
    }
	
	private void btnBackActionPerformed(ActionEvent evt) {
		int option = JOptionPane.showConfirmDialog(this, "Are you sure to back to the main menu?");
		if (option == JOptionPane.YES_OPTION) {
			this.dispose();
		}
		if (option == JOptionPane.NO_OPTION) {
		}
	}
	
	
	public void updateTable() {
		List<String> dataToDisplayInTable = new ArrayList();
        for (int i = (stack.getElements().length - 1); i >= 0; i--) {
            if (stack.getElements()[i] > 0) {
                dataToDisplayInTable.add(String.valueOf(stack.getElements()[i]));
            } else {
                dataToDisplayInTable.add("");
            }
        }
        Object[][] bookTableData = new Object[dataToDisplayInTable.size()][1];
        for (int i = 0; i < dataToDisplayInTable.size(); i++) {
            if (!dataToDisplayInTable.get(i).equals("")) {
                bookTableData[i][0] = dataToDisplayInTable.get(i);
            }
        }
  
        tblStack1.setModel(new DefaultTableModel(
                bookTableData,
                new String[]{
                    "Stack"
                }
        ));
        if(stack != null && !stack.isEmpty()){
            txtPop.setText(String.valueOf(stack.peek()));
        } 
        else {
            txtPop.setText("");
        }
	}
	
	
    public void updateSecondTable(Stack searchingStack, String title) {
        
        List<String> dataToDisplayInTable = new ArrayList();
        for (int i = (searchingStack.getElements().length - 1); i >= 0; i--) {
            if (searchingStack.getElements()[i] > 0) {
                dataToDisplayInTable.add(String.valueOf(searchingStack.getElements()[i]));
            } else {
                dataToDisplayInTable.add("");
            }
        }
        
        //highlight
        int found = -1;
        for (int m = 0; m < dataToDisplayInTable.size(); m++){
            if(!dataToDisplayInTable.get(m).equals("")){
                found = m;
                break;
            }
        }
        if(found != -1 && title.contains("Searched")){
            String result = dataToDisplayInTable.remove(found);
            String decorResult = result + " (*)";
            dataToDisplayInTable.add(found, decorResult);
        }
        
        
        Object[][] bookTableData = new Object[dataToDisplayInTable.size()][1];
        for (int i = 0; i < dataToDisplayInTable.size(); i++) {
            if (!dataToDisplayInTable.get(i).equals("")) {
                bookTableData[i][0] = dataToDisplayInTable.get(i);
            }

        }
        tblStack2.setModel(new DefaultTableModel(
                bookTableData,
                new String[]{
                    title
                }
        ));  
    }
    
    public void initTable() {
    	Object[][] stackTableData = new Object[stack.size()][1];

        tblStack1.setModel(new DefaultTableModel(
            stackTableData,
            new String [] {
                "Stack"
            }
        ));
        
          tblStack2.setModel(new DefaultTableModel(
            stackTableData,
            new String [] {
                "Searching || Sorting "
            }
        ));
    }
    
    public static void main(String[] args) {
    	new StackButton().setVisible(true);
    }
}
