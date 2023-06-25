public class algorithm {

	private static int k = 0;
	private static int i = 1;

	public void bubbleSort(int[] data) {

		for (int k = 0; k < data.length - 1; k++) {
			if (data[k] > data[k + 1]) {
				int temp = data[k];
				data[k] = data[k + 1];
				data[k + 1] = temp;
			}
		}
	}

	public void selectionSort(int[] data) {
		int minValue = Integer.MAX_VALUE;
		int minIndex = 0;

		for (int i = k; i < data.length; i++) {
			if (data[i] < minValue) {
				minValue = data[i];
				minIndex = i;
			}
		}

		int temp = data[minIndex];
		data[minIndex] = data[k];
		data[k] = temp;
		if (!(k == data.length - 1)) {
			k++;
		}

	}

	public void insertionSort(int[] data) {
		int current = data[i];
		int j = i - 1;

		while (j >= 0 && data[j] > current) {
			data[j + 1] = data[j];
			j--;
		}

		data[j + 1] = current;
		if (!(i == data.length - 1)) {
			i++;
		}

	}

	public void restartK() {
		k = 0;
		i = 1;
	}


}

