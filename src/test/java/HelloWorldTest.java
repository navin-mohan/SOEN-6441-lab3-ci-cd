import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {
    @Test
    void testSayHello() {
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.sayHello("World");
        assertEquals("Hello, World!", result);
    }

    @Test
    void testAdd() {
        HelloWorld helloWorld = new HelloWorld();
        int result = helloWorld.add(1, 2);
        assertEquals(3, result);
    }

}
