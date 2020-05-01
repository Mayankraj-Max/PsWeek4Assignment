package com.sapient.Num_Process;

import java.util.Scanner;

public class Num_Process_Runner {

	public static void main(String[] args) {
		Num_Process[] Processes = { new Add(), new Subtract(), new Multiply(), new Divide() };
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter the two numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		
		int[] result = new int[4];
		int i=0;
		for (Num_Process obj : Processes) {
			result[i++] = obj.cal(a, b);
		}
		System.out.println("Enter 1-add 2-subtract 3-multiply 4-divide");
		int choice = sc.nextInt();
		System.out.printf("Your result is = %d",result[choice-1]);
	}
}
