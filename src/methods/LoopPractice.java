package methods;

import java.util.*;

public class LoopPractice {
    public static void main(String[] args) {
        // C-style for loop
        // List<Integer> numList = new ArrayList<Integer>();
        // for(int i = 8; i > -1; i-=2) {
        //     numList.add(i);
        // }

        // for(Integer num : numList) {
        //     System.out.print(num);
        // }

        // System.out.println();

        // While Loops - read until sentinel
        Scanner scan = new Scanner(System.in);
        String str;
        // System.out.print("Enter a new string: ");
        // while(!(str = scan.nextLine()).isEmpty()) {
        //     System.out.println("You entered: " + str);
        //     System.out.print("Enter a new string: ");
        // }

        do {
            System.out.print("Enter a new string: ");
            str = scan.nextLine();
            System.out.println("You entered: " + str);
        } while(!str.isEmpty());


    }    
}
