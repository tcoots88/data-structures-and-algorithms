package code401challenges.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {

    @Test
    public void insertionSort() {
    }

    @Test
    public void testForInsertOnEmptyArray(){
        Sort testSort = new Sort();
        int[] emptyArray = {};

        assertArrayEquals("Array should return as empty", emptyArray, Sort.insertionSort(emptyArray));
    }


}