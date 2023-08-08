package com.assigncode;

import com.demo.Main;

public class Shopping {
	
	int productid;
	String productname;
	int quantity;
	int price; 
	int total;
	
	public void accept (int sproductid, String Sproductname, int squantity,int Sprice) {
		
		productid=sproductid;
		productname=Sproductname;
		quantity=squantity;
		price=Sprice;
	}
		public void bill ()	
		{ 
		
		total= price*quantity;
		
		}
		
		public void displaydetails() {
		
			System.out.println(productid+" "+productname+" "+quantity+" "+price+" "+total);
		}
			public static void main(String[] args) {
		    Shopping bill =new Shopping();
		    bill.accept (1,"Earpods",2,1000);
		    bill.displaydetails();
		
		    bill.accept (2,",Macbook",4,2000);
		    bill.calculatebill();
		    bill.displaydetails();
			}
			private void calculatebill() {
				// TODO Auto-generated method stub
				
			}		
			}
		
		
		     
		    
			
	


