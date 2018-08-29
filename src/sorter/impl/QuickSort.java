package sorter.impl;

import sorter.Sort;

public class QuickSort implements Sort {
	private int[] arr;

	@Override
	public int[] sort(int[] arr) {
		this.arr = arr;
		sortArr(0, arr.length - 1); // left and right index
		return this.arr;
	}

	private void sortArr(int left, int right) {
		int pivot = arr[(int) (Math.random() * right)];
		int rightBegin = right;
		int temp = 0;
		if (right - left > 1) {
			for (int i = left; i < arr.length; i++) {
				if (i + 1 < right) { // if the wall on the right position then stop
					if (arr[i] > pivot) {
						for (int j = right; j > 0; j--) {
							if (right - 1 > i) { // if the wall on the left position then stop
								if (arr[j] <= pivot) {
									temp = arr[j];
									arr[j] = arr[i];
									arr[i] = temp;
									right--;
									break;
								}
								right--;
							} else {
								checkPoint(j - 1, j);
								sortArr(left, j - 1);
								sortArr(j, rightBegin);
								right--;
								break;
							}
						}
					}
				} else {
					checkPoint(i, right);
					sortArr(left, i);
					sortArr(i + 1, right);
					break;
				}
			}
		}

	}

	private void checkPoint(int posLeft, int posRight) {
		if (arr[posLeft] > arr[posRight]) {
			int temp = arr[posRight];
			arr[posRight] = arr[posLeft];
			arr[posLeft] = temp;
		}
	}

}
