package com.rvssoft.cajondesastre.model.arrays;


public class TestClass {

	public static void main(String [] args ) {
		
		int [] arr1 =  new int[3];
		
		System.out.println(arr1[2]);
		System.out.println(arr1[2]);
	
		
		int [][] arr2 = new int[3][2];
		
		System.out.println(arr2[0][0]);
		
		arr2[2] = new int[1];
		
		int[] arr3 = {-23 , 10, 78};
		
		System.out.println(arr3[2]);
		
		int arr4 [] = {100,200};
		
		int [ ] arr5 = {1,2,3};
		
		System.out.println(arr5);
		
		
		int [] arr6 = new int[] { 10,20,30,40};
		
		// Un array de objetos ( mejor dicho , array de referencias a objetos )
		
		// Array de 0 elementos 
		String [] nombres = {};
		
		String[] nombres2 = {"Pepin" , "Honorio" , null, null};
	}
}