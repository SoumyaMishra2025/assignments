package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Assignment5 {

	public static void main(String[] args) {
		/*
		There are 3 TestCases with each Testcase having 3 rows of data. 
		Now, Create List<String, Map<String,String>> to store all the data and
		Print the data from Product details >Supplier Name > Office Depot from the Map<String, Map<String,String>>*/
		
		Map<String,String> Student1Map = new HashMap<String,String>();
		Student1Map.put("Name","John Doe");
		Student1Map.put("Age","Twenty");
		Student1Map.put("Gender","Male");
		Student1Map.put("Roll Number","SBA12345");
		Student1Map.put("Grade","A++");
		Student1Map.put("Major","Computer Science");
		Student1Map.put("GPA","A3.8");
		Student1Map.put("Email","john@example.com");
		Student1Map.put("PAN Number","SDF6543210");
		Student1Map.put("Address","123 Elm St");
		
		
		Map<String,String> Student2Map= new HashMap<String,String>();
		Student2Map.put("Name","Jane Smith");
		Student2Map.put("Age","Twenty One");
		Student2Map.put("Gender","Female");
		Student2Map.put("Roll Number","SBA12346");
		Student2Map.put("Grade","B+");
		Student2Map.put("Major","Mathematics");
		Student2Map.put("GPA","A3.5");
		Student2Map.put("Email","jane@example.com");
		Student2Map.put("PAN Number","REW6543211");
		Student2Map.put("Address","456 Oak St");
		
		Map<String,String> Student3Map =new HashMap<String,String>();		
		Student3Map.put("Name","Mike Brown");
		Student3Map.put("Age","Twenty Two");
		Student3Map.put("Gender","Male");
		Student3Map.put("Roll Number","SBA12347");
		Student3Map.put("Grade","A+");
		Student3Map.put("Major","Physics");
		Student3Map.put("GPA","A3.9");
		Student3Map.put("Email","mike@example.com");
		Student3Map.put("PAN Number","TYR6543212");
		Student3Map.put("Address","789 Pine St");
		
		//Saving 1st table to a list
		List<Map<String,String>> students = new ArrayList<Map<String,String>>();
		students.add(Student1Map);
		students.add(Student2Map);
		students.add(Student3Map);
		
		//Creating Employee Data
		
		//Enter data of 1st row
		Map<String,String> employee1Map = new HashMap<String,String>();		
		employee1Map.put("Employee ID","E001");
		employee1Map.put("Name","Alice Green");
		employee1Map.put("Age","Thirty");
		employee1Map.put("Gender","Female");
		employee1Map.put("Department","Engineering");
		employee1Map.put("Position","Software Engineer");
		employee1Map.put("Salary","75K Pounds");
		employee1Map.put("Email","alice@example.com");
		employee1Map.put("PAN Number","SDF6543210");
		
		//Enter data of 2nd row
		Map<String,String> employee2Map = new HashMap<String,String>();		
		employee2Map.put("Employee ID","E002");
		employee2Map.put("Name","Bob Johnson");
		employee2Map.put("Age","Thirty five");
		employee2Map.put("Gender","Male");
		employee2Map.put("Department","Marketing");
		employee2Map.put("Position","Marketing Manager");
		employee2Map.put("Salary","85K Pounds");
		employee2Map.put("Email","bob@example.com");
		employee2Map.put("PAN Number","REW6543211");
		
		//Enter data of 3rd row
		Map<String,String> employee3Map = new HashMap<String,String>();		
		employee3Map.put("Employee ID","E003");
		employee3Map.put("Name","Carol White");
		employee3Map.put("Age","Thirty Eight");
		employee3Map.put("Gender","Female");
		employee3Map.put("Department","Sales");
		employee3Map.put("Position","Sales Executive");
		employee3Map.put("Salary","65K Pounds");
		employee3Map.put("Email","carole@example.com");
		employee3Map.put("PAN Number","TYR6543212");
		
		//2nd table in a list
		List<Map<String,String>> employee = new ArrayList<Map<String,String>>();
		employee.add(employee1Map);
		employee.add(employee2Map);
		employee.add(employee3Map);
		
		
		//Creating Product Data
		
		Map<String,String> produc1Map = new HashMap<String,String>();		
		produc1Map.put("Product ID","P001");
		produc1Map.put("Name","Laptop");
		produc1Map.put("Catagory","Electronics");
		produc1Map.put("Price","12K Pounds");
		produc1Map.put("Stock Quantity","Not Available");
		produc1Map.put("Supplier","Tech Supplies");
		produc1Map.put("Warranty","2 Years");
		produc1Map.put("Rating","4.5 Stars");
		produc1Map.put("Manufacturing Date","Aug 2023");
		produc1Map.put("Expiry Date","Aug 2028");
		
		Map<String,String> produc2Map = new HashMap<String,String>();		
		produc2Map.put("Product ID","P002");
		produc2Map.put("Name","Desk Chairs");
		produc2Map.put("Catagory","furniture");
		produc2Map.put("Price","150K Pounds");
		produc2Map.put("Stock Quantity","Two");
		produc2Map.put("Supplier","Office Depot");
		produc2Map.put("Warranty","1 Years");
		produc2Map.put("Rating","4 Stars");
		produc2Map.put("Manufacturing Date","Sep 2024");
		produc2Map.put("Expiry Date","N/A");
		
		Map<String,String> produc3Map = new HashMap<String,String>();		
		produc3Map.put("Product ID","P003");
		produc3Map.put("Name","Coffee Maker");
		produc3Map.put("Catagory","Kitchen");
		produc3Map.put("Price","75 Pounds");
		produc3Map.put("Stock Quantity","Two Hundred");
		produc3Map.put("Supplier","KitchenWorld");
		produc3Map.put("Warranty","6 Months");
		produc3Map.put("Rating","4.2 Stars");
		produc3Map.put("Manufacturing Date","Jan 2025");
		produc3Map.put("Expiry Date","Jan 2027");
		
		List<Map<String,String>> product = new ArrayList<Map<String,String>>();
		
		
		//All Data
		Map<String, List<Map<String,String>>> data = new HashMap <String,List<Map<String,String>>>();
		data.put("StudentData", students);
		data.put("EmployeeData", employee);
		data.put("ProductDetails", product);
		
		System.out.println("All data" + data);
		
		
		
		
		

	}

}
