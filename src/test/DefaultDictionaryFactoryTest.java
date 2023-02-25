package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.virginia.cs.hw2.DefaultDictionaryFactory;
import edu.virginia.cs.hw2.WordleDictionary;

public class DefaultDictionaryFactoryTest {
    @Test
    public void testContructor(){
        DefaultDictionaryFactory td = new DefaultDictionaryFactory("dictionary.txt");
    }
}

