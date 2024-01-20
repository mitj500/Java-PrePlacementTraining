// rever se the string without any  function
import java.util.Scanner;

public class rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        System.out.println( " enter the string name:");
        String s = sc.next();
        String rev="";
         for (int i = 0; i <s.length(); i++) {
             char c = s.charAt(i);
             rev = rev +c ;
         }System.out.println();
    } 
}
