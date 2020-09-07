import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class Tests {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    private final InputStream originalIn = System.in;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
        System.setIn(originalIn);
    }

    @Test
    public void testSolution() {
        String inputText = "Java";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        String expected = "Znalazłem Java\n" +
                "Zaczyna się od Java\n" +
                "Kończy się na Java\n" +
                "Równa się Java\n" +
                "0";

        assertEquals(String.format("Dla tekstu %s, program powinien wypisać w konsoli: \n%s.", inputText, expected), expected, outContent.toString().trim().replaceAll("\r\n", "\n"));
    }

    @Test
    public void testSolution2() {
        String inputText = "Kurs java od podstaw to najlepsza droga do poznania Java";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        String expected = "Znalazłem Java\n" +
                "Kończy się na Java\n" +
                "52";

        assertEquals(String.format("Dla tekstu %s, program powinien wypisać w konsoli: \n%s.", inputText, expected), expected, outContent.toString().trim().replaceAll("\r\n", "\n"));
    }

    @Test
    public void testSolution3() {
        String inputText = "Tylko Java!";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        String expected = "Znalazłem Java\n" +
                "6";

        assertEquals(String.format("Dla tekstu %s, program powinien wypisać w konsoli: \n%s.", inputText, expected), expected, outContent.toString().trim().replaceAll("\r\n", "\n"));
    }

}