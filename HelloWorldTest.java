public class HelloWorldTest {

    @Test
    public void testPrintHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        String expected = "Hello World";
        String actual = helloWorld.printHelloWorld();
        assertEquals(expected, actual);
    }
}
