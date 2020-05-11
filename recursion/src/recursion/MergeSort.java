package recursion;

public class MergeSort {
	private static long[] theArray;
	private int nElems;

	public MergeSort(int max) {
		theArray = new long[max];
		nElems = 0;
	}

	public void insert(long value) {
		theArray[nElems] = value;
		nElems++;
	}

	public void display() {
		for (int j = 0; j < nElems; j++)
			System.out.print(theArray[j] + " ");
		System.out.println("");
	}

	public void mergeSort() {
		long[] workSpace = new long[nElems];
		recMergeSort(workSpace, 0, nElems - 1);
	}

	public static void recMergeSort(long[] workSpace, int lowerBound, int upperBound) {
		if (lowerBound == upperBound) {
			return;
		} else {
			int mid = (lowerBound + upperBound) / 2;
			recMergeSort(workSpace, lowerBound, mid);
			recMergeSort(workSpace, mid + 1, upperBound);
			merge(workSpace, lowerBound, mid + 1, upperBound);
		}

	}

	public static void merge(long[] workSpace, int lowPtr, int highPtr, int upperBound) {

		int j = 0;
		int lowerBound = lowPtr;
		int sizeOfArray = highPtr - lowPtr + 1;
		int mid = highPtr - 1;

		while (lowPtr <= mid && highPtr <= upperBound) {
			if (theArray[lowPtr] < theArray[highPtr]) {
				workSpace[j++] = theArray[lowPtr++];
			} else {
				workSpace[j++] = theArray[highPtr++];
			}
		}

		while (lowPtr <= mid) {
			workSpace[j++] = theArray[lowPtr++];
		}
		while (highPtr <= upperBound) {
			workSpace[j++] = theArray[highPtr++];
		}

		for (j = 0; j < sizeOfArray; j++) {
			theArray[lowerBound + j] = workSpace[j];
		}
	}

	public static void main(String args[]) {
		int maxSize = 100; // array size
		MergeSort arr; // reference to array
		arr = new MergeSort(maxSize); // create the array
		arr.insert(64); // insert items
		arr.insert(21);
		arr.insert(33);
		arr.insert(70);
		arr.insert(12);
		arr.insert(85);
		arr.insert(44);
		arr.insert(3);
		arr.insert(99);
		arr.insert(0);
		arr.insert(108);
		arr.insert(36);
		arr.display(); // display items
		arr.mergeSort(); // merge sort the array
		arr.display(); // display items again
		// end main()
	}
}
