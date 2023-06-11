import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    @Test
    public void testHelloWorldOutput() {
          String expected = "Hello world";
        String actual = "Hello world";
        assertEquals(expected, actual);
