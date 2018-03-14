package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PremeTests {

	@Test
	public void testPrimes(){
		Assert.assertTrue(Primes.isPrime(Integer.MAX_VALUE));
	}

	@Test
	public void testPrimesFast(){
		Assert.assertTrue(Primes.isPrimeFast(Integer.MAX_VALUE));
	}

	@Test
	public void testPrimesLong(){
		long n = Integer.MAX_VALUE;
		Assert.assertTrue(Primes.isPrime(n));
	}

	@Test(enabled = false)
	public void testNonePrimes(){
		Assert.assertFalse(Primes.isPrime(Integer.MAX_VALUE - 2));
	}

}