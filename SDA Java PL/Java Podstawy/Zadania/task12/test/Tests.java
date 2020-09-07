import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;

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
        String[] input = new String[]{"6", "5", "4", "5", "10", "5", "8", "3", "10", "6", "6", "6", "4", "3", "2", "8", "1", "3", "4", "7"};

        Task.main(input);

        String expected = "1 - 1\n" +
                "2 - 1\n" +
                "3 - 3\n" +
                "4 - 3\n" +
                "5 - 3\n" +
                "6 - 4\n" +
                "7 - 1\n" +
                "8 - 2\n" +
                "9 - 0\n" +
                "10 - 2";

        assertEquals(String.format("Dla tablicy %s, program powinien wypisać w konsoli: \n%s.", Arrays.toString(input), expected), expected, outContent.toString().trim().replaceAll("\r\n", "\n"));
    }

    @Test
    public void testSolution2() {
        String[] input = new String[]{"6"};

        Task.main(input);

        String expected = "1 - 0\n" +
                "2 - 0\n" +
                "3 - 0\n" +
                "4 - 0\n" +
                "5 - 0\n" +
                "6 - 1\n" +
                "7 - 0\n" +
                "8 - 0\n" +
                "9 - 0\n" +
                "10 - 0";

        assertEquals(String.format("Dla tablicy %s, program powinien wypisać w konsoli: \n%s.", Arrays.toString(input), expected), expected, outContent.toString().trim().replaceAll("\r\n", "\n"));
    }

    @Test
    public void testSolution3() {
        String[] input = new String[]{"6", "9", "2", "3", "2", "9", "10"};

        Task.main(input);

        String expected = "1 - 0\n" +
                "2 - 2\n" +
                "3 - 1\n" +
                "4 - 0\n" +
                "5 - 0\n" +
                "6 - 1\n" +
                "7 - 0\n" +
                "8 - 0\n" +
                "9 - 2\n" +
                "10 - 1";

        assertEquals(String.format("Dla tablicy %s, program powinien wypisać w konsoli: \n%s.", Arrays.toString(input), expected), expected, outContent.toString().trim().replaceAll("\r\n", "\n"));
    }

}