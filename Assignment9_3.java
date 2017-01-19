package ASSIGNMENTS;
//Create an application having a Generic HashMap with Empcode as key and EmpName as value.
//import java.util.Map;
import java.util.HashMap;

public class Assignment9_3 {

	public static void main(String[] args) {
		// Create a Collection emp as HashMap having EmpCode as Integer and EmployeeName as String
		HashMap<Integer,String> emp=new HashMap<Integer,String>();
		// Populate the Collection emp
		emp.put(1001, "Ajay");
		emp.put(1005, "Chetan");
		emp.put(1041, "Deepa");
		emp.put(1085, "Niteen");
		emp.put(1068, "Megha");
		
		//System.out.println(emp);
		//System.out.println("-------------------");
		
		//Display only the Employee Names
		System.out.println(emp.values());
	}

}
