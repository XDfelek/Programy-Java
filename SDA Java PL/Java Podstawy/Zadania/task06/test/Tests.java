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
        String inputText = "4\n11";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("Dla liczb a = 4 oraz b = 11 program powinien wypisać w konsoli liczbę 60.", "60", outContent.toString().trim());
    }

    @Test
    public void testSolution2() {
        String inputText = "9\n64";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("Dla liczb a = 9 oraz b = 64 program powinien wypisać w konsoli liczbę 2044.", "2044", outContent.toString().trim());
    }

    @Test
    public void testSolution3() {
        String inputText = "2\n1";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("Dla liczb a = 2 oraz b = 1 program powinien wypisać w konsoli wiadomość 'Robota skończona'.", "Robota skończona", outContent.toString().trim());
    }

    @Test
    public void testSolution4() {
        String inputText = "2\n2";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("Dla liczb a = 2 oraz b = 2 program powinien wypisać w konsoli wiadomość 'Robota skończona'.", "Robota skończona", outContent.toString().trim());
    }

}