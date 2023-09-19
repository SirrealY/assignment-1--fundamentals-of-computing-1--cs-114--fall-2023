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

    double Celsius = ((fahrenheit-32)*5)/9;
    System.out.println(Celsius);

    Scanner sc = new Scanner(System.in);

    System.out.println("Make a 5-Character string");

    String str = sc.nextLine();

    System.out.println(str);
    

  
  }
}
