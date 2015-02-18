package topic2.key1;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        sc.close();
        System.out.println("Hello "+ name+ ", have a nice day!");
    }
}
