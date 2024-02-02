package methods;

import java.util.*;

public class ListPractice {

    public static void main(String[] args) {

        List<String> names = new ArrayList<String>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a name: ");
        names.add(scan.nextLine());
        System.out.println("Enter a name: ");
        names.add(scan.nextLine());
        System.out.println("Enter a name: ");
        names.add(scan.nextLine());

        for (String string : names) {
            System.out.println("A name in the list is: " + string);
        }
        
        System.out.println("Enter a name: ");
        names.add(scan.nextLine());

        for (String string : names) {
            System.out.println("A name in the list is: " + string);
        }
    }
    
}
