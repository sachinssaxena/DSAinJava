package com.example;

public class BinarySearch {

	// Search a sorted array by dividing it

	public static int search(int arr[], int l, int r, int element) {
		// search first half of the array
		// search second half of the array
		// check mid and return if found, increment by one if mid is smaller, decrement
		// by one if mid is larger
		if (r > l) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == element)
				return mid;
			if (arr[mid] > element)
				return search(arr, l, mid - 1, element);
			if (arr[mid] < element)
				return search(arr, mid + 1, r, element);

		}
		return -1;
	}

	public static int itSearch(int[] nums, int target) {
		int l = 0;
		int r = nums.length - 1;

		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (nums[mid] == target)
				return mid;
			else if (nums[mid] > target) {
				r = mid - 1;
			} else if (nums[mid] < target) {
				l = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 4, 10, 40, 50, 60, 70, 80 };
		int arr2[] = { -1, 0, 3, 5, 9, 12 };
		int n = arr.length;
		int x = 60;
		long time = System.currentTimeMillis();
		int result = search(arr, 0, n - 1, x);
		int result2 = itSearch(arr, x);
		System.out.println(System.currentTimeMillis() - time);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
		if (result2 == -1)
			System.out.println("Iterative Search Element not present");
		else
			System.out.println("Iterative Search Element found at index " + result);
	}

}
