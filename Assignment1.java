import java.util.Scanner;

import java.util.Random;

public class Assignment1 {
  public static void main(String[] args) {
    
    str finalstr;

    int num;

    int fahrenheit;

    double celsius;

    random generate;

    System.out.println("                                            "); 
    System.out.println("     sssss      yyyyy   yyyyy            ");
    System.out.println("     s           yyyy    yyyy            ");
    System.out.println("     sssss         yy    yy");
    System.out.println("         s           yyy");
    System.out.println("         s           yyy");
    System.out.println("     sssss           yyy");
    System.out.println("                                              ");
    Scanner scan = new Scanner(System.in);// Scanner Definition 
    System.out.println ("Enter a number in Fahrenheit");
    fahrenheit = scan.nextInt();

    celsius = ((fahrenheit-32)*5)/9;//Turns Fahrenheit into Celsius 

    System.out.println("Make a 5-Character string");

    String str = scan.next();

    System.out.println("");

    finalstr = str.substring(1,4);//Removes the first and last characters from a 5 letter word 

    String reversed = new StringBuilder(finalstr).reverse().toString();

    generate = new Random(); //Initialize Generate  

    num = generate.nextInt(16384) + 30; //Randomly Generate number from 30-16384
    System.out.println("");
    System.out.println("A random number is being generated...");
    System.out.println("");

    System.out.println(celsius + reversed + num);// Print all of the variable made
    
    scan.close();
  }
}
