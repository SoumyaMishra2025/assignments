package assignments;

public class Employees_A3 {

	public static void main(String[] args) {
		
		
		EmpGroup_A3 eg = new EmpGroup_A3();
		
		String[] empName = {eg.employee1,eg.employee2,eg.employee3};		
		int[] empID = {eg.empID1,eg.empID2,eg.empID3};
		
		for(int i=0;i<empID.length;i++) {
			
			System.out.println("Employee Name: "+ empName[i]+" & " +"Employee ID: "+ empID[i]);
			
		}

	}

}
