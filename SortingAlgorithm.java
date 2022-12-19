public class SortingAlgorithm {
	public static void simpleSorting(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					swap(arr, i, j);
				}
			}
		}
	}

	public static void selectionSort(int[] arr) {
		int positionMin = 0;
		int i = 0;

		while (i < arr.length - 1) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[positionMin]) {
					positionMin = j;
				}
			}

			if (positionMin != i) {
				swap(arr, i, positionMin);
			}
			i++;
			positionMin = i;
		}
	}

	public static void bubbleSort(int[] arr) {
		int len = arr.length;

		while (len > 1) {
			for (int i = 0; i < len - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
				}
			}
			len--;
		}
	}

	public static void insertionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int j = i;
			while (j > 0 && arr[j] < arr[j - 1]) {
				swap(arr, j - 1, j);
				j = j - 1;
			}
		}
	}

	public static void mergeSort(int[] arr) {
		int inputLength = arr.length;
		if (inputLength < 2) {
			return;
		}

		int midIndex = inputLength / 2;

		int[] leftArray = new int[midIndex];
		int[] rightArray = new int[inputLength - midIndex];

		for (int i = 0; i < leftArray.length; i++) {
			leftArray[i] = arr[i];
		}

		for (int i = 0; i < rightArray.length; i++) {
			rightArray[i] = arr[midIndex + i];
		}

		mergeSort(leftArray);
		mergeSort(rightArray);

		merge(arr, leftArray, rightArray);
	}

	private static void merge(int[] inputArray, int[] leftArray, int[] rightArray) {
		int leftLen = leftArray.length;
		int rightLen = rightArray.length;

		int i = 0, j = 0, k = 0;

		while (i < leftLen && j < rightLen) {
			if (leftArray[i] < rightArray[j]) {
				inputArray[k] = leftArray[i];
				i++;
			} else {
				inputArray[k] = rightArray[j];
				j++;
			}
			k++;
		}

		while (i < leftLen) {
			inputArray[k] = leftArray[i];
			i++;
			k++;
		}

		while (j < rightLen) {
			inputArray[k] = rightArray[j];
			j++;
			k++;
		}
	}

	private static int[] swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}

}