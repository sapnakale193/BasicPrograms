package com.Monday;

interface test {
    int square();
}

class arithmetic implements test {
    int b;
    
    arithmetic(int x) {
        b = x;
    }
    
    public int square() {
        return (b * b);
    }
}

class ToTestInt {
    public int return_ans(int x) {
        arithmetic a = new arithmetic(x);
        return a.square();
    }
}

public class ExampleNo2 {
	
	public static void main(String[] args) {
		
	ToTestInt x = new ToTestInt();
  System.out.println("\nThe square of 64 is " + x.return_ans(64));
	  
	}	
	}


