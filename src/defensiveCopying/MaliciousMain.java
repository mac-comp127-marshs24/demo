package defensiveCopying;

import java.util.*;

public class MaliciousMain {
    public static void main(String[] args) {
        WeakClass wc = new WeakClass();

        List<Integer> nums = wc.getNums();

        nums.add(6);
        nums.add(12);

        int x = wc.getNumCount();
        x = 20;

        System.out.println("Items in class list: " + wc.getNums());
        System.out.println("Number of items in list: " + wc.getNumCount());
    }
    
}
