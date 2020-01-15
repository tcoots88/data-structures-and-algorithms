package code401challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test public void testBinarySearchMethod(){
        int[] testArray = {1,2,3,24,34,45};
        int testSearchKey = 3;
        int testResult = 2;

        assertEquals(testResult, BinarySearch.BinarySearch(testArray,testSearchKey));
    }

    @Test public void testNotEqualsBinarySearchMethod() {
        int[] testArray = {11,33,33,45,48,54,65,68};
        int testSearchKey = 33;
        int testResult = 5;

        assertNotEquals(testResult, BinarySearch.BinarySearch(testArray,testSearchKey));
    }

}