import java.util.*;
public class useRadix{
    public static void main(String arg[]){
     Scanner sc = new Scanner(System.in);
     sc.useRadix(3);
     int a = sc.nextInt();
     System.out.println(a);
     sc.close();
    }
}