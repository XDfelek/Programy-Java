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
        String inputText = "2 * (3.4 - (-7)/2)*(a-2)/(b-1)))";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        String expected = "Błędne sparowanie nawiasów";

        assertEquals(String.format("Dla tekstu %s, program powinien wypisać w konsoli: %s.", inputText, expected), expected, outContent.toString().trim());
    }

    @Test
    public void testSolution2() {
        String inputText = "(2 * (3.4 - (-7)/2)*(a-2)/(b-1))";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        String expected = "OK";

        assertEquals(String.format("Dla tekstu %s, program powinien wypisać w konsoli: %s.", inputText, expected), expected, outContent.toString().trim());
    }

    @Test
    public void testSolution3() {
        String inputText = ") 2 * 4 (";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        String expected = "Błędne sparowanie nawiasów";

        assertEquals(String.format("Dla tekstu %s, program powinien wypisać w konsoli: %s.", inputText, expected), expected, outContent.toString().trim());
    }

    @Test
    public void testSolution4() {
        String inputText = "((2 * 4)";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        String expected = "Błędne sparowanie nawiasów";

        assertEquals(String.format("Dla tekstu %s, program powinien wypisać w konsoli: %s.", inputText, expected), expected, outContent.toString().trim());
    }

}