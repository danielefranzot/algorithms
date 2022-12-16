public class sortingAlgorithms{
	

	public static void main(String[] args) {
		int max = 20;
		int min = 10;
		int[] intArray = new int[(int)(Math.random() * (max - min + 1) + min)];

		for (int i = 0; i < intArray.length ; i++) {
			intArray[i] = (int)(Math.random() * (max + 1));
		}

		for (int i = 0; i < intArray.length ; i++) {
			System.out.print(intArray[i]);
		}
		System.out.println();

	}
}