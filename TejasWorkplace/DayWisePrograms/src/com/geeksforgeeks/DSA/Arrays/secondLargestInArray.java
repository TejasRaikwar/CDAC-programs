package com.geeksforgeeks.DSA.Arrays;

public class secondLargestInArray {
	int getLargest(int[] arr) {
		int largest = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[largest]) {
				largest = i;
			}
		}
		return largest;
	}

	int secondLargest(int[] arr) {
		int largest = getLargest(arr);
		int result = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[largest]) {
				if (result == -1)
					result = i;
				else if (arr[i] > arr[result]) {
					result = i;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		secondLargestInArray s = new secondLargestInArray();
		int arr[] = new int[] { 1, 122, 3, 4, 3, 2, 12, 32, 4, 43, 66, 99 };
		System.out.println(arr[s.secondLargest(arr)]);

	}

}
