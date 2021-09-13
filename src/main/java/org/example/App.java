package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        String quote;
        String author;
        int count=0;
        System.out.print("What is the quote? ");
        quote=sc.nextLine();
        System.out.print("Who said it? ");
        author=sc.nextLine();
        System.out.println(author + " says, \"" + quote + "\"");
    }
}
