package ARRAYS;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /*  String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	System.out.println(cars[0]);   
//array int/
		int[] myNum= {1,2,3,4,5};
		System.out.println(myNum[2]); 
		 	//change the array element//
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		cars[0]="honda";
		System.out.println(cars[0]);  */
// array length//
	/*	String[] cars= {"Volvo", "BMW", "Ford", "Mazda", "Honda"};
		System.out.println(cars.length);   */
		
	//	loops through the array  //
	
	/*	String[] cars={"Volvo", "BMW", "Ford", "Mazda"};
	for (int i=1; i<cars.length; i++)
	{   System.out.println(cars[i]);
	}  */
	// for each loop//
  
	/*	String[] names= {"Volvo", "BMW", "Ford", "Mazda"};
	for (String a : names) {
		System.out.println(a);
	}
	
	int[] myNum= {1,2,3,4,5};
		for (int i : myNum) 
		{ System.out.println(i); 
		}  */
		//two dimensional array// for loop
		int[][] numbers= {{1,2,3,4},{5,6,7,8}};
   for(int i=0;i<numbers.length; i++) {
	   for(int j=0; j<numbers[i].length; j++) {
   
		System.out.println(numbers[i][j]);
	}
	}}}


