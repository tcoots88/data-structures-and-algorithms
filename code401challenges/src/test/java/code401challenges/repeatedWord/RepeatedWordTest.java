package code401challenges.repeatedWord;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {

    @Test
    public void repeatedWordsTestOne() {
        String twoCities = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";

        RepeatedWord testWord = new RepeatedWord(twoCities);

        assertEquals("it", testWord.check());
    }

    @Test
    public void repeatedWordsGladiator() {
        String Gladiator = "My name is Maximus Decimus Meridius, Commander of the Armies of the North, General of the Felix Legions, loyal servant to the true emperor, Marcus Aurelius. Father to a murdered son, husband to a murdered wife. And I will have my vengeance, in this life or the next.";

        RepeatedWord testWord = new RepeatedWord(Gladiator);

        assertEquals("of", testWord.check());
    }

    @Test
    public void testForNoRepeats(){
        String testString = "There is no repeated word here";

        RepeatedWord test = new RepeatedWord(testString);

        assertEquals("No repeated words", test.check());
    }

    @Test
    public void testEmptyString(){
        String testEmptyString = "";

        RepeatedWord repeatedWord = new RepeatedWord(testEmptyString);

        assertEquals("No repeated words", repeatedWord.check());
    }







}