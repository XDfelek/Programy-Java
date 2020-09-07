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
        String inputText = "Ala lubi koty, ale nie jest przez Koty lubiana.";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        String expected = "ala - 1\n" +
                "ale - 1\n" +
                "jest - 1\n" +
                "koty - 2\n" +
                "lubi - 1\n" +
                "lubiana - 1\n" +
                "nie - 1\n" +
                "przez - 1";

        assertEquals(String.format("Dla tekstu %s, program powinien wypisać w konsoli: \n%s.", inputText, expected), expected, outContent.toString().trim().replaceAll("\r\n", "\n"));
    }

    @Test
    public void testSolution2() {
        String inputText = "Ala! lubi? koty, ale. nie jest przez Koty lubiana.";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        String expected = "ala - 1\n" +
                "ale - 1\n" +
                "jest - 1\n" +
                "koty - 2\n" +
                "lubi - 1\n" +
                "lubiana - 1\n" +
                "nie - 1\n" +
                "przez - 1";

        assertEquals(String.format("Dla tekstu %s, program powinien wypisać w konsoli: \n%s.", inputText, expected), expected, outContent.toString().trim().replaceAll("\r\n", "\n"));
    }

    @Test
    public void testSolution3() {
        String inputText = "World. Hello, World!";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        String expected = "hello - 1\n" +
                "world - 2";

        assertEquals(String.format("Dla tekstu %s, program powinien wypisać w konsoli: \n%s.", inputText, expected), expected, outContent.toString().trim().replaceAll("\r\n", "\n"));
    }

}