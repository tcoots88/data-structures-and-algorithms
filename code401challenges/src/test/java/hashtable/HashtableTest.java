package hashtable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {

    Hashtable hashtableTest = new Hashtable(8);

    @Before
    public void setHashtableTest() throws Exception {
        hashtableTest.add("Frodo", "Hobbit");
        hashtableTest.add("Samwise", "Hobbit");
        hashtableTest.add("Merry", "Hobbit");
        hashtableTest.add("Pippin", "Hobbit");
        hashtableTest.add("Gimli", "Dwarf");
        hashtableTest.add("Legolas", "Elf");
        hashtableTest.add("Gandalf", "Istari");
        hashtableTest.add("Aragorn", "Man");
        hashtableTest.add("Boromir", "Man");
    }

    @Test
    public void setItAndGetIt(){
        hashtableTest.add("setItUp", "goAndGetIt");
        String actual = hashtableTest.get("setItUp");
        String expected = "goAndGetIt";
        assertEquals( actual, expected );
    }

    @Test
    public void getFromFellowship() {
        String actual = hashtableTest.get("Frodo");
        assertEquals(actual, "Hobbit");
    }

    @Test
    public void testForNull() {
        String actual = hashtableTest.get("Dumbledore");
        assertNull(actual);
    }

    @Test
    public void testByInexistentKey() {
        assertFalse(hashtableTest.contains("6"));
    }

    @Test
    public void testByExistentKey() {
        assertFalse(hashtableTest.contains("8"));
    }


}