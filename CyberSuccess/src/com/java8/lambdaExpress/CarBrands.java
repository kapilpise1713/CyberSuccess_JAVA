package com.java8.lambdaExpress;

public class CarBrands {
	
	public static void main(String[] args) {
		
		
//		//calling Details() method using lambda Expression with 2 parameters.
//		Car car1 = (name,price) ->{return "Car Name is "+name+" Price is "+price;};
//		System.out.println(car1.Details("Mahindra Thar", 180000));
//		
//		
//		Car car2 = (name, price) -> "Car Name is "+name+" Price is "+price;;
//		System.out.println(car2.Details("XUV700", 250000));
		
		
		CarData c1 = new CarData("Mahindra", "XUV700", "Black", 2500000, "7-Seater");
		CarData c2 = new CarData("TATA", "Nexon", "Navy Blue", 1500000, "5-Seater");
		CarData c3 = new CarData("MG", "Hector", "White", 2800000, "7-Seater");
		
		//calling Constructor by passing Object as a CarData in an Argument
		Car car1 = (c) ->{
			System.out.println(c.company+" "+c.name+" "+c.colour+" "+c.price+" "+c.Seating);
		};
		car1.Details(c1);
		
		Car car2 = (c) ->{
			System.out.println(c.company+" "+c.name+" "+c.colour+" "+c.price+" "+c.Seating);
		};
		car2.Details(c2);
		
		Car car3 = (c) ->{
			System.out.println(c.company+" "+c.name+" "+c.colour+" "+c.price+" "+c.Seating);
		};
		car3.Details(c3);
		
		
	}

}
