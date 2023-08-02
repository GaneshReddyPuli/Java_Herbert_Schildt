// program using for each style loops(Chapter 5 self test question 13)

public class MinMax{

    public static void main(String[] args){

        int[] nums = new int[10];
        nums[0] = 99;
        nums[1] = -10;
        nums[2] = 100123;
        nums[3] = 18;
        nums[4] = -978;
        nums[5] = 5623;
        nums[6] = 463;
        nums[7] = -9;
        nums[8] = 287;
        nums[9] = 49;
        int min,max;
        min = max = nums[0];
    
        for(int i : nums){

            if(i < min) min = i;
            if(i > max) max = i;

        }

        System.out.println("Minimum element of arrray: " + min);
        System.out.println("Maximum element of arrray: " + max);

    }
}

