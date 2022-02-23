
package SalesInvoiceGenerator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class MyProjectFrame extends javax.swing.JFrame implements ActionListener  , ListSelectionListener{
    public MyProjectFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InvoiceHeaderTable = new javax.swing.JLabel();
        jPanel_OfInvoiceTable = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        InvoiceHeaderTablejTable = new javax.swing.JTable();
        InvoiceHeaderTablejTable.getSelectionModel().addListSelectionListener(this);
        jScrollPane3 = new javax.swing.JScrollPane();
        InvoiceLineItemsjTable = new javax.swing.JTable();
        InvoiceNumberDisplayjLabel = new javax.swing.JLabel();
        InvoiceDatejLabel = new javax.swing.JLabel();
        CustomerNamejLabel = new javax.swing.JLabel();
        InvoiceTotalDisplayjLabel = new javax.swing.JLabel();
        InvoiceItemsLineTable = new javax.swing.JLabel();
        InvoiceDatejTextField = new javax.swing.JTextField();
        CustomerNamejTextField = new javax.swing.JTextField();
        InvoiceNumberjLabe = new javax.swing.JLabel();
        InviceTotaljLabel = new javax.swing.JLabel();
        CreateNewInvoiceBtn = new javax.swing.JButton();
        CreateNewInvoiceBtn.addActionListener(this);
        CreateNewInvoiceBtn.setActionCommand("CreateNewInv");
        DeleteInvoiceBtn = new javax.swing.JButton();
        DeleteInvoiceBtn.addActionListener(this);
        DeleteInvoiceBtn.setActionCommand("DelInvoice");
        AddItemBtn = new javax.swing.JButton();
        AddItemBtn.addActionListener(this);
        AddItemBtn.setActionCommand("Add");
        DeleteItemBtn = new javax.swing.JButton();
        DeleteItemBtn.addActionListener(this);
        DeleteItemBtn.setActionCommand("DelItem");
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        LoadFile = new javax.swing.JMenuItem();
        LoadFile.addActionListener(this);
        LoadFile.setActionCommand("load");
        SaveFile = new javax.swing.JMenuItem();
        SaveFile.addActionListener(this);
        SaveFile.setActionCommand("save");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        InvoiceHeaderTable.setText("InvoiceTable");

        InvoiceHeaderTablejTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No.", "Date", "Customer", "Total"
            }
        ));
        InvoiceHeaderTablejTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(InvoiceHeaderTablejTable);

        InvoiceLineItemsjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.", "Item Name", "Item Price", "Count", "Item Total"
            }
        ));
        InvoiceLineItemsjTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(InvoiceLineItemsjTable);

        InvoiceNumberDisplayjLabel.setText("InvoiceNumber");

        InvoiceDatejLabel.setText("Invoice Date");

        CustomerNamejLabel.setText("Customer Name");

        InvoiceTotalDisplayjLabel.setText("InvoiceTotal");

        InvoiceItemsLineTable.setText("Invoice Items");

        CustomerNamejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerNamejTextFieldActionPerformed(evt);
            }
        });

        InvoiceNumberjLabe.setText("Invoice Number");

        InviceTotaljLabel.setText("Invoice Total");

        CreateNewInvoiceBtn.setText("Create New Invoice");
        CreateNewInvoiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateNewInvoiceBtnActionPerformed(evt);
            }
        });

        DeleteInvoiceBtn.setText("Delete Invoice");
        DeleteInvoiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteInvoiceBtnActionPerformed(evt);
            }
        });

        AddItemBtn.setText("Add Item");
        AddItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddItemBtnActionPerformed(evt);
            }
        });

        DeleteItemBtn.setText("Delete Item");
        DeleteItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteItemBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_OfInvoiceTableLayout = new javax.swing.GroupLayout(jPanel_OfInvoiceTable);
        jPanel_OfInvoiceTable.setLayout(jPanel_OfInvoiceTableLayout);
        jPanel_OfInvoiceTableLayout.setHorizontalGroup(
            jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_OfInvoiceTableLayout.createSequentialGroup()
                .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_OfInvoiceTableLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(CreateNewInvoiceBtn)
                        .addGap(74, 74, 74)
                        .addComponent(DeleteInvoiceBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_OfInvoiceTableLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_OfInvoiceTableLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_OfInvoiceTableLayout.createSequentialGroup()
                                .addGap(0, 15, Short.MAX_VALUE)
                                .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(InvoiceNumberjLabe, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel_OfInvoiceTableLayout.createSequentialGroup()
                                        .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(CustomerNamejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(InvoiceDatejLabel)
                                            .addComponent(InviceTotaljLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel_OfInvoiceTableLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(InvoiceTotalDisplayjLabel)
                                                    .addComponent(CustomerNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel_OfInvoiceTableLayout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(InvoiceNumberDisplayjLabel)
                                                    .addComponent(InvoiceDatejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(96, 96, 96))
                            .addGroup(jPanel_OfInvoiceTableLayout.createSequentialGroup()
                                .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(InvoiceItemsLineTable)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel_OfInvoiceTableLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddItemBtn)
                        .addGap(76, 76, 76)
                        .addComponent(DeleteItemBtn)
                        .addGap(113, 113, 113))))
        );
        jPanel_OfInvoiceTableLayout.setVerticalGroup(
            jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_OfInvoiceTableLayout.createSequentialGroup()
                .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                    .addGroup(jPanel_OfInvoiceTableLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InvoiceNumberjLabe)
                            .addComponent(InvoiceNumberDisplayjLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(InvoiceDatejLabel)
                            .addComponent(InvoiceDatejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CustomerNamejLabel)
                            .addComponent(CustomerNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InvoiceTotalDisplayjLabel)
                            .addComponent(InviceTotaljLabel))
                        .addGap(18, 18, 18)
                        .addComponent(InvoiceItemsLineTable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_OfInvoiceTableLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddItemBtn)
                            .addComponent(DeleteItemBtn))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel_OfInvoiceTableLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_OfInvoiceTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeleteInvoiceBtn)
                            .addComponent(CreateNewInvoiceBtn))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jMenu1.setText("File");

        LoadFile.setText("Load File");
        jMenu1.add(LoadFile);

        SaveFile.setText("Save File");
        SaveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveFileActionPerformed(evt);
            }
        });
        jMenu1.add(SaveFile);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InvoiceHeaderTable)
                    .addComponent(jPanel_OfInvoiceTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InvoiceHeaderTable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_OfInvoiceTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateNewInvoiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateNewInvoiceBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateNewInvoiceBtnActionPerformed

    private void DeleteInvoiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteInvoiceBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteInvoiceBtnActionPerformed

    private void CustomerNamejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerNamejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerNamejTextFieldActionPerformed

    private void SaveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveFileActionPerformed

    private void AddItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddItemBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddItemBtnActionPerformed

    private void DeleteItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteItemBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteItemBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyProjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyProjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyProjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyProjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyProjectFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddItemBtn;
    private javax.swing.JButton CreateNewInvoiceBtn;
    private javax.swing.JLabel CustomerNamejLabel;
    private javax.swing.JTextField CustomerNamejTextField;
    private javax.swing.JButton DeleteInvoiceBtn;
    private javax.swing.JButton DeleteItemBtn;
    private javax.swing.JLabel InviceTotaljLabel;
    private javax.swing.JLabel InvoiceDatejLabel;
    private javax.swing.JTextField InvoiceDatejTextField;
    private javax.swing.JLabel InvoiceHeaderTable;
    private javax.swing.JTable InvoiceHeaderTablejTable;
    private javax.swing.JLabel InvoiceItemsLineTable;
    private javax.swing.JTable InvoiceLineItemsjTable;
    private javax.swing.JLabel InvoiceNumberDisplayjLabel;
    private javax.swing.JLabel InvoiceNumberjLabe;
    private javax.swing.JLabel InvoiceTotalDisplayjLabel;
    private javax.swing.JMenuItem LoadFile;
    private javax.swing.JMenuItem SaveFile;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel_OfInvoiceTable;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables


        private ArrayList<MyInvoiceHeader> myInvoicesData = new ArrayList<>();
        private MyHeaderTableModel myHeaderTableModel ;
        private MyLineTableModel myLineTableModel ;
        private MyInvoiceHeaderDialog myHeaderDialog ;
        private MyInvoiceLineDialog myLineDialog;
	private SimpleDateFormat myDateFormat = new SimpleDateFormat("dd-mm-yyyy");

    
	@Override
	public void actionPerformed(ActionEvent e) {
		 if (e.getActionCommand().equals("load")){
      
         try { loadFile();}
         catch(Exception ex) { ex.printStackTrace();}
		 }
		 else if (e.getActionCommand().equals("save")){
                 try { saveData();}
         catch(Exception ex) { ex.printStackTrace();}
                 
                 }
                 
                 
                  else if (e.getActionCommand().equals("CreateNewInv")){
                      createInv(); }
                 
                  else if (e.getActionCommand().equals("DelInvoice")){
	              deleteInv();}
                 
                  else if (e.getActionCommand().equals("Add")){
                  addItem();}
                 
                  else if (e.getActionCommand().equals("DelItem")){
	             deleteItem();}
                 
                  else if (e.getActionCommand().equals("createInvOk")){
	        
                  createInvOk();}
                 
                 else if (e.getActionCommand().equals("createInvCancel")){
	           createInvCancel();
                  }
                 else if (e.getActionCommand().equals("createLineOk")){
	           createLineOk();
                  }
                 
                 else if (e.getActionCommand().equals("createLineCancel")){
	           createLineCancel();
                  }
                 

     } 
	
	   private void loadFile() throws Exception {
		 
		   JOptionPane.showMessageDialog(this, "please select Header File","invoice header",JOptionPane.WARNING_MESSAGE);
	       JFileChooser fc = new JFileChooser();
	       int result = fc.showOpenDialog(this);
	       if (result == JFileChooser.APPROVE_OPTION) {
	    	   File selectFile = fc.getSelectedFile();
	    	   FileReader fr = new FileReader(selectFile);
	    	   BufferedReader br = new BufferedReader(fr);
	    	   String line = null ;
	    	   while ((line = br.readLine()) != null) {
	    		   String [] headerSegments = line.split(",");
	    		   String invIDStr = headerSegments[0];
	    		   String invDateStr = headerSegments[1];
	    		   String custName = headerSegments[2];
	    		   int invID = Integer.parseInt(invIDStr);
	    		   Date invDate = myDateFormat.parse(invDateStr);
	    		   MyInvoiceHeader header = new MyInvoiceHeader(invID,invDate,custName);
	    		   myInvoicesData.add(header);
	    	   }
	    	   br.close();
	    	   fr.close();
	    	 
	    
	    	   
	    	   JOptionPane.showMessageDialog(this, "please select Invoice Line File","invoice line",JOptionPane.WARNING_MESSAGE);
		       result = fc.showOpenDialog(this);
		       if (result == JFileChooser.APPROVE_OPTION) {
		    	   selectFile = fc.getSelectedFile();
		    	   fr = new FileReader(selectFile);
		    	   br = new BufferedReader(fr);
		    	   line = null ;
		    	   while ((line = br.readLine()) != null) {
		    		   String [] lineSegments = line.split(",");
		    		   String invIDStr = lineSegments[0];
		    		   String invItem  = lineSegments[1];
		    		   String pricestr = lineSegments[2];
		    		   String countstr = lineSegments[3];
		    		   int invID = Integer.parseInt(invIDStr);
		    		   double price = Double.parseDouble(pricestr);
		    		   int count = Integer.parseInt(countstr);
		    		   MyInvoiceHeader header = findByNum(invID);
		    		   MyInvoiceLine invline = new MyInvoiceLine (invItem,price,count,header);
		    		   header.addLine(invline);
		    	   }
		    	   br.close();
		    	   fr.close();
		    
             myHeaderTableModel = new MyHeaderTableModel(myInvoicesData);
	     InvoiceHeaderTablejTable.setModel(myHeaderTableModel);
             InvoiceHeaderTablejTable.validate();

	    		   
	    	   }
	      
	       }
	   }
	   
	   private MyInvoiceHeader findByNum (int num) {
		   for(MyInvoiceHeader header : myInvoicesData ) {
			   if(header.getInvoiceID() == num ) {
				   return header;
			   }
		   }
		   return null ;
		} 

  

   @Override
    public void valueChanged(ListSelectionEvent e) {
        HeaderTableRowSelected();
        
    }

    private void HeaderTableRowSelected() {
        
        int selectedRowIndex = InvoiceHeaderTablejTable.getSelectedRow();
        if(selectedRowIndex>=0){
        MyInvoiceHeader row = myHeaderTableModel.getInvoices().get(selectedRowIndex);
        
    CustomerNamejTextField.setText(row.getInvoiceCustomerName());
    InvoiceDatejTextField.setText(row.getInvoiceDate().toString());
      InvoiceNumberDisplayjLabel.setText(""+row.getInvoiceID());
     InvoiceTotalDisplayjLabel.setText(""+row.getInvoiceTotal());
    ArrayList<MyInvoiceLine> lines= row.getLines();
    myLineTableModel =new MyLineTableModel(lines);
    InvoiceLineItemsjTable.setModel(myLineTableModel);
    myLineTableModel.fireTableDataChanged();
    }
    }

    private void saveData() throws Exception{
        
        
        JOptionPane.showMessageDialog(this, "Please Chosce File Header to Save", "Invooice Header", JOptionPane.WARNING_MESSAGE);
        JFileChooser fileChoosers = new JFileChooser();
        int option = fileChoosers.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File Csvfile = fileChoosers.getSelectedFile();
            PrintWriter out = new PrintWriter(Csvfile);
 
           for (MyInvoiceHeader header : myInvoicesData) {
             
               out.printf("%d ,%s,%s",header.getInvoiceID(),header.getInvoiceDate().toString(),header.getInvoiceCustomerName());
               out.println();
            }
           out.close();
            JOptionPane.showMessageDialog(this, "Successfully Header File Saved", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
        //for Lines Tabel
               JOptionPane.showMessageDialog(this, "Please Chosce  Line File to Save", "Invooice Line", JOptionPane.WARNING_MESSAGE);
          fileChoosers = new JFileChooser();
         option = fileChoosers.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File Csvfilee = fileChoosers.getSelectedFile();
            PrintWriter outt = new PrintWriter(Csvfilee);
 
 
           for (MyInvoiceHeader header : myInvoicesData) {
               for(MyInvoiceLine Lines :header.getLines()){
              
               outt.printf("%s ,%s,%d",Lines.getItemName(),""+Lines.getItemPrice(),Lines.getItemCount());
               outt.println();
            }}
           outt.close();
            JOptionPane.showMessageDialog(this, "Successfully Lines Saved", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
 
    }
    

    private void createInv() {
        myHeaderDialog=new MyInvoiceHeaderDialog(this);
        myHeaderDialog.setVisible(true);
    }

    private void deleteInv() {
        int row = InvoiceHeaderTablejTable.getSelectedRow();
         myHeaderTableModel.removeRow(row);
         myHeaderTableModel.fireTableDataChanged();
         myLineTableModel.fireTableDataChanged();

         
        
    }

    private void addItem() {
         myLineDialog=new MyInvoiceLineDialog(this);
        myLineDialog.setVisible(true);
    }

    private void deleteItem() {
        int row = InvoiceLineItemsjTable.getSelectedRow();
         myLineTableModel.removeRow(row);
         myLineTableModel.fireTableDataChanged();
         myHeaderTableModel.fireTableDataChanged();
    }

    private void createInvOk() {
        String customerName= myHeaderDialog.getCustomerNameField().getText();
        String invDateStr = myHeaderDialog.getDateField().getText();
       Date invDate =new Date();
        try{
            invDate = myDateFormat.parse(invDateStr);
            
         }catch(ParseException ex){
           
         }
        
        myHeaderDialog.setVisible(false);
        int num= getMaxInvNum() +1;
        MyInvoiceHeader newInvoiceHeader = new MyInvoiceHeader(num,invDate,customerName);
        myInvoicesData.add(newInvoiceHeader);
        myHeaderTableModel.fireTableDataChanged();
     
        
    }
    private void createInvCancel() {
        myHeaderDialog.setVisible(false);
    }

    private int getMaxInvNum()
    {
      int num = 0;
      for(MyInvoiceHeader headr:  myInvoicesData)
      {
         if(headr.getInvoiceID() > num)
         {
           num= headr.getInvoiceID();
         }
      }
      return num;
    }

    private void createLineOk() {
       String itemName= myLineDialog.getItemNameField().getText();
        String itemCountStr= myLineDialog.getItemCountField().getText();
         String itemPriceStr= myLineDialog.getItemPriceField().getText();
         myLineDialog.setVisible(false);
         
         int itemCount =Integer.parseInt(itemCountStr);
         double itemPrice=Double.parseDouble(itemPriceStr);
         
         
         
         MyInvoiceHeader invoiceHeader= myInvoicesData.get(InvoiceHeaderTablejTable.getSelectedRow());
         MyInvoiceLine line= new MyInvoiceLine(itemName,itemPrice,itemCount,invoiceHeader);
         invoiceHeader.addLine(line);
         myLineTableModel.fireTableDataChanged();
         myHeaderTableModel.fireTableDataChanged();
    }

    private void createLineCancel() {
        myLineDialog.setVisible(false);
        }

    }
   
	   

	   