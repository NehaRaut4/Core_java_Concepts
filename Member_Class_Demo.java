package com.app;

public class Member_Class_Demo {
	//member inner class is within class but outside of class methods 
	//like data members declared outside of methods
	private int data = 50;
	//creation of member inner class
	class MemberInner{
		void msg() 
		{
			System.out.println("Data = "+data);
		}
	}
	public static void main(String[] args) {
		
		Member_Class_Demo obj = new Member_Class_Demo();//creating object of outer class to access inner class
		//creating object of inner class to access inner class methods eg msg()
		Member_Class_Demo.MemberInner in = obj.new MemberInner(); 
	    in.msg();
	}
}

/*output
  Data = 50
 */
 