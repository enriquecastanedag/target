package com.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        exponential(18);
        lineal(17);
        logarithmic(13);
    }

    public static void exponential(int target){
        int[] nums ={2,7,11,15};

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                   System.out.println( "["+nums[i]+ ","+nums[j]+"]" );
                }
            }
        }
    }
    private static void lineal(int target) {
        int[] nums ={2,7,11,15};
        Map<Integer, Integer> resultMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int resta = target - nums[i];
            if (resultMap.containsKey(resta)) {               
                System.out.println( "["+resta+ ","+nums[i]+"]" );
            } else {
                resultMap.put(nums[i], i);
            }
        }
    }

    private static void logarithmic(int target){
        int[] nums ={2,7,11,15};

        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        while(i < j) {
            if(nums[i] + nums[j] == target) {
                System.out.println( "["+nums[i]+ ","+nums[j]+"]" );
                break;
            } else if (nums[i] + nums[j] < target) {
                i++;
            } else {
                j--;
            }
        }
    }
}
