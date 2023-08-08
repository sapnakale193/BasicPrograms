package com.Arraycodes;

//Create array of order has order id, cust_nae, order_quantity, order_status
//create order using getter setter 1. display all the orders 2. display only order which is quqantity is more than 2




public class Order {
	
	int orderOd;
	String custName;
	int order_Quantity; 
	String orderStatus;
	
	
	public void setOrderId (int orderOd) {
		
		this.orderOd=orderOd;
	}

	public void setCustName (String custName) {
		
		this.custName= custName;
	}
}
