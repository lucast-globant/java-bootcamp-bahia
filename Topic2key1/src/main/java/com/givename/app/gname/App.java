package com.givename.app.gname;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Type your name:");
    	String name = br.readLine();
    	System.out.println("Hello "+name +"!!!");
    }
}
