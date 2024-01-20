import java.util.*;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String str) {
        System.out.println(str);
    }
}


 class userException1 {
    static void status(int age) throws InvalidAgeException {
        if (age > 18) {
            System.out.println("eligible for marry");
        }
    
    else

    {
        throw new InvalidAgeException(" not eligible for marry  try  after some time ");

    }
    }

public static void main(String[] args) throws InvalidAgeException{
    Scanner sc= new Scanner(System.in);
    System.out.println(" enter the age :");
    int age = sc.nextInt();
    
     userException1.status(age);

}
}
