package exc1;

import java.util.Random;

public class Tester {

	public static void main(final String[] args) {

		NumberConverter numcon = new NumberConverter();
		/*
		 * int n; for (int i = 0; i < 20; i++) { n =
		 * generator.nextInt(Integer.MAX_VALUE);
		 * 
		 * System.out.printf("%10d = '%s'%n", n, numcon.maskConverter(n)); }
		 * 
		 * n = 1000; System.out.printf("%10d = '%s'%n", n,
		 * numcon.maskConverter(n));
		 * 
		 * n = 2000; System.out.printf("%10d = '%s'%n", n,
		 * numcon.maskConverter(n));
		 * 
		 * n = 10000; System.out.printf("%10d = '%s'%n", n,
		 * numcon.maskConverter(n));
		 * 
		 * n = 11000; System.out.printf("%10d = '%s'%n", n,
		 * numcon.maskConverter(n));
		 * 
		 * n = 999999999; System.out.printf("%10d = '%s'%n", n,
		 * numcon.maskConverter(n));
		 * 
		 * n = Integer.MAX_VALUE; System.out.printf("%10d = '%s'%n", n,
		 * numcon.maskConverter(n));
		 */

		double n = 2048.05;
		System.out.printf("%10d = '%s'%n", n, numcon.maskConverter((int) n));

	}

}
