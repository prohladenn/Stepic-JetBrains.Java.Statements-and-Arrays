import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    if (a > -15 && a <= 12 || a > 14 && a < 17 || a >=19)
      System.out.println("True");
    else
      System.out.println("False");
  }
}