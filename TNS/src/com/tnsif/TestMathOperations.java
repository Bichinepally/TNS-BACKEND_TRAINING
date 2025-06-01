package com.tnsif.testdemo;
import org.junit.jupiter.api.Assertions;
//Demo for writing test cases
import org.junit.jupiter.api.Test;

public class TestMathOperations {
	//positive number
	@Test
	public void testForPositive() {
		Assertions.assertTrue(MathOperations.positiveNumber(5));
	}
	//Negative number
	@Test
		public void testForNegative() {
			Assertions.assertTrue(MathOperations.negativeNumber(-3));
		}
	}

