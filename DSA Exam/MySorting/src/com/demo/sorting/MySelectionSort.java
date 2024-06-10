package com.demo.sorting;

import java.util.Scanner;

public class MySelectionSort {

	public static void acceptdata(int[] arr) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Data For Selection Sort:-");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter Number");
			arr[i]=sc.nextInt();
		}
		
	}
	public static void displaydata(int[] arr) {
		System.out.println("Sorted Data:-");
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+"-->"+arr[i]);
		}
		
	}
	public static void sortAscending(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			//it will find the next minimum number
			int minidx=findMinnum(arr,i,arr.length);
			//swap the smallest element at ith position
			int temp=arr[i];
			arr[i]=arr[minidx];
			arr[minidx]=temp;
					
		}
		
	}
	
	private static int findMinnum(int[] arr, int start, int end) {
		int min=arr[start];
		int minidx=start;
		for(int i=start;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				minidx=i;
				
			}
		}
		return minidx;
	}
	
	
	
	

}
