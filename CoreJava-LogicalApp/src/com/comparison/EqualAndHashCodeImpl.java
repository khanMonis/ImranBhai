package com.comparison;

import java.util.HashMap;
import java.util.Map;

public class EqualAndHashCodeImpl {
	
	String empName;
	EqualAndHashCodeImpl(String empName){
		this.empName=empName;
	}

	
	
	


	public static void main(String[] args) {
		EqualAndHashCodeImpl obj = new EqualAndHashCodeImpl("imran");
		EqualAndHashCodeImpl obj1 = new EqualAndHashCodeImpl("imran");
		    Map<EqualAndHashCodeImpl,String> map = new HashMap<EqualAndHashCodeImpl,String>();
		    map.put(obj, "One");
		    map.put(obj1, "Two");
		    System.out.println("size of map::"+map.size());
			System.out.println("Both Objects are Equal:"+obj.equals(obj1));
			System.out.println("Oject 1 Hashcode:"+obj.hashCode() +",,"+"Oject 1 Hashcode:"+obj1.hashCode());
			map.forEach((k, v) -> System.out.println("Key is: " + k + " Value is: " + v));
			System.out.println("Key isfff: " + map.get(0));
			
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}

	/*
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; EqualAndHashCodeImpl other = (EqualAndHashCodeImpl) obj; if (empName
	 * == null) { if (other.empName != null) return false; } else if
	 * (!empName.equals(other.empName)) return false; return true; }
	 */

}
