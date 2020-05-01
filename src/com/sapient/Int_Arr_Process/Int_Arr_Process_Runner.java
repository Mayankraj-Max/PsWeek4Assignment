package com.sapient.Int_Arr_Process;

import java.util.ArrayList;
import java.util.List;

public class Int_Arr_Process_Runner {

	public static void main(String[] args) {
		
		
		Int_Arr_Process array1 = new Int_Arr_Process(5);
		array1.readArray();
		array1.displayArrayHorizontally();
		array1.displayArrayVertically();
		array1.biggestAndSmallestInArray();
		array1.sortArray();
		array1.displayArrayHorizontally();

		Int_Arr_Process array2 = new Int_Arr_Process();
		array2.readArray();
		array2.displayArrayHorizontally();
		array2.displayArrayVertically();
		array2.biggestAndSmallestInArray();
		array2.sortArray();
		array2.displayArrayHorizontally();


		List<Integer> array3 = new ArrayList<>(4);
		array3.add(1);
		array3.add(2);
		array3.add(3);
		array3.add(4);
	
		Int_Arr_Process array4 = new Int_Arr_Process(array3);

		array4.displayArrayHorizontally();
		array4.displayArrayVertically();
		array4.biggestAndSmallestInArray();
		array4.sortArray();
		array4.displayArrayHorizontally();
		array4.sumOfArray();
		array4.secondBiggestInArray();

	}

}
