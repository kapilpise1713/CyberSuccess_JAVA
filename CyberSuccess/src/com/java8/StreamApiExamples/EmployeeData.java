package com.java8.StreamApiExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeData {
	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Atish", "Kondhwa", "Tester", 1000);
		Employee emp2 = new Employee(202, "Pratik", "Pune", "Trainer", 9000);
		Employee emp3 = new Employee(303, "Kapil", "Pandharpur", "Java Developer", 2000);
		Employee emp4 = new Employee(404, "Akshay", "Satara", "Trainer", 7000);
		Employee emp5 = new Employee(505, "Sachin ", "Kothrud", "Tester", 100);
		Employee emp6 = new Employee(606, "Gaurav", "Mohol", "Tester", 10000);
		Employee emp7 = new Employee(707, "Rohan", "Navi Peth", "Java Developer", 100000);
		
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		employees.add(emp6);
		employees.add(emp7);
		
//		List<Employee> employee = employees.stream()
//				//.filter(e->e.domain.equals("Trainer")) //we want to extract the data whose domain is Trainer
//				.filter(e->e.salary > 5000) //Extract whose salary is Greater than the 5000. we write logic in the filter method
//				.map(e->e)
//				.collect(Collectors.toList());
//		
//		employee.forEach((e)->{
//			System.out.println(e.id+" "+e.name+" "+e.domain+" "+e.address+" "+e.salary);
//		});
		
		
		
		//max
		Employee empmax = employees.stream().max((employee1, employee2)->employee1.salary > employee2.salary? 1 : -1).get(); 
		System.out.println(empmax.name);
		
		//min
		Employee empmin = employees.stream().min((employee1, employee2)->employee1.salary > employee2.salary? 1 : -1).get(); 
		System.out.println(empmin.name);
		
		
		
		//Converting List To Map
		System.out.println("Converting List to Map");
		Map<Integer,String> empdata = employees.stream().map(e->e).collect(Collectors.toMap(e->e.id, e->e.name));
		System.out.println(empdata);
		
		
		
		
		
	}

}
