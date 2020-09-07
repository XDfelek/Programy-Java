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
        String inputText = "10.0\n10";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("Rata od kwoty 10,00zł na 10 miesięcy wynosi 512,50zł ponieważ kwota została zwiększona do 5.000,00zł.", 512.5, Double.parseDouble(outContent.toString().trim()), 0.1);
    }

    @Test
    public void testSolution2() {
        String inputText = "100000\n10";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("Rata od kwoty 10.000,00zł na 10 miesięcy wynosi 512,50zł ponieważ kwota została zmniejszona do 5.000,00zł.", 512.5, Double.parseDouble(outContent.toString().trim()), 0.1);
    }

    @Test
    public void testSolution3() {
        String inputText = "1000\n50";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("Rata od kwoty 1.000,00zł na 50 miesięcy wynosi 30,56zł ponieważ ilość rat została zmniejszona do 36.", 30.56, Double.parseDouble(outContent.toString().trim()), 0.1);
    }

    @Test
    public void testSolution4() {
        String inputText = "1000\n2";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("Rata od kwoty 1.000,00zł na 2 miesiące wynosi 30,56zł ponieważ ilość rat została zwiększona do 36.", 30.56, Double.parseDouble(outContent.toString().trim()), 0.1);
    }

    @Test
    public void testSolution5() {
        String inputText = "7500.50\n36";
        System.setIn(new ByteArrayInputStream(inputText.getBytes()));

        Task.main(new String[]{});

        assertEquals("Rata od kwoty 7.500,50zł na 36 miesięcy wynosi 229,18zł.", 229.18, Double.parseDouble(outContent.toString().trim()), 0.1);
    }

}