package globant;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class App 
{
    public static void main( String[] args ) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name");
		String s = br.readLine();
		System.out.println("Hello "+s);
    }
}
