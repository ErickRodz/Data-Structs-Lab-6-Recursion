import java.math.BigInteger;

import Classes.Pair;

public class FibTester {



public static void main(String[] args) {
		long etotal = 0;
		long etotal2 = 0;
	
	for(int i = 1; i < 6; i++) {
		long startTime = System.nanoTime();
		BigInteger first = BigInteger.valueOf(FibTester(50));
		System.out.println("First Value for Fib 50: " + first.toString());
		long endTime = System.nanoTime();
		long elapsed = endTime - startTime;
		System.out.println("Time Taken: " + elapsed);
		etotal = etotal + elapsed;
}

	for(int i = 1; i < 6; i++) {
		long startTime2 = System.nanoTime();
		BigInteger second = FibTester2(i).first();
		System.out.println("\nSecond Value for Fib 50: " + second.toString());
		long endTime2 = System.nanoTime();
		long elapsed2 = endTime2 - startTime2;
		System.out.println("Time Taken: " +	 elapsed2);
		etotal2 = etotal2 + elapsed2;
	}
		if(etotal2 < etotal) {
			System.out.println("The most efficient method, is the second method!");
		}else {
			System.out.println("The most efficient method, is the first method!");
		}
}


	public static long FibTester(int n) { 
		if (n == 1 || n == 0) return 1; 
		else return FibTester(n-1) + FibTester(n-2); 
	} 

	public static Pair<BigInteger> FibTester2(int n) {
		if (n==0 || n==1) { return new Pair(1, 1); }
		Pair<BigInteger> p = FibTester2(n-1); 
		return new Pair<BigInteger> (p.first().add(p.second()), p.first());
	}
}
