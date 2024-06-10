package com.demo.test;

import com.demo.sorting.MySelectionSort;

public class MyTestSelectionSort {

	public static void main(String[] args) {
		int[] arr=new int[11];
		MySelectionSort.acceptdata(arr);
		MySelectionSort.sortAscending(arr);
		MySelectionSort.displaydata(arr);

	}

}
