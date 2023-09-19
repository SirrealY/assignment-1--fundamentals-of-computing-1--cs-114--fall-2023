import java.util.Scanner;  

public class Assignment1 {
  public static void main(String[] args) {
    System.out.println("                                            "); // Space at the beginning of Terminal 
    System.out.println("    sssss     yyyyy   yyyyy            ");
    System.out.println("    s          yyyy   yyyy            ");
    System.out.println("    sssss        yy   yy");
    System.out.println("        s          yyy");
    System.out.println("        s          yyy");
    System.out.println("    sssss          yyy");
    System.out.println("                                              "); //Space at bottom of Terminal 
    
    Scanner scan = new Scanner(System.in);// Scanner Definition 
    System.out.println ("Enter a number in Fahrenheit");
    int fahrenheit = scan.nextInt();

    double Celsius = ((fahrenheit-32)*5)/9;//Turns Fahrenheit into Celsius
    System.out.println(Celsius);

    Scanner sc = new Scanner(System.in);//New Scanner Definetion 

    System.out.println("Make a 5-Character string");

    String str = sc.nextLine();

    System.out.println(str);//Delete when code is done

    String finalstr = str.substring(1,4);//Removes the first and last characters from a 5 letter word 

    System.out.println(finalstr);//Delete when code is done

    String reversed = new StringBuilder(finalstr).reverse().toString();

    System.out.println(reversed);

    

  

    


    

  
  }
}
