package com.final_keyword;

class Employee{
	
}
class Manager extends Employee{
	
}
public class Test_Final_Keyword {
		
	
	final int v=2023;
		
		final int num;
		static final int x;
		static {
			x=56;
		}

	public Test_Final_Keyword() {
		
		num=1212;
	}
	
	public Test_Final_Keyword(String str) {
		
		num=785;
	}
	
	public static void main(String[] args) {
  // TODO Auto-generated method stub

      int a=10;
      a++;
      System.out.println(a);
      
      final int b;
      b=10;
      int c=a+b;
      
      System.out.println(b);
      System.out.println(c);
      
      Test_Final_Keyword t=new Test_Final_Keyword();
       
      System.out.println(t.v);

}
}
