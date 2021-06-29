package com.tests.map.linkedhashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AMain {
	
	public static void main(String[] args) {
		
        Map<String, String> hm = new LinkedHashMap<>();
        hm.put("Abacate", "R$ 10,00");
        hm.put("Cebola", "R$ 5,00");
        hm.put("Banana", "R$ 2,00");
 
        System.out.println("LinkedHashMap : " + hm);
 
        hm = new TreeMap<>(hm);
        System.out.println("TreeMap : " + hm);
 
        hm = new HashMap<>(hm);
        System.out.println("HashMap : " + hm);
        
        // Print:
        // LinkedHashMap : {Abacate=R$ 10,00, Cebola=R$ 5,00, Banana=R$ 2,00}
		// TreeMap : {Abacate=R$ 10,00, Banana=R$ 2,00, Cebola=R$ 5,00}
        // HashMap : {Abacate=R$ 10,00, Cebola=R$ 5,00, Banana=R$ 2,00}
        
    }
}