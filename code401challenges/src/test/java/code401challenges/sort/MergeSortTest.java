package code401challenges.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void mergeSort() {
        int[] testArr = {27, 13, 19, 87, 52};

        int[] expecteds = {13,19,27,52,87};
        MergeSort.mergeSort(testArr);
        assertArrayEquals(expecteds, testArr);
    }

    @Test
    public void merge() {
    }
}