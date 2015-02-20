package org.fcuenca;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main( String[] args )
    {
    	Scanner keyboard = new Scanner(System.in);
    	System.out.println("please enter something.");
    	String mystring = keyboard.nextLine();
        System.out.println( "something: "+mystring );
    }
}
