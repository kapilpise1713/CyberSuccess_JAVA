package com.multiThreading;

public class GarbageCollectionEx {
	
	public void finalize() {
		System.out.println("Garbage Collected!...");
	}
	
	public static void main(String[] args) {
		GarbageCollectionEx gc1 = new GarbageCollectionEx();
		GarbageCollectionEx gc2 = new GarbageCollectionEx();
		GarbageCollectionEx gc3 = new GarbageCollectionEx();
		
//		gc1 = null;
//		gc2.hashCode();
//		gc3 = null;   //Null value
		
		//System.out.println(gc2.hashCode());
		
		gc1 = gc2;   //object Assigning reference to another object.
		
		System.gc();
	}

}
