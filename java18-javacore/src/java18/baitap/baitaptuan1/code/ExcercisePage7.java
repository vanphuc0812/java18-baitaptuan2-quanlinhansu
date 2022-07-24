package java18.baitap.baitaptuan1.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class ExcercisePage7<T> {

	public static int calculateAverage(Integer[] inputArray, int numOfElement) {
		int average = 0;
		for (int element : inputArray) {
			average += element;
		}
		return average / numOfElement;
	}

	public static int findMin(Integer[] inputArray) {
		int min = inputArray[0];
		for (int element : inputArray) {
			if (min > element) {
				min = element;
			}
		}
		return min;
	}

	public static int findMax(Integer[] inputArray) {
		int max = inputArray[0];
		for (int element : inputArray) {
			if (max < element) {
				max = element;
			}
		}
		return max;
	}

	/***
	 * Function find max negative element in array
	 * 
	 * @param inputArray ArrayList type
	 * @return 0 if array has no element < 0
	 */
	public static int findMaxNegativeElement(Integer[] inputArray) {
		int max = findMin(inputArray);
		for (int element : inputArray) {
			if (max < element && element < 0) {
				max = element;
			}
		}
		if (max > 0)
			return 0;
		else
			return max;
	}

	/***
	 * Function find min negative element in array
	 * 
	 * @param inputArray ArrayList type
	 * @return 0 if array has no element < 0
	 */
	public static int findMinNegativeElement(Integer[] inputArray) {
		if (findMin(inputArray) > 0) {
			return 0;
		} else
			return findMin(inputArray);
	}

	/***
	 * Function find max positive element in array
	 * 
	 * @param inputArray ArrayList type
	 * @return -1 if array has no element > 0
	 */
	public static int findMaxPositiveElement(Integer[] inputArray) {
		if (findMax(inputArray) < 0) {
			return -1;
		} else
			return findMax(inputArray);
	}

	/***
	 * Function find max positive element in array
	 * 
	 * @param inputArray ArrayList type
	 * @return -1 if array has no element > 0
	 */
	public static int findMinPositiveElement(Integer[] inputArray) {
		int min = findMax(inputArray);
		for (int element : inputArray) {
			if (min > element && element > 0) {
				min = element;
			}
		}
		if (min < 0)
			return -1;
		else
			return min;
	}

	public static void printOddEvenElement(Integer[] inputArray) {
		StringBuilder oddNumber = new StringBuilder();
		StringBuilder evenNumber = new StringBuilder();
		for (int element : inputArray) {
			if (element % 2 == 0) {
				oddNumber.append(element).append(",");
			} else {
				evenNumber.append(element).append(",");
			}
		}
		System.out.println(oddNumber.deleteCharAt(oddNumber.length() - 1).toString());
		System.out.println(evenNumber.deleteCharAt(evenNumber.length() - 1).toString());
	}

	public static Integer[] insertElementToIndex(int index, int newElement, Integer[] inputArray) {
		List<Integer> inputList = new ArrayList<>(Arrays.asList(inputArray));
		inputList.add(index, newElement);
		return inputList.toArray(new Integer[0]);
	}

	public static Integer[] removeElementToIndex(int index, Integer[] inputArray) {
		List<Integer> inputList = new ArrayList<>(Arrays.asList(inputArray));
		inputList.remove(index);
		return inputList.toArray(new Integer[0]);
	}

	public T[] removeRepeatElement(T inputArray[]) {
		LinkedHashSet<T> hashSet = new LinkedHashSet<>(Arrays.asList(inputArray));
		ArrayList<T> resultArray = new ArrayList<>(hashSet);
		return (T[]) resultArray.toArray();
	}
}
