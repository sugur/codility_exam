package idv.swtang.codility.exam.ts16;

import java.util.Arrays;

//An integer P is a whole square if it is a square of some integer Q; i.e. if P = Q^2.
//
//Write a function:
//
//class Solution { public int solution(int A, int B); }
//that, given two integers A and B, returns the number of whole squares within the interval [A..B] (both ends included).
//
//For example, given A = 4 and B = 17, the function should return 3, because there are three squares of integers in the interval [4..17], namely 4 = 2^2, 9 = 3^2 and 16 = 4^2.
//
//Assume that:
//
//- A and B are integers within the range [-10,000..10,000];
//- A <= B.
//In your solution, focus on correctness. The performane of your solution will not be the focus of the assessment.

public class WholeSquare {

	public int solution(int A, int B) {
		
       System.out.println("Your test case: A: "+ A+ "B: " + B);
		
       if(A > B) {
           return 0;
       }

       
		int counter = 0;
		for (double i = A; i <= B; i++) {
			if ((Math.sqrt(i) % 1) == 0) {
				counter++;
			}
		}
		System.out.println("Returned value::"+  counter);
		
		return counter;
	}
	
}
