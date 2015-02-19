package com.mycompany.app;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner keyboard = new Scanner(System.in);
    	System.out.println("enter your name ");
    	String myname = keyboard.nextLine();
    	
        System.out.println( "\nHello "
        		+ myname+"!!!" );
        keyboard.close();
    }
}
