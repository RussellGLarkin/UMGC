/*	Russell Larkin
 * 	CMIS 242/7384
 * 	09 Mar 2023
 * 
 *  File Name : <WashingMachineTest.java>
 * 
 *  Description : <This file contains a class that will test the washing machine class and its objects >
 *
 */


public class WashingMachineTest {

	public static void main(String[] args) {
		
		WashingMachine machine1 = new WashingMachine("Samsung", "Top", 10);
		System.out.println(machine1);
			
		WashingMachine machine2 = new WashingMachine("Maytag", "Front", 7);
		System.out.println(machine2);
		
	}

}