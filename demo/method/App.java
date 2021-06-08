package com.cg.demo.method;

public class App {
	
	public static void main(String[] args) {
 

        //int num = 10;
		
		
		/*class object = new Constructor();
		 *class name and Constructor name should be same
		 *it does not have any return tyoe
		 *it use to create and initialize object
		 *it is a special type of methode in java 
		 * 
		 */
		

        Employee obj = new Employee();
        obj.id = 101;
        obj.name = "Abc";
        obj.salary = 10.5;
        System.out.println(obj.toString());
        
        Employee obj1 = new Employee();
        obj1.id = 102;
        obj1.name = "sonu";
        obj1.salary = 120.5;
        System.out.println(obj1.toString());
        
        Employee obj2  = new Employee();
        obj2.id = 103;
        obj2.name = "monu";
        obj2.salary = 110.5;
        System.out.println(obj2.toString()); 
        
     
        Employee obj3  = new Employee(105, "ggg", 1123.56);
        System.out.println(obj3.toString()); 
        
        Employee obj4  = new Employee(106, "eee", 23.56);
        System.out.println(obj4.toString());
        
        Employee obj5  = new Employee(105, "aaa");
        System.out.println(obj5.toString());    
    }

}
