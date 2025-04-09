package com.geeksforgeeks.DSA.Arrays;

public class secondLargestInArray {
	int getLargest(int[] arr, int n) {
		int largest = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] > arr[largest]) {
				largest = i;
			}
		}
		return largest;
	}

	int secondLargest(int[] arr, int n) {
		int largest = getLargest(arr, arr.length);
		int result = -1;
		for (int i = 0; i < n; i++) {
            if(arr[i] != arr[largest]) {
            	if(result == -1)
            		result = i;
            	else if(arr[i] > arr[result]) {
            		result = i;
            	}
            }
		}
		return result;
	}

	public static void main(String[] args) {
		secondLargestInArray s = new secondLargestInArray();
		int arr[] = new int[] { 1, 122, 3, 4, 3, 2, 12, 32, 4, 43, 66, 99 };
		// int index = s.getLargest(arr, arr.length);
		System.out.println(arr[s.secondLargest(arr, arr.length)]);

	}

}
