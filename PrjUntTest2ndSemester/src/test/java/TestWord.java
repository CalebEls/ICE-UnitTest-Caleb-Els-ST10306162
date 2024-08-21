/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.prjunttest2ndsemester.Guessing;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author lab_services_student
 */
public class TestWord {
    //Test word array has the correct data inside
    //test the guess method that will have the word inside thta is true
    //test the guess method that will not have the word inside that will return false
    private Guessing guessing;
    
    @BeforeEach
    public void setUp()
    {
        guessing = new Guessing();
    }
    @Test
    public void testWordArrayHasCorrectData()
    {
        String[] expectedWords = {"cat","dog", "bird","mouse"};
        assertArrayEquals(expectedWords, guessing.getWords(),
                "The word array does not contain the expected data");
    }
    @Test
    public void testWordArrayHasCorrectWord()
    {
        assertTrue(guessing.TestWord("cat"),
                "The guess method should return true for a word that is in the array");
    }
    @Test
    public void testGuessMethodWithIncorrectWord()
    {
         assertFalse(guessing.TestWord("cat"),
                "The guess method should return false for a word that is not in the array");
    }
}
