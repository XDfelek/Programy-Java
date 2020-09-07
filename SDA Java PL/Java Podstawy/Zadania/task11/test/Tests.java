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
        String inputText = "23";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("Dla liczby 23, program powinien wypisać w konsoli wiadomość: 'Tak'.", "Tak", outContent.toString().trim());
    }

    @Test
    public void testSolution2() {
        String inputText = "2";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("Dla liczby 2, program powinien wypisać w konsoli wiadomość: 'Tak'.", "Tak", outContent.toString().trim());
    }

    @Test
    public void testSolution3() {
        String inputText = "4";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("Dla liczby 4, program powinien wypisać w konsoli wiadomość: 'Nie'.", "Nie", outContent.toString().trim());
    }

    @Test
    public void testSolution4() {
        String inputText = "2000";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("Dla liczby 2000, program powinien wypisać w konsoli wiadomość: 'Nie'.", "Nie", outContent.toString().trim());
    }

    @Test
    public void testSolution5() {
        String inputText = "1";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("Dla liczby 1, program powinien wypisać w konsoli wiadomość: 'Przerywam pracę'.", "Przerywam pracę", outContent.toString().trim());
    }

}