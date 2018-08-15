package com.ds.object.clone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectClone {

	public static void main (String args[]) {
		ClassAICloneable objectA = new ClassAICloneable();
		List<String> idsA = new ArrayList<>();
		idsA.add("A");
		objectA.setIds(idsA);
		
		
		ClassAICloneable objectBofA = null;
		try {
			objectBofA = (ClassAICloneable) objectA.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println("objectBofA=" + objectBofA);
		System.out.println("objectA=" + objectA);
		
		List<String> ids2 = objectA.getIds();
		
		System.out.println(ids2);
		ids2.add("B");
		System.out.println(ids2);

		objectBofA.setIds(ids2);
		
		System.out.println("objectBofA=" + objectBofA);
		System.out.println("objectA=" + objectA);
		
		List<String> newIds = new ArrayList<>();
		newIds.addAll(objectA.getIds());
		newIds.add("B");
		objectBofA.setIds(newIds);
		
		System.out.println("objectBofA=" + objectBofA);
		System.out.println("objectA=" + objectA);
		
		
		ClassB classB = new ClassB();
		classB.setName("KP");
		List<String> ids = Arrays.asList("a", "b", "c");
		classB.setIds(ids);
		
		ClassB classBClone = deepClone.byGson(classB, classB.getClass());
		
		List<String> ids3  = classBClone.getIds();
		ids3.add("abc");
		classBClone.setIds(ids3);
		classBClone.setName("VS");
		
		System.out.println("Class B" + classB);
		System.out.println("clone Class: " + classBClone);
		
		
		
	}
}
