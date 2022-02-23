/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SalesInvoiceGenerator;

/**
 *
 * @author muhammad atef
 */
import java.util.ArrayList;
import java.util.Date;

import javax.swing.table.DefaultTableModel;

public class MyLineTableModel extends DefaultTableModel {
      private String [] colsNames = {"item Name", "item Price" , "item Count","Items Total"};
      private ArrayList<MyInvoiceLine> lines;
      
      public MyLineTableModel(ArrayList<MyInvoiceLine> lines) {
             this.lines = lines;
             
      }
      
      @Override
    public int getColumnCount() {
    	// TODO Auto-generated method stub
    	return colsNames.length;
    }
      
      @Override
    public String getColumnName(int column) {
    	// TODO Auto-generated method stub
        System.out.println("col named called");
    	return colsNames[column];
    }
 
      @Override
    public int getRowCount() {
    	// TODO Auto-generated method stub
        if(this.lines == null){
            lines = new ArrayList<>();
        }
    	return lines.size();
    }
      
      @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        MyInvoiceLine row = lines.get(rowIndex);
        switch(columnIndex)
        {
            case 0:return row.getItemName();
            case 1:return row.getItemPrice();
            case 2:return row.getItemCount();
            case 3:return row.getItemTotal();
        }
    	return "" ;
    }

    public ArrayList<MyInvoiceLine> getLines() {
        return lines;
    }
     @Override
    public void removeRow(int row) {
             lines.remove(row);

    }
    
}
