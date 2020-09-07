import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;
import java.util.function.Consumer;

import static org.junit.Assert.assertEquals;

public class BaseTest {

    private static Locale systemLocale;
    private static final float FLOAT_TESTS_DELTA = 0.1f;

    @BeforeClass
    public static void beforeClass() {
        systemLocale = Locale.getDefault();
        Locale.setDefault(new Locale("pl-PL"));
    }

    @AfterClass
    public static void afterClass() {
        Locale.setDefault(systemLocale);
    }

    @After
    public void restoreStreams() {
        System.setOut(System.out);
        System.setIn(System.in);
    }

    protected void runTestReturningSingleFloat(String input, float expected) {
        float actual = runForFloat(Task::main, input);

        assertEquals(expected, actual, FLOAT_TESTS_DELTA);
    }

    private float runForFloat(Consumer<String[]> method, String input) {
        return Float.parseFloat(run(method, input));
    }

    private String run(Consumer<String[]> method, String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        method.accept(new String[]{});
        return outContent.toString().trim();
    }
}
