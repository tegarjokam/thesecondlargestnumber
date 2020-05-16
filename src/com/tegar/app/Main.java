package com.tegar.app;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("==================================");
		System.out.println("==FIND THE SECOND LARGEST NUMBER==");
		System.out.println("==================================");
		
		int[] arrayOfNum = {1,2,6,17,4,5};
		System.out.println("Array = " + Arrays.toString(arrayOfNum));
		
		int highest;
		
		int secondLargest;
		
		if (arrayOfNum.length < 1) {
			System.out.println("your array length must be more than 0");
		} else {
			highest = arrayOfNum[0];
			secondLargest = arrayOfNum[0];
			for (int i = 0; i < arrayOfNum.length; i++ ) {
				for (int j = i+1; j < arrayOfNum.length; j++) {
					if ( arrayOfNum[i] > arrayOfNum[j] ) {
						if (highest < arrayOfNum[i]) {
							secondLargest = highest;
							highest = arrayOfNum[i];
						} else if (secondLargest == highest || (secondLargest < arrayOfNum[j] && arrayOfNum[j] > arrayOfNum[j-1])) {
							secondLargest = arrayOfNum[j];
						} 
					}
					
					if (highest < arrayOfNum[j]) {
						secondLargest = highest;
						highest = arrayOfNum[j];
					} else if (secondLargest < arrayOfNum[j] && highest != arrayOfNum[j]) {
						secondLargest = arrayOfNum[j];
					}
				}
			}
			System.out.println("The second largest number is " + secondLargest);
		}
	}

}
