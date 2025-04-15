package com.Collections;

import java.util.Map;
import java.util.WeakHashMap;

class Hello{
	@Override
	public String toString() {
		return "Hello";
	}
	@Override
	protected void finalize() throws Throwable{
		System.out.println("finalize method is called");
	}
}

public class Collectionweakhashmap1 {
   
	
	
	public static void main(String[] args) throws InterruptedException {
   // Map<Object,String> m = new HashMap<>();
    Map<Object,String> m = new WeakHashMap<>();
    
    Hello h = new Hello();
    m .put(h, "Vcube");
    System.out.println(m);
    
    h= null;
    System.gc();
    Thread.sleep(5000);
    System.out.println(m);
	}

}
