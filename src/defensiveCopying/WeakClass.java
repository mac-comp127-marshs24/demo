package defensiveCopying;

import java.util.*;

public class WeakClass {

    private List<Integer> nums;
    private int numCount;
    
    public WeakClass() {
        nums = new ArrayList<>();
        numCount = 0;
    }

    public int getNumCount() {
        return numCount;
    }

    public List<Integer> getNums() {
        return List.copyOf(nums);
    }

    public void addNum(int x) {
        nums.add(x);
        numCount++;
    }
}
