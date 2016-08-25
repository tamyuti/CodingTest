//1. Create a map to have a custom class as a key.
package javaCoding;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapCustomClass {
	public static void main(String[] args) {
		Map<Employee,String> map=new HashMap<Employee,String>();
		//create object of employee
		Employee e1=new Employee(1, "John");
		Employee e2=new Employee(2,"Brad");
		
		//add id,name into key
		map.put(e1, "Good");
		map.put(e2, "Average");
		
		for (Entry<Employee, String> entry : map.entrySet()) {
			Employee emp=entry.getKey();
			System.out.println(emp.id +" "+ emp.name+" "+"Performance:"+entry.getValue());
		}
	}

}
