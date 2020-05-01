package com.sapient.Int_Arr_Process;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Int_Arr_Process {
	int size;
	List<Integer> array;

//(ii)
	public Int_Arr_Process() {
		
		size = 10;
		array = new ArrayList<Integer>(size);
	}

//(i)
	public Int_Arr_Process(int n) {
		
		this.size = n;
		array = new ArrayList<Integer>(n);
	}

// (iii)
	public Int_Arr_Process(List<Integer> temp) {
		
		this.size = temp.size();
		array = new ArrayList<Integer>(size);
		
		for (int i = 0; i < size; i++) {
			this.array.add(temp.get(i));
		}
	}

// (iv)
	Int_Arr_Process(Int_Arr_Process ref) {
		
		this.size = ref.size;
		
		for (int i = 0; i < ref.size; i++) {
			this.array.add(ref.array.get(i));
		}
	}

	Scanner sc = new Scanner(System.in);
// (v)
	public void readArray() {
		
		System.out.println("Enter the Elements in the array");
		for (int i = 0; i < size; i++) {

			int a=sc.nextInt();
			array.add(a);
		}
	}

// (vi)
	public void displayArrayHorizontally() {
		
		for (int i = 0; i < size; i++) {
			System.out.print(array.get(i) + " ");
		}
		System.out.println();
	}

	public void displayArrayVertically() {
		
		for (int i = 0; i < size; i++) {
			System.out.println(array.get(i));
		}
	}

// (vii)
	public void sortArray() {
		
		Collections.sort(array);
	}

// (viii)
	public void biggestAndSmallestInArray() {
	
		System.out.println("The biggest number in the array is" + Collections.max(array));
		System.out.println("The smallest number in the array is" + Collections.min(array));
	}

// (ix)
	public void sumOfArray() {
		
		int sum = 0;
		
		for (int num : array) {
			sum += num;
		}
		System.out.println("Sum of the elements of Array is " + sum);
	}

// (x)
	public void secondBiggestInArray() {
		
		int biggest = 0, secondBiggest = 0;
		
		for (int number : array) {
			if (number > biggest) {
				biggest = number;
			}
		}
		for (int number : array) {
			if (secondBiggest < number && number < biggest) {
				secondBiggest = number;
			}
		}
		System.out.println("Second Biggest element in the Array is " + secondBiggest);
	}

}
