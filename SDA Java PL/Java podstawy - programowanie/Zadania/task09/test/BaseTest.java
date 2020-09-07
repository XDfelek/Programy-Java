import org.junit.After;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.function.Consumer;

import static org.junit.Assert.assertEquals;

public class BaseTest {

    @After
    public void restoreStreams() {
        System.setOut(System.out);
        System.setIn(System.in);
    }

    protected void runTest(String input, String expected) {
        String actual = run(Task::main, input);

        assertEquals("Zly wynik dla ponizszych danych: \n" + input + "\n", expected, actual);
    }

    private String run(Consumer<String[]> method, String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        method.accept(new String[]{});
        return outContent.toString()
                .replaceAll("\\s+$", "")            // drop trailing (trim, but only from end)
                .replaceAll("\r\n", "\n");
    }
}
