package code401challenges;

public class BinarySearch {

    public static int BinarySearch(int[] sortedArray, int searchKey){

        int startArray = 0;
        int endArray = sortedArray.length - 1;
        while(startArray < endArray){
            int midOfArray = (startArray+endArray)/2;
            if(searchKey < sortedArray[midOfArray]){
                endArray = midOfArray - 1;
            } else if (searchKey > sortedArray[midOfArray]){
                startArray = midOfArray + 1;
            } else if ( searchKey == sortedArray[midOfArray]){
                return midOfArray;
            }
        }
        return -1;
    }
}