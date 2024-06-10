 package com.demo.sorting;

import java.util.Scanner;

public class MyBubbleSort {

	public static void acceptData(int[] arr) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Data For Bubble Sort:-");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter Number");
			arr[i]=sc.nextInt();
		}
		
	}

	public static void displayData(int[] arr) {
		System.out.println("Sorted Data:-");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

	
	public static void sortdataascending(int[] arr) {
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			flag=false;
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
					flag=true;
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
				
			}
			displayData(arr);
			if(!flag) {
				break;
			}
		}
		
		
	}

}
