package idv.swtang.codility.exam.kkstream18;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class SingleSwapSortTest {

	private SingleSwapSort singleSwapSort;
	private static int[] inputA;
	private static int[] inputB;
	private static int[] inputC;
	
    private static boolean expectedOutput1 = true;
    private static boolean expectedOutput2 = false;
    private static boolean expectedOutput3 = true;
	
	@Before
	public void setUp() throws Exception {
		
		singleSwapSort = new SingleSwapSort();
		inputA = new int [] {1, 5, 3, 3, 7};
		
		inputB = new int [] {1, 3, 5, 3, 4};
		inputC = new int [] {1, 3, 5};
	
	}

	@Test
	public void test() {
		Assert.assertEquals(expectedOutput1,singleSwapSort.solution(inputA));
		Assert.assertEquals(expectedOutput2,singleSwapSort.solution(inputB));
		Assert.assertEquals(expectedOutput3,singleSwapSort.solution(inputC));
		
		
	}

}
