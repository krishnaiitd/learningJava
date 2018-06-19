package object.clone.test;

import java.util.ArrayList;
import java.util.List;

public class ObjectClone {

	public static void main (String args[]) {
		ClassA objectA = new ClassA();
		List<String> idsA = new ArrayList<>();
		idsA.add("A");
		objectA.setIds(idsA);
		
		
		ClassA objectBofA = null;
		try {
			objectBofA = (ClassA) objectA.clone();
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
		
	}
}
