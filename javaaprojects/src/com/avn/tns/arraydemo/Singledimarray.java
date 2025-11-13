package com.avn.tns.arraydemo;

import java.util.Arrays;

//Demo for SingleDimensional Array implementation
public class Singledimarray {

	public static void main(String[] args) {
		//data type array = new data type[size]-->initializing the array
		int arr[]=new int[4];
		arr[0]=10;
		arr[1]=2;
		arr[2]=15;
		arr[3]=20;
		
		//to sort the array
		Arrays.sort(arr);
		//for loop
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
				}
		System.out.println("The result for enhanced loop");
		//Enhanced for loop
		for(int num:arr) {
			System.out.println(num);
		}
	}

}
