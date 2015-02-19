package com.bootcamp.app;

import java.io.Console;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
		Console console = System.console();

		String name = console.readLine("Enter your name: ");

		System.out.println(String.format("Hello, %s!", name));
	}
}
