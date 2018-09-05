import java.util.Scanner;

public class Type {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  double num = 0;
  try {
    System.out.print("Enter a double");
    num = input.nextDouble();
  }
  catch (Exception e)
  {
    System.out.println("that is not a double is ");
  }

  System.out.println("the double is " + num);
 }
}
