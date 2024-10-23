package Button;
import dataStructure.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.swing.table.*;

import dataStructure.Queue;

import javax.swing.*;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QueueButton extends JFrame {
	private Queue queue;
	private JButton btnCreate;
	private JButton btnEnqueue;
	private JButton btnDequeue;
	private JButton btnSearch;
	private JButton btnSort;
	private JButton btnBack;
	private JTextField txtCreate;
	private JTextField txtEnqueue;
	private JTextField txtDequeue;
	private JTextField txtSearch;
	private JLabel jLabel1;
	private JPanel jPanel1;
	private JPanel jPanel2;
	private JPanel jPanel3;
	private JScrollPane jScrollPane1;
	private JScrollPane jScrollPane2;
	private JTable tblQueue1;
	private JTable tblQueue2;

	public QueueButton() {
		// TODO Auto-generated constructor stub
		initComponents();
	}
	
	private void initComponents() {
		jPanel1 = new JPanel();
		jLabel1 = new JLabel();
		
		btnCreate = new JButton();
		txtCreate = new JTextField();
		
		btnEnqueue = new JButton();
		txtEnqueue = new JTextField();
		
		btnDequeue = new JButton();
		txtDequeue = new JTextField();
		
		btnSearch = new JButton();
		txtSearch = new JTextField();
		
		btnSort = new JButton();
		
		btnBack = new JButton();
		
		jPanel2 = new JPanel();
		jScrollPane1 = new JScrollPane();
		tblQueue1 = new JTable();
		
		jPanel3 = new JPanel();
		jScrollPane2 = new JScrollPane();
		tblQueue2 = new JTable();
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		jLabel1.setText("Queue Operation   ");
		
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
		
		btnEnqueue.setText("Enqueue");
		btnEnqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnEnqueueActionPerformed(evt);
			}
		});
		
		txtEnqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				txtEnqueueActionPerformed(evt);
			}
		});
		
		txtDequeue.setBorder(null);
		txtDequeue.setEditable(false);
		btnDequeue.setText("Dequeue");
		btnDequeue.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnDequeueActionPerformed(evt);
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
	    				.addComponent(btnDequeue,GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
	    				.addPreferredGap(ComponentPlacement.UNRELATED)		    			
	    				.addComponent(txtDequeue,GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
	    			.addGroup(layout1.createSequentialGroup()
	    				.addGroup(layout1.createParallelGroup(GroupLayout.Alignment.LEADING, false)
	    					.addComponent(btnCreate,GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
	    					.addComponent(btnEnqueue, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	    				.addPreferredGap(ComponentPlacement.UNRELATED)
	    				.addGroup(layout1.createParallelGroup(GroupLayout.Alignment.LEADING, false)
	    					.addComponent(txtEnqueue, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
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
    				.addComponent(btnEnqueue, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
    				.addComponent(txtEnqueue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
    			.addPreferredGap(ComponentPlacement.UNRELATED, 24, Short.MAX_VALUE)		
    			.addGroup(layout1.createParallelGroup(GroupLayout.Alignment.BASELINE)
	    			.addComponent(btnDequeue, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
	    			.addComponent(txtDequeue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
	    
	    tblQueue1.setModel(new DefaultTableModel(
	            new Object [][] {

	            },
	            new String [] {
	                "Queue"
	            }
	        ));
	    jScrollPane1.setViewportView(tblQueue1);
	    
	    tblQueue2.setModel(new DefaultTableModel(
	    		new Object[][] {
	    		},
	    		new String [] {
	    			"Searching || Sorting"
	    		}
	    	));	   
	    jScrollPane2.setViewportView(tblQueue2);
	    
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
		queue = new Queue(Integer.valueOf(txtCreate.getText()));
		initTable();
	}
	
	private void txtEnqueueActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
	}
	
	private void btnEnqueueActionPerformed(ActionEvent evt) {
		if(queue == null){
            JOptionPane.showMessageDialog(this, "Please initialize the Queue first!");
            return;
        }
        if(queue.isFull()){
            JOptionPane.showMessageDialog(this, "Queue is full!");
            return;
        }
        int num = 0;
        try {
            num = Integer.valueOf(txtEnqueue.getText());
        } catch (Exception e) {
        }
        
        if (num <= 0 ){
            JOptionPane.showMessageDialog(this, "ONLY allow numbers > 0");
            return;
        }
        queue.EnqueueElement(num);
        updateTable();
        txtEnqueue.setText("");
    }
	
	
    private void btnDequeueActionPerformed(ActionEvent evt) {
        if (queue == null) {
            JOptionPane.showMessageDialog(this, "Please initialize the queue first!");
            return;
        }
        if (queue.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Queue is empty!");
            return;
        }
     
        queue.DequeueElement();;
        updateTable();
    }
    
    private void btnSearchActionPerformed(ActionEvent evt) {
    	if (queue == null || queue.isEmpty()) {
    		System.out.println("Nothing in queue to search");
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
        
        Queue searchingQueue = new Queue(queue.maxSize(), queue.getFront(), queue.getRear(), queue.getSize(), queue.getElements());
        int frontValue = searchingQueue.peek();
        while(frontValue != searchValue){
            searchingQueue.DequeueElement();;
            if(!searchingQueue.isEmpty()){
                frontValue = searchingQueue.peek();
            } else {
                break;
            }
            
        }
        if(searchingQueue.isEmpty()){
            JOptionPane.showMessageDialog(this, "Dequeue all elements in queue, Not found: " + searchValue);
           
        }
        updateSecondTable(searchingQueue, "Searched Queue");
    }
    
    private void btnSortActionPerformed(ActionEvent evt) {
    	if (queue == null) {
            JOptionPane.showMessageDialog(this, "Please initialize the queue first!");
            return;
        }
        if (queue.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Queue is empty!");
            return;
        }
        
        Queue sortedQueue = new Queue(queue.maxSize(), queue.getFront(), queue.getRear(), queue.getSize(), queue.getElements());
        sortedQueue.sort();
        updateSecondTable(sortedQueue, "Sorted Queue");      
    }
    
    private void btnBackActionPerformed(ActionEvent evt) {
		int option = JOptionPane.showConfirmDialog(this, "Are you sure to back to the main menu?");
		if (option == JOptionPane.YES_OPTION) {
			this.dispose();
		}
		if (option == JOptionPane.NO_OPTION) {
		}
	}
    
    private void updateTable() {
    	List<String> dataToDisplayInTable = new ArrayList();
        for (int i = (queue.getElements().length - 1); i >= 0; i--) {
            if (queue.getElements()[i] > 0) {
                dataToDisplayInTable.add(String.valueOf(queue.getElements()[i]));
            } else {
                dataToDisplayInTable.add("");
            }
        }
        //set front rear
        if (dataToDisplayInTable.size() > 1) {
            int rearFound = -1;
            for (int i = 0; i < dataToDisplayInTable.size(); i++) {
                if (!dataToDisplayInTable.get(i).equals("")) {
                    rearFound = i;
                    break;
                }
            }
            if (rearFound != -1) {
                String result = dataToDisplayInTable.remove(rearFound);
                String newRearResult = result + " (rear)";
                dataToDisplayInTable.add(rearFound, newRearResult);
            }

            int frontFound = -1;
            for (int i = dataToDisplayInTable.size() - 1; i >= 0; i--) {
                if (!dataToDisplayInTable.get(i).equals("")) {
                    frontFound = i;
                    break;
                }
            }
            if (frontFound != -1) {
                String frontResult = dataToDisplayInTable.remove(frontFound);
                String newFrontResult = frontResult + " (front)";
                dataToDisplayInTable.add(frontFound, newFrontResult);
            }
        }
        // end of setting front rear
        
        Object[][] queueTableData = new Object[dataToDisplayInTable.size()][1];
        for (int i = 0; i < dataToDisplayInTable.size(); i++) {
            if (!dataToDisplayInTable.get(i).equals("")) {
                queueTableData[i][0] = dataToDisplayInTable.get(i);
            }

        }
        tblQueue1.setModel(new DefaultTableModel(
                queueTableData,
                new String[]{
                    "Queue"
                }
        ));
        if(queue != null && !queue.isEmpty()){
        	txtDequeue.setText(String.valueOf(queue.peek()));
        } 
        else {
        	txtDequeue.setText("");
        }
       
    }
    
	public void updateSecondTable(Queue searchingQueue, String title) {
	        
	        List<String> dataToDisplayInTable = new ArrayList();
	        for (int i = (searchingQueue.getElements().length - 1); i >= 0; i--) {
	            if (searchingQueue.getElements()[i] > 0) {
	                dataToDisplayInTable.add(String.valueOf(searchingQueue.getElements()[i]));
	            } else {
	                dataToDisplayInTable.add("");
	        }
	    }
	    
	    int frontFound = -1;
	    for (int i = dataToDisplayInTable.size() - 1; i >= 0; i--) {
	        if (!dataToDisplayInTable.get(i).equals("")) {
	            frontFound = i;
	            break;
	        }
	    }
	    if (frontFound != -1 && title.contains("Searched")) {
	        String frontResult = dataToDisplayInTable.remove(frontFound);
	        String newFrontResult = frontResult + " (*)";
	        dataToDisplayInTable.add(frontFound, newFrontResult);
	    }
	    
	    
	    Object[][] queueTableData = new Object[dataToDisplayInTable.size()][1];
	    for (int i = 0; i < dataToDisplayInTable.size(); i++) {
	        if (!dataToDisplayInTable.get(i).equals("")) {
	            queueTableData[i][0] = dataToDisplayInTable.get(i);
	        }
	
	    }
	    tblQueue2.setModel(new DefaultTableModel(
	            queueTableData,
	            new String[]{
	                title
	            }
	    ));   
	}
	
	public void initTable() {
        Object[][] queueTableData = new Object[queue.maxSize()][1];

        tblQueue1.setModel(new DefaultTableModel(
                queueTableData,
                new String[]{
                    "Queue"
                }
        ));

        tblQueue2.setModel(new DefaultTableModel(
                queueTableData,
                new String[]{
                    "Searching || Sorting "
                }
        ));
    }
	public static void main(String[] args) {
    	new QueueButton().setVisible(true);
    }
 
}
