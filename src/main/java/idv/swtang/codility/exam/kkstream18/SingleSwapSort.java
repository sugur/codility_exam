package idv.swtang.codility.exam.kkstream18;

import java.util.Arrays;

public class SingleSwapSort {
	
	private static int swapCount;
	
	public boolean solution(int[] A) {

		   System.out.println("Your test case: A: "+ Arrays.toString(A));
			
		   int count = 0;
		   int[]B = Arrays.copyOf(A, A.length); 
		   Arrays.sort(B);  
		   for(int i=0; i<A.length; i++)
		   {
		    if(A[i] != B[i]) count++;
		   }
		   
		   System.out.println("Your test case: swap counter "+ count);
		   if(count > 2) return false;
		   return true;
	
	}

	private	static void quickSort(int[]	data,	int	lowerIndex,	int	higherIndex)	{	


		int left = lowerIndex;
		int right = higherIndex;
		int pivot = data[lowerIndex + (higherIndex - lowerIndex) / 2];
		while (left <= right) {
			while (data[left] < pivot) {
				left++;
			}
			while (data[right] > pivot) {
				right--;
			}
			
			 
			 
			if (left <= right) {
				System.out.println("data[left]"+ left + data[left] + "< data[right]" +right+ data[right]);
				
				++swapCount;
				swap(data,left, right);
				left++;
				right--;
			}
		}
		if (lowerIndex < right) {
			quickSort(data,lowerIndex, right);
		}
		if (left < higherIndex) {
			quickSort(data,left, higherIndex);
		}
	}

	private	static void swap(int[]	data,	int	i,	int	j)	{
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}

}
