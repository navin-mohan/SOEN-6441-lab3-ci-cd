import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    HelloWorld hw = null;

    @BeforeEach
    void init() {
        hw = new HelloWorld();
        System.out.printf("creating hw\n");
    }

    @AfterEach
    void tearDown() {
        hw = null;
        System.out.printf("destroying hw\n");
    }

    @Test
    void testSayHello() {
        String result = hw.sayHello("World");
        assertEquals("Hello, World!", result);
        assertEquals(1, hw.getCount());
    }

    @RepeatedTest(5)
    @DisplayName("This is a repeated test.")
    void testSayHelloRepeat() {
        String result = hw.sayHello("World");
        assertEquals("Hello, World!", result);
        assertEquals(1, hw.getCount());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Alice", "Bob", "Carol"})
    void testSayHello(String name) {
        String result = hw.sayHello(name);
        assertEquals("Hello, " + name + "!", result);
        assertEquals(1, hw.getCount());
    }

    @Test
    void testSayHello1() {
        String[] names = {"Alice", "Bob", "Carol"};
        for (String name : names) {
            String result = hw.sayHello(name);
            assertEquals("Hello, " + name + "!", result);
        }
        assertEquals(3, hw.getCount());

    }



    @Test
    void testAdd() {
        int result = hw.add(1, 2);
        assertEquals(3, result);
    }

    @Test
    void testGetA() {
        hw.sayHello("test");
        System.out.println("GetA");
    }

    @Test
    void testGetCount() {
        System.out.println("GetC");
        assertEquals(0, hw.getCount());
        hw.sayHello("World");
        assertEquals(1, hw.getCount());
    }

    @TestFactory
    Collection<DynamicTest> testHelloWorld() {
        String[] names = {"Alice", "Bob", "Carol"};
        Collection<DynamicTest> tests = new ArrayList<>();

        for (String name : names) {
            tests.add(DynamicTest.dynamicTest("Test sayHello to " + name, () -> {
                String result = hw.sayHello(name);
                assertEquals("Hello, " + name + "!", result);
            }));
        }

        return tests;
    }

}
