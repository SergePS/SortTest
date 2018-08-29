import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;

import sorter.Sort;
import sorter.impl.BubbleSort;
import sorter.impl.QuickSort;

public class Main {

	public static void main(String[] args) {
		
//		int[] arr = new int[6];
		
/*		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*(arr.length-1));
		}*/
		
		int[] arr = {4,2,3,0,5,1};
		
		
		Arrays.stream(arr).forEach(System.out :: println);
		
		int[] arr1 = new int[arr.length];
		System.arraycopy(arr, 0, arr1, 0, arr.length);
		
		//Arrays.stream(arr).forEach(System.out :: println);
		
		System.out.println("start");
		
		Sort bubbleSort = new BubbleSort();	
		Sort quickSort = new QuickSort();
		
		LocalDateTime start = LocalDateTime.now();
		int[] sortedByBubbleArr = bubbleSort.sort(arr);
		LocalDateTime finish = LocalDateTime.now();
		Duration duration = Duration.between(start, finish);
		long sec = duration.toMillis()/1000;
		System.out.println("time = " + sec);
		
		start = LocalDateTime.now();
		int[] sortedByQuickSortArr = quickSort.sort(arr1);
		finish = LocalDateTime.now();
		duration = Duration.between(start, finish);
		sec = duration.toMillis()/1000;
		System.out.println("time = " + sec);
		
		int i = 1;

		Arrays.stream(sortedByQuickSortArr).forEach(System.out :: println);
		
		
/*		for(int i = sortedByBubbleArr.length-500; i < sortedByBubbleArr.length; i++) {
			System.out.println(sortedByBubbleArr[i]);
		}
		
		for(int i = 0; i < 500; i++) {
			System.out.println(sortedByBubbleArr[i]);
		}*/
		
		
		
		//Arrays.stream(sortedArr).forEach(System.out :: println);
		

	}

}
