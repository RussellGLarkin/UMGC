package Assignment1;

/*	Russell Larkin
 * 	CMIS 242/7384
 * 	26 Mar 2023
 * 
 *  File Name : <Project1.java>
 * 
 *  Description : <This file contains a class that will accept/display weights and then display min, max, and average>
 *  
 */

public class Project1 {
	
	//finds and returns the minimum weight
	public static Weight findMinimum(Weight weight1, Weight weight2, Weight weight3) {
		if (weight1.lessThan(weight2) && weight1.lessThan(weight3))
			return weight1;
		if (weight2.lessThan(weight1) && weight2.lessThan(weight3))
			return weight2;
		return weight3;
	}
	
	//finds and returns the maximum weight
	private static Weight findMaximum(Weight weight1, Weight weight2, Weight weight3) {
		if (!weight1.lessThan(weight2) && !weight1.lessThan(weight3))
			return weight1;
		if (!weight2.lessThan(weight1) && !weight2.lessThan(weight3))
			return weight2;
		return weight3;
	}
	
	//finds and returns the average of 3 weights. 
	public static Weight findAverage(Weight weight1, Weight weight2, Weight weight3) {

		Weight averageWeight = new Weight(0, 0);
		
		averageWeight.addTo(weight1);
		averageWeight.addTo(weight2);
		averageWeight.addTo(weight3);
		
		String avgWeight = averageWeight.toString();
		String sectionOut[] = avgWeight.split(" ");	
		double lb = Double.parseDouble(sectionOut[0]);
		double oz = Double.parseDouble(sectionOut[3]);
		
		int avgPounds = 0;		//initialize avgPounds variable 
		
		double avgOunces = ((lb * 16) + oz) / 3;
		while (avgOunces > 16.0) {
			avgOunces = avgOunces - 16;
			avgPounds++;
		}
		
		Weight finalAverageWeight = new Weight(avgPounds, avgOunces);
		return finalAverageWeight;
	}

	//initialize weights and print output
	public static void main(String[] args) {
		
		Weight weight1 = new Weight(11, 3);
		Weight weight2 = new Weight(7, 20);
		Weight weight3 = new Weight(14, 6);
		
		System.out.println("Created weight1 with " + weight1.toString());
		System.out.println("Created weight2 with " + weight2.toString());
		System.out.println("Created weight3 with " + weight3.toString());
		
		Weight minimumWeight = findMinimum(weight1, weight2, weight3);
		System.out.println("Minimum weight = " + minimumWeight.toString());
		
		Weight maximumWeight = findMaximum(weight1, weight2, weight3);
		System.out.println("Maximum weight = " + maximumWeight.toString());
		
		Weight averageWeight = findAverage(weight1, weight2, weight3);
		System.out.println("Average weight = " + averageWeight.toString());
	}
}

