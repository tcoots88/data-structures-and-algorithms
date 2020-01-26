package code401challenges.UtilitiesTest;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void testForParens(){
        MultiBracketValidation multiBracketValidation = new MultiBracketValidation();
        assertTrue(MultiBracketValidation.multiBracketValidation("()"));
    }

    @Test
    public void testForMultiParens(){
        MultiBracketValidation multiBracketValidation = new MultiBracketValidation();
        assertTrue(MultiBracketValidation.multiBracketValidation("([{}])"));
    }

    @Test
    public void testForFailure(){
        MultiBracketValidation multiBracketValidation = new MultiBracketValidation();
        assertFalse(MultiBracketValidation.multiBracketValidation("[)"));
    }

    @Test
    public void testForSingle(){
        MultiBracketValidation multiBracketValidation = new MultiBracketValidation();
        assertFalse(MultiBracketValidation.multiBracketValidation(")"));
    }
}
