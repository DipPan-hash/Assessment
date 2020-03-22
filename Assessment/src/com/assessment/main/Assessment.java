package com.assessment.main;

import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger;

//Program to find the product of two fractions in simplified form
public class Assessment {

	private static final LogManager lgmngr = LogManager.getLogManager();
	private static final Logger logger = lgmngr.getLogger(Logger.GLOBAL_LOGGER_NAME);

	private static int numPdt, denPdt;

	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int den1 = scan.nextInt();
		int num2 = scan.nextInt();
		int den2 = scan.nextInt();

		int[] fraction = multiplyFractions(num1, den1, num2, den2);
		System.out.println("The resultant product is: " + fraction[0] + "/" + fraction[1]);

	}

	/**
	 * Method to multiply fractions and produce the results in their simplified
	 * forms *
	 * 
	 * @param n1
	 * @param d1
	 * @param n2
	 * @param d2
	 * @return int[]
	 * @throws InterruptedException
	 * 
	 */
	public static int[] multiplyFractions(int n1, int d1, int n2, int d2) throws InterruptedException {     //////////////////////////////FIRST PART///////////////////////////////

		logger.info("finding the product of numerator and denominator");
                               /////////////////////////////////////THIRD PART////////////////////////////////////////////////
		Thread t1 = new Thread() {                                        
			@Override
			public void run() {
				numPdt = n1 * n2;
			}
		};
		t1.start();
		denPdt = d1 * d2;
		t1.join();
                           //////////////////////////////////////THIRD PART////////////////////////////////////////////////
		logger.info("resultant product are: " + "numerator=" + numPdt + ";denominator=" + denPdt);
		int gcf = reduce(numPdt, denPdt);
		logger.info("greatest common factor is: " + gcf);
		logger.info("converting into reduced form");
		return new int[] { numPdt / gcf, denPdt / gcf };
	}

	/**
	 * Function to return the greatest common factor of two numbers *
	 * 
	 * @param num
	 * @param den
	 * @return gcf
	 */
	public static int reduce(int num, int den) {    /////////////////////////////FIRST PART///////////////////////////////
		logger.info("finding gcf of resultant numerator and denominator");
		if (num == 0)
			return den;
		return reduce(den % num, num);
	}
}
