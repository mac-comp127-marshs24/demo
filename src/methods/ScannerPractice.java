package methods;

import java.util.*;

public class ScannerPractice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int x = scan.nextInt();

        System.out.println("You entered the value " + x);

        scan.close();
    }
    
}
