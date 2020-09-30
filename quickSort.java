package test_suite;

import org.junit.Test;

import junit.*;

public class quickSort {

	static int partition(int[] array, int begin, int end) {
		int pivot = end;

		int counter = begin;
		for (int i = begin; i < end; i++) {
			if (array[i] < array[pivot]) {
				int temp = array[counter];
				array[counter] = array[i];
				array[i] = temp;
				counter++;
			}
		}
		int temp = array[pivot];
		array[pivot] = array[counter];
		array[counter] = temp;

		return counter;
	}

	public static int[] sort(int[] array, int begin, int end) {
		if (end >= begin) {
			int pivot = partition(array, begin, end);
			sort(array, begin, pivot - 1);
			sort(array, pivot + 1, end);
		}
		return array;
	}

	@Test
	public void testQuickSort() {
		int[] array = { 10, 1, 0, 2, 4 };
		int start = 0;
		int end = array.length - 1;
		int[] sortedArray = sort(array, start, end);
		System.out.println("Sorted array is: \n");
		for (int element : sortedArray) {
			System.out.println(element);
		}

	}

}
