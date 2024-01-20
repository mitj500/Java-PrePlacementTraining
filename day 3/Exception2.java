//user define exception throw keyword
import java.util.*;
class Exception2
    {
        static void checkAge(int age)
        {
            if (age >18)
            {System.out.println("eligible fir marry");
            }
            else
            {
                throw new ArithmeticException("not eligibel for the marriage");
            }
    }
     public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         System.out.println("en ter the age");
         int a = sc.nextInt();
         Exception2.checkAge(a);
     }
    }