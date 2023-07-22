package com.app;

public class Garbage_collector {
	public static void main(String[] args) {
		
		Employee e1 = new Employee("sneha",100000);
		Employee e2 = new Employee("Kunal",578589);
		Employee e3 = new Employee("Priya",7989877);
		
		e1.show();
		e2.show();
		e3.show();
		e1.showNextId();
		e2.showNextId();
		e3.showNextId();
		//subblock 
		{
			Employee e4 = new Employee("Komal",132200000);
			Employee e5 = new Employee("Sayali",97465600);
			e4.show();
			e5.show();
			e4.showNextId();
			e5.showNextId();
		}
		e1.showNextId();
		
		
	}
}
/* Output
Next employee Id will be - 4
ID - 4 Name - Komal Salary - 132200000
ID - 5 Name - Sayali Salary - 97465600
Next employee Id will be - 6
Next employee Id will be - 6
Next employee Id will be - 6-------here should be 4  to make this correct we use finalize()
*/