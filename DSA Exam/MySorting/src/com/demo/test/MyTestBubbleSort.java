package com.demo.test;

import com.demo.sorting.MyBubbleSort;

public class MyTestBubbleSort {

	public static void main(String[] args) {
		int[] arr=new int[11];
		
		MyBubbleSort.acceptData(arr);
		MyBubbleSort.displayData(arr);
		MyBubbleSort.sortdataascending(arr);
		MyBubbleSort.displayData(arr);
	}

}
