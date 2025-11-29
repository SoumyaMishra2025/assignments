package assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment10 {

	public static void main(String[] args) {
		String[] employee = {"Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green"};
		
		// Employee Data: {Base Salary, Experience, Rating}

		Double[] emp1data = {75000.0, 5.1, 4.2};		
		Double[] emp2data = {68000.0, 3.2, 3.8};
		Double[] emp3data = {82000.0, 7.1, 4.5};
		Double[] emp4data = {90000.0, 10.2, 2.5};
		Double[] emp5data = {60000.0, 2.4, 3.5};
		
		// Store employee data in a map
		
		Map<String, Double[]> empData= new HashMap<>();
		empData.put(employee[0], emp1data);
		empData.put(employee[1], emp2data);
		empData.put(employee[2], emp3data);
		empData.put(employee[3], emp4data);
		empData.put(employee[4], emp5data);
		
		 // Map to store hike percentage
		Map<String, Double> hikeMap = new HashMap<>();
		
		
		
		// Calculate hike for each employee using common method
		
		for(String emp:employee) {
			
			Double[] data = empData.get(emp);
			double hikePercentage = calculateHike(data[0], data[1], data[2]); // call common method
            hikeMap.put(emp, hikePercentage);
					
		}
		
        System.out.println("Hike Percentage for each employee:");
        for(String emp : employee) {
        	System.out.println(emp + ": " + hikeMap.get(emp) + "%");
        }

	}
	
	/**
     * Common method to calculate hike percentage
     *
     * @param baseSalary Base Salary of employee
     * @param experience Experience in years
     * @param rating     Performance rating
     * @return hike percentage
     */
    public static double calculateHike(double baseSalary, double experience, double rating) {
        double variablePayPercentage=0;
        double bonus=0;
        double reward = 0;

        // Determine variable pay and bonus based on rating
        if (rating >= 4) {
            variablePayPercentage = 15;
            bonus = 1500;
        } else if (rating >= 3) {
            variablePayPercentage = 10;
            bonus = 1200;
        } else {
            variablePayPercentage = 3;
            bonus = 300;
        }

        // Additional reward for employees with 5+ years of experience
        if (experience >= 5) {
            reward = 5000;
        }

        // Calculate total hike amount
        double hike = (baseSalary * variablePayPercentage / 100) + bonus + reward;

        // Return hike percentage
        return (hike / baseSalary) * 100;
    }

}
