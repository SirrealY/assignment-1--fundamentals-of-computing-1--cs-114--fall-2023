import java.util.Scanner;

import java.util.Random;

public class Assignment1 {
  public static void main(String[] args) {
    System.out.println("                                            "); // Space at the beginning of Terminal 
    System.out.println("     sssss      yyyyy   yyyyy            ");
    System.out.println("     s          yyyy   yyyy            ");
    System.out.println("     sssss         yy   yy");
    System.out.println("         s          yyy");
    System.out.println("         s          yyy");
    System.out.println("     sssss          yyy");
    System.out.println("                                              "); //Space at bottom of Terminal 
    
    Scanner scan = new Scanner(System.in);// Scanner Definition 
    System.out.println ("Enter a number in Fahrenheit");
    int fahrenheit = scan.nextInt();

    double Celsius = ((fahrenheit-32)*5)/9;//Turns Fahrenheit into Celsius
    System.out.println(Celsius);

    Scanner sc = new Scanner(System.in);//New Scanner Definetion 

    System.out.println("Make a 5-Character string");

    String str = sc.nextLine();

    System.out.println("");

    String finalstr = str.substring(1,4);//Removes the first and last characters from a 5 letter word 

    String reversed = new StringBuilder(finalstr).reverse().toString();

    Random generate = new Random(); //Initialize Generate 

    int num; 

    num = generate.nextInt(16384) + 30; //Randomly Generate number from 30-16384
    System.out.println("");//Empty line 
    System.out.println("A random number is being generated...");
    System.out.println("");//Empty line

    System.out.println(Celsius+ reversed + num);// Print all of the variable made


    sc.close();
    scan.close();
  }
}
