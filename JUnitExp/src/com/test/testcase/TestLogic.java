package com.test.testcase;

import static org.junit.Assert.*;
import com.test.*;
import org.junit.Test;

public class TestLogic {

	@Test
	public void testFindMax(){
		assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));
		//assertEquals(-2,Calculation.findMax(new int[]{-12,-3,-4,-2}));
	}
}
