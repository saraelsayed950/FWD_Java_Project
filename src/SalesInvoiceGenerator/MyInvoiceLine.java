/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SalesInvoiceGenerator;

public class MyInvoiceLine {
	private String itemName ;
	private double itemPrice ;
	private int itemCount ;
	private double ItemTotal ;
	private MyInvoiceHeader invoice;  
	
	public MyInvoiceLine() {}
	
  public MyInvoiceLine(String itemName, double itemPrice, int itemCount, MyInvoiceHeader invoice) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemCount = itemCount;
		this.invoice = invoice;
                this.setItemTotal(this.itemCount * this.itemPrice);
	}


public String getItemName() {
	return itemName;
}

public void setItemName(String itemName) {
	this.itemName = itemName;
}

public double getItemPrice() {
	return itemPrice;
}

public void setItemPrice(double itemPrice) {
	this.itemPrice = itemPrice;
}

public int getItemCount() {
	return itemCount;
}

public void setItemCount(int itemCount) {
	this.itemCount = itemCount;
}

public double getItemTotal() {
	return ItemTotal;
}

public void setItemTotal(double lineTotal) {
	this.ItemTotal = lineTotal;
}

public MyInvoiceHeader getInvoice() {
	return invoice;
}

public void setInvoice(MyInvoiceHeader invoice) {
	this.invoice = invoice;
}





}
