package com.java8.lambdaExpress;

public class WorldCup2k24 implements WorldCup{
	
	public String position() {
		return "India Won"; 
	}
	
	public static void main(String[] args) {
		
		//Calling position() method which is inside the class.
		WorldCup first = new WorldCup2k24();
		System.out.println(first.position());
		
		//Calling position() method using Anonymous Class.
		WorldCup runnersUp = new WorldCup() {	
			public String position() {
				
				return "South Africa Runners Up";
			}
		}; 
		System.out.println(runnersUp.position());
		
		
		//calling Position() method using lambda Expression
		WorldCup last = ()->{
			return "Pakistan";
		};
		System.out.println(last.position());
	}

}
