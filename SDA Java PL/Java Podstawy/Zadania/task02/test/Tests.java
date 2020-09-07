import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class Tests {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    private final InputStream originalIn = System.in;

    private static final Locale LOCALE = new Locale("pl-PL");
    private Locale systemLocale;

    @Before
    public void setUpStreams() {
        systemLocale = Locale.getDefault();
        Locale.setDefault(LOCALE);
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        Locale.setDefault(systemLocale);
        System.setOut(originalOut);
        System.setErr(originalErr);
        System.setIn(originalIn);
    }

    @Test
    public void testSolution() {
        String inputText = "32.0";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("32 stopnie Celsjusza to 89.6 stopnie Fahrenheita.", 89.6, Double.parseDouble(outContent.toString().trim()), 0.1);
    }

    @Test
    public void testSolution2() {
        String inputText = "62.0";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("62 stopnie Celsjusza to 143.6 stopnie Fahrenheita.", 143.6, Double.parseDouble(outContent.toString().trim()), 0.1);
    }

    @Test
    public void testSolution3() {
        String inputText = "-22.0";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("-22 stopnie Celsjusza to -7.6 stopni Fahrenheita.", -7.6, Double.parseDouble(outContent.toString().trim()), 0.1);
    }

    @Test
    public void testSolution4() {
        String inputText = "0.0";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("0 stopni Celsjusza to 32 stopnie Fahrenheita.", 32.0, Double.parseDouble(outContent.toString().trim()), 0.1);
    }

}