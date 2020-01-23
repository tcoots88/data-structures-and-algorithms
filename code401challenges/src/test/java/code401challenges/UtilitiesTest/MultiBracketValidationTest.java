package code401challenges.UtilitiesTest;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void testMatchingCurlyBrackets() {
        MultiBracketValidation multibracketValidation = new MultiBracketValidation();
        assertTrue(multibracketValidation.multiBracketValidation("{}"));
    }
}
