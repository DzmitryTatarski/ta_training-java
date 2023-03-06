package com.epam.training.student_Dzmitry_Tatarski.maven_build_tools;


import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Unit test for simple App.
 * @author dzmitry_tatarski
 */
public class AppTest {

    @Test
    public void testShouldBePassed() {
        assertTrue(true);
    }

    @Test
    public void testShouldBeFailed() {
        assertFalse(false);
    }

    @Ignore("Not implemented yet")
    @Test
    public void testShouldBeSKipped() {
        assertTrue(true);
    }

    @Test
    public void testAnotherMethod() {
        App.doNothing();
    }

    @Test
    public void testAnotherClass() {
        EmptyClass.emptyMethod();
    }
}
