import java.util.Scanner;

public class chess {
    public static String determineColor(String s) {
        // Write your logic here to determine the color based on the string s.
        // Return "Black" or "White" based on the problem statement.
        //logic:
        // ⚪⚫ Ka Rule:
        // Tum bas letter ko number banao:
        // "a" = 1, "b" = 2, ... "h" = 8

        // Fir us number ko row ke number se jodo.
        // e.g., b2 → 2 + 2 = 4

        // Agar answer even (2, 4, 6, 8...) aaya → Black,
        // Agar odd (1, 3, 5, 7...) aaya → White

        // code here: 

        int colm = s.charAt(0)-'a'+1;
        int row = s.charAt(1)-'0';
        if((colm+row)%2==0){
            return "Black";
        }else{
            return "White";
        }

       
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        String result = determineColor(s);
        System.out.println(result);
    }
}