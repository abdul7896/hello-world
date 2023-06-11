import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    @Test
    public void testPrintHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        String actual = helloWorld.getMessage();
        String expected = "Hello World!";
                        
         if (expected.equals(actual)) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }
    }
}
