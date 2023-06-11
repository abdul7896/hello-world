import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    @Test
    public void testPrintHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        String actual = helloWorld.getMessage();
        assertEquals("Hello World!", output);
    }
}
