import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  strings");
        String a = sc.next().toLowerCase();
        String b = sc.next().toLowerCase();
        int flag = 0;
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    flag = 1;
                    break;
                } else {
                    flag = 0;
                }
            }}
            if (flag == 1) {
                System.out.println("yes");
            } else
                System.out.println("no");
        }
    }
