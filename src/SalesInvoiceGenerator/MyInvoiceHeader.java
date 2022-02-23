/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SalesInvoiceGenerator;


import java.util.ArrayList;
import java.util.Date;

public class MyInvoiceHeader {

	private int invoiceID ;
	private Date invoiceDate ;
	private String invoiceCustomerName;
	private ArrayList<MyInvoiceLine> Lines;
	private double invoiceTotal;
	
	public MyInvoiceHeader(int invoiceID, Date invoiceDate, String invoiceCustomerName) {
		super();
		this.invoiceID = invoiceID;
		this.invoiceDate = invoiceDate;
		this.invoiceCustomerName = invoiceCustomerName;
	}

	public int getInvoiceID() {
		return invoiceID;
	}

	public void setInvoiceID(int invoiceID) {
		this.invoiceID = invoiceID;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getInvoiceCustomerName() {
		return invoiceCustomerName;
	}

	public void setInvoiceCustomerName(String invoiceCustomerName) {
		this.invoiceCustomerName = invoiceCustomerName;
	}

	public ArrayList<MyInvoiceLine> getLines() {
		if (Lines == null ) {
			Lines = new ArrayList<>(); // lazy loading
		}
		return Lines;
	}

	public void setLines(ArrayList<MyInvoiceLine> lines) {
		Lines = lines;
	}

	public double getInvoiceTotal() {
		return invoiceTotal;
	}

	public void setInvoiceTotal(double invoiceTotal) {
		this.invoiceTotal = invoiceTotal;
	}	
        
	public void addLine (MyInvoiceLine line){
            getLines().add(line);
            setInvoiceTotal(getInvoiceTotal() + line.getItemTotal());
        }
}
