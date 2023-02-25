package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.virginia.cs.hw2.WordleDictionary;

public class WordleDictionaryTest {
    @Test
    public void testAddWord(){
        WordleDictionary testDictionary = new WordleDictionary();
        
        testDictionary.addWord("baldy");
        assertEquals(1, testDictionary.getDictionarySize());
        assertEquals(true, testDictionary.containsWord("baldy"));
        assertEquals(false, testDictionary.containsWord("World"));
        assertEquals(1, testDictionary.getDictionarySize());
    }
    @Test
    public void testGetRandomWord() {
        WordleDictionary testDictionary = new WordleDictionary();

        testDictionary.addWord("baldy");
        assertEquals( "BALDY", testDictionary.getRandomWord());
    }
}
