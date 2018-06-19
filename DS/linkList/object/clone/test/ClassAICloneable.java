package object.clone.test;

import java.util.List;

public class ClassAICloneable implements Cloneable {

	private List<String> ids;
	private String name;

	public List<String> getIds() {
		return ids;
	}

	public void setIds(List<String> ids) {
		this.ids = ids;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "ClassA [ids=" + ids + ", name=" + name + "]";
	}
	
	

}
