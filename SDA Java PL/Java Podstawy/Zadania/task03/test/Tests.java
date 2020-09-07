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
        String inputText = "5400.0";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("Podatek od 5.400zł wynosi 415,98zł.", 415.98, Double.parseDouble(outContent.toString().trim()), 0.1);
    }

    @Test
    public void testSolution2() {
        String inputText = "543200.54";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("Podatek od 543.200,54zł wynosi 161.294,23zł.", 161294.23, Double.parseDouble(outContent.toString().trim()), 0.1);
    }

    @Test
    public void testSolution3() {
        String inputText = "0";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("Podatek od 0,00zł wynosi 0,00zł.", 0, Double.parseDouble(outContent.toString().trim()), 0.1);
    }

    @Test
    public void testSolution4() {
        String inputText = "320.0";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("Podatek od 320,00zł wynosi 0,00zł.", 0.0, Double.parseDouble(outContent.toString().trim()), 0.1);
    }

}