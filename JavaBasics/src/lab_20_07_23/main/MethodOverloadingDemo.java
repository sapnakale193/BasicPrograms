package lab_20_07_23.main;


public class MethodOverloadingDemo {
	
	public void add (int a, float b) {
		
		System.out.println("Add-int,float");
	}
	
	public void add(float a, int b) {
		
	}
    public void add(int a, int b) {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloadingDemo m1=new MethodOverloadingDemo();
		m1.add(1,1);
        int a=1;
        float b=a;
	}
	}
