package mypkgassignment;

public class Calculator {
	public int add(int a,int b) {
		return a+b;
	}
	public int diff(int a,int b) {
		return a-b;
	}
	public int multi(int a,int b) {
		return a*b;
	}
	public int div(int a,int b) {
		if(b==0) {
			throw new IllegalArgumentException("cannot divide by zero");
		}
		return a/b;
	}
	public static void main(String[] args) {
		Calculator ob=new Calculator();
		System.out.println(ob.add(1, 2));
		System.out.println(ob.diff(4, 2));
		System.out.println(ob.multi(1, 2));
		System.out.println(ob.div(4, 2));
	}

	
		

	}


