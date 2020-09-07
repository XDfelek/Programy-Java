import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class BaseTest {

    private static Locale systemLocale;
    private static final float FLOAT_TESTS_DELTA = 0.1f;

    @BeforeClass
    public static void beforeClass() {
        systemLocale = Locale.getDefault();
        Locale.setDefault(new Locale("en-US"));
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

    protected void runTestForFloats(String input, float... expected) {
        List<Float> actual = runForFloats(Task::main, input);

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual.get(i), FLOAT_TESTS_DELTA);
        }
    }

    private String run(Consumer<String[]> method, String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        method.accept(new String[]{});
        return outContent.toString().trim();
    }

    private List<Float> runForFloats(Consumer<String[]> method, String input) {
        String output = run(method, input);
        return Arrays
                .stream(output.split("\n"))
                .map(s -> s.split(" "))
                .flatMap(Stream::of)
                .map(f -> Float.parseFloat(f))
                .collect(Collectors.toList());
    }

}
