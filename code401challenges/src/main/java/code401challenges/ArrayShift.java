package code401challenges;

import java.util.Arrays;

public class ArrayShift {
    public static void main(String[] args) {

    }
    public static String insertShiftArray(int[] inputArray, int inputValue) {
        int[] outputArray = new int[inputArray.length + 1];
        int halfOfLengthOfNewArr = outputArray.length / 2;
        for(int i = 0; i < outputArray.length; i++)
            if (i < halfOfLengthOfNewArr){
                outputArray[i] = inputArray[i];
            } else if (i == halfOfLengthOfNewArr){
                outputArray[i] = inputValue;
            } else {
                outputArray[i] = inputArray[i-1];
            }
        
        return Arrays.toString(outputArray);
    }
}