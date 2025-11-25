package com.test.mavenproject1.p3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//' Prg to store city and population and give the population for the requested city
public class Demo10 {
	public static void main (String args[]) {
		//Map<String ,Long> m = new HashMap<>();
		// for treemap the city will be in the sorted order
	//	Map<String ,Long> m = new TreeMap<>();
		//linkedhashmap - the city displayed will be in the order of the input given
		Map<String ,Long> m = new LinkedHashMap<>();
		m.put("Bangalore",1100000L);
		m.put("Mumbai",1500000L);
		m.put("Hydrebad",900000L);
		m.put("Delhi",700000L);
		m.put("Chennai",50000L);
		m.put("Mumbai",1600000L); // VALUES CAN NOT BE REPEATED , SO THE LAST ADDED VALUE WILL BE TAKEN;
	    System.out.println(m);
	    System.out.println(m.get("Delhi"));
	    m.keySet().forEach(System.out :: println);
	    m.keySet().forEach((x)->{System.out.println(x+" "+m.get(x));});
	    // filter is predicate
	    m.keySet().stream().filter((x)->(m.get(x)>700000 && m.get(x)<1100000)).forEach((x)->{System.out.println(x+" "+m.get(x));});
		
	}

}
