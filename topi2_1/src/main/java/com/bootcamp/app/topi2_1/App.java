package com.bootcamp.app.topi2_1;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String name;
		System.out.println("Please introduce your name:");
		name = in.next();

		System.out.println("Hello: " + name);
		in.close();
	}
}
