package code401challenges.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void quickSortOddNumOfValues() {

        int[] test = {98, 48, 13, 86, 95};

        QuickSort.quickSort(test, 0, test.length-1 );
        QuickSort.toString(test);

        int[] expected = {13, 48, 86, 95, 98};

        assertArrayEquals(expected, test);
    }

    @Test
    public void quickSortEvenNumOfValues() {

        int[] test = {98, 48, 13, 86, 95, 1};

        QuickSort.quickSort(test, 0, test.length-1 );
        QuickSort.toString(test);

        int[] expected = {1, 13, 48, 86, 95, 98};

        assertArrayEquals(expected, test);
    }

    @Test
    public void quickSortOnEmpty() {

        int[] test = {};

        QuickSort.quickSort(test, 0, test.length-1 );
        QuickSort.toString(test);

        int[] expected = {};

        assertArrayEquals(expected, test);
    }

    @Test
    public void quickSortWithOneNeg() {

        int[] test = {98, 48, -13, 86, 95};

        QuickSort.quickSort(test, 0, test.length-1 );
        QuickSort.toString(test);

        int[] expected = {-13, 48, 86, 95, 98};

        assertArrayEquals(expected, test);
    }




}