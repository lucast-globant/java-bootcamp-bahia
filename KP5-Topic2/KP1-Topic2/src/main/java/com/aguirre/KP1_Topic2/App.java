package com.aguirre.KP1_Topic2;

import java.util.Scanner;


public class App 
{
	public static void main(String[] args) {
		System.out.print("Please enter your name: ");
		String name = "";
		Scanner scanner = new Scanner(System.in);
		name = scanner.nextLine();
		scanner.close();
		System.out.println("Welcome " + name + "! Have a nice day.");
	}
}
