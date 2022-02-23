/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SalesInvoiseGenerator_FinalVersion;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyInvoiceLineDialog extends JDialog{
    private JTextField itemNameField;
    private JTextField itemCountField;
     private JTextField itemPriceField;
    private JLabel itemNameLabel;
    private JLabel itemCountLabel;
     private JLabel itemPriceLabel;
    private JButton okBtn;
    private JButton cancelBtn;
    
    public MyInvoiceLineDialog(myJframe jF) {
        itemNameLabel = new JLabel("Item Name:");
        itemNameField = new JTextField(20);
        
        
        itemCountLabel =new JLabel("Item Count");
        itemCountField =new JTextField(20);
        
        itemPriceLabel =new JLabel("Item Price:");
        itemPriceField =new JTextField(20);
        
        okBtn = new JButton("Ok");
        okBtn.addActionListener(jF);
        okBtn.setActionCommand("createLineOk");
        cancelBtn = new JButton("Cancel");
        cancelBtn.addActionListener(jF);
        cancelBtn.setActionCommand("createLineCancel");
        
        setLayout(new GridLayout(4,2));
        add(itemNameLabel);
        add(itemNameField);
        add(itemCountLabel);
        add(itemCountField);
        add(itemPriceLabel);
        add(itemPriceField);
        add(okBtn);
        add(cancelBtn);
        //setSize(300,120);
       // setLocation(200,200);
       
       pack();
    }

    public JTextField getItemNameField() {
        return itemNameField;
    }

   public JTextField getItemCountField() {
        return itemCountField;
    }
   
   public JTextField getItemPriceField() {
        return itemPriceField;
    }
    
    
}
