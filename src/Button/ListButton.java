package Button;
import dataStructure.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.*;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import dataStructure.MyList;


public class ListButton extends JFrame {
	private MyList list = new MyList();
	private JButton btnInsert;
	private JButton btnRemove;
	private JButton btnSearch;
	private JButton btnSort;
	private JButton btnBack;
	private JTextField txtInsert;
	private JTextField txtRemove;
	private JTextField txtSearch;
	private JTextField txtRemoveIndex;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JPanel jPanel1;
	private JPanel jPanel2;
	private JPanel jPanel3;
	private JLabel jLabelFound;
	private JLabel jLabelRemove;
	private JScrollPane jScrollPane1;
	private JScrollPane jScrollPane2;
	private JTable tblList1;
	private JTable tblList2;

	public ListButton() {
		// TODO Auto-generated constructor stub
		initComponents();
	}
	
	public void initComponents() {
		jPanel1 = new JPanel();
		jLabel1 = new JLabel();
		
		btnInsert = new JButton();
		txtInsert = new JTextField();
		
		btnRemove = new JButton();
		txtRemove = new JTextField();
		
		jLabel2 = new JLabel();
		jLabelRemove = new JLabel();
		txtRemoveIndex = new JTextField();
		
		btnSearch = new JButton();
		txtSearch = new JTextField();
		
		jLabel3 = new JLabel();
		jLabelFound = new JLabel();
		
		btnSort = new JButton();
		
		btnBack = new JButton();
		
		jPanel2 = new JPanel();
		jScrollPane1 = new JScrollPane();
		tblList1 = new JTable();
		
		jPanel3 = new JPanel();
		jScrollPane2 = new JScrollPane();
		tblList2 = new JTable();
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("List Operations   ");
        
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnInsertActionPerformed(evt);
			}
		});
		
		btnRemove.setText("Remove Index");
		btnRemove.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnRemoveActionPerformed(evt);
			}
		});
		jLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel2.setText("Removed:");
		
		btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jLabel3.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel3.setText("Found Index:");

		
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
	    
	    GroupLayout layout1 = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(layout1);
        layout1.setHorizontalGroup(
        		layout1.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout1.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout1.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout1.createSequentialGroup()
                        .addGroup(layout1.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout1.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout1.createSequentialGroup()
                                    .addGroup(layout1.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout1.createSequentialGroup()
                                            .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(ComponentPlacement.RELATED)
                                            .addComponent(jLabelFound, GroupLayout.DEFAULT_SIZE, 93, GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(layout1.createSequentialGroup()
                                    .addGroup(layout1.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout1.createSequentialGroup()
                                            .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(ComponentPlacement.UNRELATED)
                                            .addComponent(jLabelRemove, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addGroup(layout1.createSequentialGroup()
                                .addGroup(layout1.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnInsert, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRemove, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSearch, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSort, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addGroup(layout1.createParallelGroup(GroupLayout.Alignment.LEADING)
                                	.addComponent(txtRemoveIndex, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                	.addComponent(txtSearch, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtInsert, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))))
                        .addGap(59, 59, 59))))
        );
        layout1.setVerticalGroup(
        		layout1.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout1.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout1.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInsert, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout1.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemove, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                	.addComponent(txtRemoveIndex, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGroup(layout1.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout1.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout1.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(jLabelRemove, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout1.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearch, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout1.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(jLabelFound, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addComponent(btnSort, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(btnBack)
                .addGap(24, 24, 24))
        );
        
        tblList1.setModel(new DefaultTableModel(
	            new Object [][] {

	            },
	            new String [] {
	                "List", "Index"
	            }
	        ));
	    jScrollPane1.setViewportView(tblList1);
	    
	    tblList2.setModel(new DefaultTableModel(
	    		new Object[][] {
	    		},
	    		new String [] {
	    			"Searching || Sorting"
	    		}
	    	));	   
	    jScrollPane2.setViewportView(tblList2);
	    
	    GroupLayout layout2 = new GroupLayout(jPanel2);
	    jPanel2.setLayout(layout2);
	    
	    layout2.setHorizontalGroup(
	    	layout2.createParallelGroup(GroupLayout.Alignment.LEADING)
	    	.addGroup(layout2.createSequentialGroup()
	    		.addGap(13, 13, 13)
	    		.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
	    		.addPreferredGap(ComponentPlacement.RELATED)
	    		.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    		.addGap(22, 22, 22))
	    );
	    layout2.setVerticalGroup(
	    	layout2.createParallelGroup(GroupLayout.Alignment.LEADING)
	    	.addGroup(layout2.createSequentialGroup()
	    		.addGroup(layout2.createParallelGroup(GroupLayout.Alignment.LEADING)
	    			.addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
	    		.addContainerGap())
	    );
	    
	    GroupLayout layout3 = new GroupLayout(jPanel3);
        jPanel3.setLayout(layout3);
        layout3.setHorizontalGroup(
        		layout3.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        		.addGroup(layout3.createSequentialGroup()
                .addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addGap(0, 15, Short.MAX_VALUE))
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
	
	private void btnInsertActionPerformed(ActionEvent evt) {
		int num = 0;
        try {
            num = Integer.valueOf(txtInsert.getText());
        } catch (Exception e) {
        }

        if (num <= 0 ){
            JOptionPane.showMessageDialog(this, "ONLY allow numbers > 0");
            return;
        }
        list.InsertElement(num);;
        updateTable();
        txtInsert.setText("");
    }
	
	private void btnRemoveActionPerformed(ActionEvent evt) {
		int removeIndex = -1;
        try {
            removeIndex = Integer.valueOf(txtRemoveIndex.getText());
        } catch (Exception e) {
        }

        if (removeIndex < 0 ){
            JOptionPane.showMessageDialog(this, "ONLY allow numbers >= 0");
            return;
        }
        
        if (removeIndex < 0 || removeIndex >= list.maxSize()){
            JOptionPane.showMessageDialog(this, "Index is not found!");
            return;
        }
        if(list.isEmpty()){
              JOptionPane.showMessageDialog(this, "List is Empty!");
            return;
        }

        int removed = list.RemoveElement(removeIndex);
        jLabelRemove.setText(String.valueOf(removed));
        updateTable();
    }
	
	private void btnSearchActionPerformed(ActionEvent evt) {
        if (list == null || list.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nothing in list to search");
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
        MyList searchingList = new MyList(list.getElements());
        int foundInx = list.search(searchValue);
        if(foundInx != -1){
            jLabelFound.setText(String.valueOf(foundInx));
        } else {
            jLabelFound.setText("Not found! ");
        }
      
    }
	
	private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {
        if(list == null){
            JOptionPane.showMessageDialog(this, "Please initialize the list first!");
            return;
        }
        if(list.isEmpty()){
            JOptionPane.showMessageDialog(this, "List is Empty!");
            return;
        }

        MyList sortedList = new MyList(list.getElements());
        sortedList.sort();
        updateSecondTable(sortedList, "Sorted List");
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
        for (int i = 0; i < list.getElements().length; i++) {
            if (list.getElements()[i] > 0) {
                dataToDisplayInTable.add(String.valueOf(list.getElements()[i]));
            } else {
                dataToDisplayInTable.add("");
            }
        }
        Object[][] bookTableData = new Object[dataToDisplayInTable.size()][2];
        for (int i = 0; i < dataToDisplayInTable.size(); i++) {
            if (!dataToDisplayInTable.get(i).equals("")) {
                bookTableData[i][0] = dataToDisplayInTable.get(i);
                bookTableData[i][1] = i;
            }

        }
        tblList1.setModel(new javax.swing.table.DefaultTableModel(
                bookTableData,
                new String[]{
                    "List", "Index"
                }
        ));
	}
	
	public void updateSecondTable(MyList searchingList, String title) {
		List<String> dataToDisplayInTable = new ArrayList();
        for (int i = (searchingList.getElements().length - 1); i >= 0; i--) {
            if (searchingList.getElements()[i] > 0) {
                dataToDisplayInTable.add(String.valueOf(searchingList.getElements()[i]));
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
        tblList2.setModel(new javax.swing.table.DefaultTableModel(
                bookTableData,
                new String[]{
                    title
                }
        ));
	}
	
	public void initTable(){
		Object[][] listTableData = new Object[list.size()][2];
		tblList1.setModel(new javax.swing.table.DefaultTableModel(
				listTableData,
				new String [] {
					"List", "Index"
				}
       ));
       
        tblList2.setModel(new javax.swing.table.DefaultTableModel(
        		listTableData,
        		new String [] {
        			" Sorting "
        		}
       ));
    }
	
	public static void main(String[] args) {
		new ListButton().setVisible(true);
	}
}
