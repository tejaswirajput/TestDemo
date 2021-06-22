package com.cg.demo.stre;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "Tejaswi", 10000));
		empList.add(new Employee(102, "Ram", 17000));
		empList.add(new Employee(103, "Sham", 100000));
		empList.add(new Employee(104, "Tej", 15000));
		empList.add(new Employee(105, "Laksh", 20000));
//
//    	System.out.println(empList);
//
//		iterate - for loop, for each, iterator  
//
//		empList.forEach(emp -> System.out.println(emp.toString()));
//		
//		empList.stream().filter((e) -> e.salary > 15000).forEach(em -> System.out.println(em.toString()));

		Stream<Employee> empStream = empList.stream();

		Stream<Employee> empWithMoreSal = empStream.filter((e) -> e.salary > 15000);

		empWithMoreSal.forEach(em -> System.out.println(em.toString()));

   

	}
}

