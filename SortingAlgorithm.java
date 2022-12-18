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

	public static int[] swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}

}