package sda.prog1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SilniaTest {

    //TODO dołożyć obsługę błędów
    @Before
    public void setup() {
        System.out.println("Biforek");
    }

    //FIXME
    @After
    public void clean() {
        System.out.println("Afterek");
    }

    @Test
    public void silnia() {

        int silniaValue = Silnia.silnia(6);
        assertEquals(720, silniaValue);
    }

    @Test
    public void testSilnia5() {
        int silniaValue = Silnia.silnia(5);
        assertEquals(120, silniaValue);
    }
}