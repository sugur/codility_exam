package idv.swtang.codility.exam.ts16;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class WholeSquareTest {

		private WholeSquare wholeSquare;
		private static int inputA;
		private static int inputB ;
        private static int expectedOutput1 = 3;
		
		@Before
		public void setUp() throws Exception {
			
			wholeSquare = new WholeSquare();
			inputA = 4;
			inputB = 17 ;
					
		
		}

		@Test
		public void test() {
			Assert.assertEquals(expectedOutput1, wholeSquare.solution(4, 17));
			
			
		}
}
