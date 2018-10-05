package assignment1;


public class Q_1_4_20 {
	
	public static int searchBitonicArray(int[] array, int value) {
		if (array == null) {
			return -1;
		}

		return searchBitonicArray(array, value, 0, array.length - 1);
	}

	private static int searchBitonicArray(int[] array, int value,
			int startIndex, int endIndex) {
		if (startIndex > endIndex) {
			return -1;
		}

		int middleIndex = (startIndex + endIndex) / 2;
		if (value == array[middleIndex]) {
			return middleIndex;
		}

		if (array[middleIndex] < array[startIndex]) {
			
			if (value > array[middleIndex]) {
				return searchBitonicArray(array, value, startIndex,
						middleIndex - 1);
			}
	
			return searchBitonicArray(array, value, middleIndex + 1, endIndex);
		}


		int found = searchBitonicArray(array, value, startIndex,
				middleIndex - 1);
		if (found == -1) {
			found = searchBitonicArray(array, value, middleIndex + 1, endIndex);
		}

		return found;
	}
}
