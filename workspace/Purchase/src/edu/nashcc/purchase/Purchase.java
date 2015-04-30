/*Name: Matthew S. Coley
 *Assignment: Ch 6
 *Date: 29 April 2015
 */

package edu.nashcc.purchase;

public class Purchase {

	private String invoiceNum;
	private double cost;
	private final double SALES_TAX = 1.05;
	
	// constructors
	public Purchase(){
	//this();	
	}
	public Purchase(String invoiceNum, double cost){
		setInvoiceNum(invoiceNum);
		setCost(cost);
	}
	public String getInvoiceNum() {
		return invoiceNum;
	}
	public void setInvoiceNum(String invoiceNum) {
		this.invoiceNum = invoiceNum;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost * SALES_TAX;
	}
	
	
	
}
