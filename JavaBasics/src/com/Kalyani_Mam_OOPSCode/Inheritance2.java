package com.Kalyani_Mam_OOPSCode;

   
  class Laptop{
	  
	  void Memory()
	  {
		  System.out.println("Good Memory");
	  }
  }
  
  class Lenovo extends Laptop{
	  
	  void Processor()
	  {
		  System.out.println("Processor");
	  }
  }
   
   public class Inheritance2 {
	
	public static void main(String[] args) {
		
		Lenovo Lp=new Lenovo();
		Lp.Memory();
		Lp.Processor();
	}
		
	}


