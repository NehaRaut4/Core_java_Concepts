package com.app;

public class Garbage_collector {
	public static void main(String[] args) {
		//without finalize() method
		Employee e1 = new Employee("sneha",100000);
		Employee e2 = new Employee("Kunal",578589);
		Employee e3 = new Employee("Priya",7989877);
		
		e1.show();
		e2.show();
		e3.show();
		e1.showNextId();
		e2.showNextId();
		e3.showNextId();
		
	}
}
//here not showing o/p properly
/* Output
ID - 1 Name - sneha Salary - 100000
ID - 2 Name - Kunal Salary - 578589
ID - 3 Name - Priya Salary - 7989877
Next employee Id will be - 4
Next employee Id will be - 4
Next employee Id will be - 4
*/