package com.tegar.app;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("==================================");
		System.out.println("==FIND THE SECOND LARGEST NUMBER==");
		System.out.println("==================================");
		
		int[] arrayOfNum = {1,2,3,4,5};
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
					System.out.println("==========");
					System.out.println(arrayOfNum[i] + " > " + arrayOfNum[j]);
					if ( arrayOfNum[i] > arrayOfNum[j] ) {
						if (highest < arrayOfNum[i]) {
							secondLargest = highest;
							highest = arrayOfNum[i];
						} else if (secondLargest == highest || (secondLargest < arrayOfNum[j] && arrayOfNum[j] > arrayOfNum[j-1])) {
							System.out.println("-- " + arrayOfNum[j] + " > " + arrayOfNum[j-1]);
							System.out.println("highest : " + highest + ", secondLargest : " + secondLargest);
							secondLargest = arrayOfNum[j];
							System.out.println("highest : " + highest + ", secondLargest : " + secondLargest);
							System.out.println("+++++++++++++");
						} 
					}
										
					System.out.println("highest : " + highest + ", secondLargest : " + secondLargest);
					System.out.println("==========");
					if (highest < arrayOfNum[j]) {
						secondLargest = highest;
						highest = arrayOfNum[j];
						System.out.println("highest changed!");
					} else if (secondLargest < arrayOfNum[j] && secondLargest < highest) {
						secondLargest = arrayOfNum[j];
						System.out.println("secondLargest changed!");
					}
				}
			}
//			System.out.println("The largest number is " + highest);
			System.out.println("The second largest number is " + secondLargest);
		}
	}

}
