package com.test.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.test.dto.Associates;

public class HashMapExample {

	public static void main(String[] args) {
		hashMapExample1();
		findAssociatesUnderManager();
		sorting();
	}

	public static void hashMapExample1() {
		Map<Integer, String> a = new HashMap<>();
		a.put(1, "Rajesh");
		a.put(1, "Arjun");
		a.put(2, "Naresh");
		a.put(2, "Ravi");
		System.out.println(a);

		Map<Integer, List<String>> b = new HashMap<>();
		List<String> dev = new ArrayList<>(Arrays.asList("Rajesh","Arjun"));
		List<String> qe = new ArrayList<>(Arrays.asList("Naresh","Ravi"));
		List<String> lead = new ArrayList<>(Arrays.asList("Satya"));
		b.put(1, dev);
		b.put(2, qe);

		System.out.println("Initial Map" + b);
		
		List<String> var = b.get(2);
		System.out.println(var);
		
		if(b.containsKey(1)){
			b.put(3, lead);
			//b.get(1).add(4, null);
		}
		
		Set set = b.entrySet();
		Iterator ite = set.iterator();
		
		while(ite.hasNext()){
			Map.Entry mentry = (Map.Entry)ite.next();
			System.out.println(mentry.getKey() + " <--Key, Value --> " + mentry.getValue());
		}
		
		
		//Cloning
		
		HashMap<Integer, List<String>> b1 = new HashMap<Integer, List<String>>();
		b1= (HashMap<Integer, List<String>>) ((HashMap) b).clone();
		
		for(Map.Entry m: b1.entrySet()){
			System.out.println(m.getKey() + "<--Cloned (Key, Value)-->" + m.getValue());
		}
		
	}

	public static void findAssociatesUnderManager() {

		List<Associates> associateList = new ArrayList<Associates>();

		Associates associates1 = new Associates();
		associates1.setManagerName("Chad");
		associates1.setAssociatesName("Arjun");
		associates1.setAssociateType("contractor");
		associateList.add(associates1);

		Associates associates2 = new Associates();
		associates2.setManagerName("Chad");
		associates2.setAssociatesName("Rajesh");
		associates2.setAssociateType("contractor");
		associateList.add(associates2);

		Associates associates3 = new Associates();
		associates3.setManagerName("Chad");
		associates3.setAssociatesName("Saranya");
		associates3.setAssociateType("contractor");
		associateList.add(associates3);

		Associates associates4 = new Associates();
		associates4.setManagerName("Erin");
		associates4.setAssociatesName("Rama");
		associates4.setAssociateType("contractor");
		associateList.add(associates4);

		Associates associates5 = new Associates();
		associates5.setManagerName("Erin");
		associates5.setAssociatesName("Rk");
		associates5.setAssociateType("contractor");
		associateList.add(associates5);

		Associates associates6 = new Associates();
		associates6.setManagerName("Debbie");
		associates6.setAssociatesName("Naresh");
		associates6.setAssociateType("contractor");
		associateList.add(associates6);

		Associates associates7 = new Associates();
		associates7.setManagerName("Debbie");
		associates7.setAssociatesName("Ravi");
		associates7.setAssociateType("contractor");
		associateList.add(associates7);

		Associates associates8 = new Associates();
		associates8.setManagerName("Debbie");
		associates8.setAssociatesName("Ravi");
		associates8.setAssociateType("contractor");
		associateList.add(associates8);

		Map<String, List<String>> associateMap = new HashMap<String, List<String>>();

		for (Associates associate : associateList) {
			String key = associate.getManagerName();
			List<String> nameList = null;
			if (!associateMap.containsKey(key)) {
				nameList = new ArrayList<String>();
				nameList.add(associate.getAssociatesName());
				associateMap.put(key, nameList);
			} else {
				associateMap.get(key).add(associate.getAssociatesName());
			}
		}
		System.out.println(associateMap);
	}

	public static void sorting() {
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(5, "Jayashree");
		hmap.put(5, "A");
		hmap.put(11, "C");
		hmap.put(4, "Z");
		hmap.put(77, "Y");
		hmap.put(9, "P");
		hmap.put(66, "Q");
		hmap.put(0, "R");
		System.out.println("Before Sorting:");
		Set set = hmap.entrySet();
		Iterator ite = set.iterator();
		while (ite.hasNext()) {
			// Map.Entry me = (Map.Entry)iterator.next();
			Map.Entry me = (Map.Entry) ite.next();
			System.out.println(me.getKey() + "b4 sort" + me.getValue());
		}
		
		Map<Integer, String> map = new TreeMap<Integer, String>(hmap); 
        System.out.println("After Sorting:");
        Set set2 = map.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
             Map.Entry me2 = (Map.Entry)iterator2.next();
             System.out.print(me2.getKey() + ": ");
             System.out.println(me2.getValue());
        }
        
	}
}
