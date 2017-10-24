package org.emids.util;

import java.util.Scanner;

public class ScannerClass {
	static Scanner scanner = new Scanner(System.in);

	static public String nextline() {
		return scanner.nextLine();
	}

	static public int nextInt() {
		return scanner.nextInt();
	}

	static public double nextdouble() {
		return scanner.nextDouble();
	}
}
