import java.util.*;
public class scanner{
    public static void main(String arg[]){
     Scanner s = new Scanner(System.in);
      System.out.println("Enter your age:");
      int a = s.nextInt();
      System.out.printf("you are %d years old", a);
      s.close();
    }
}