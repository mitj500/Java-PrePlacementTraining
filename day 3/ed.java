import java.util.Scanner;

public class ed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the strings  for the  two strings");
        String s = sc.nextLine();
        String t = sc.nextLine();
        int diff = 0;
        sc.close();
         if (s.length()>t.length()) {
             diff =s.length()-t.length();
         }
         else if(s.length()<t.length())
         {
             diff =t.length() - s.length();

         }
        else 
        {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)!=t.charAt(i)) {
                    diff++;
                }
            }
        }
        System.out.println(diff);

    }
}
        
    

