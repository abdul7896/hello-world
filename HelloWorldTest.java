public class HelloWorldTest {

    @Test
    public void testPrintHelloWorld() {
        HelloWorld.main(new String[0];
                        
        String expected = "Hello world!";
        String actual = getConsoleOutput();
                        
         if (expected.equals(actual)) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }
    }
}
