package exception;

import java.util.Scanner;

import exception.constructor.A;

public class Exception {

	static int divide(int x, int y) throws ArithmeticException {
		int res = 0;
		try {
			res = x / y;

			if (res == 1) {
				throw new ArithmeticException("REs was 1");
			}
		} catch (ArithmeticException ex) {
			
			res = 15;
			return -5;
			// throw new NullPointerException("Re throw" + ex.getMessage());
		} finally {
			System.out.println(res);

		}

		return -1;
	}

	public static void main(String[] args) {

		try {
			System.out.println(divide(10, 0));
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
		}

	}
}
