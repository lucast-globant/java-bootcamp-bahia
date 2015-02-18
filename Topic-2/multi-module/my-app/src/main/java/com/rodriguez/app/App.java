package com.rodriguez.app;

import java.io.*;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	String name;
 
    	System.out.print( "Name: " );   
 
    	Scanner entry = new Scanner(System.in);
    	
    	name = entry.next();
    
    	System.out.println( "Hello " + name );
  } 
}