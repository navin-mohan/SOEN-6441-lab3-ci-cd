/**
 * The type Hello world.
 */
public class HelloWorld {
    int count = 0;
    /**
     * Add int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Say hello string with a name.
     *
     * @param name the name
     * @return the string
     */
    public String sayHello(String name) {
        count++;
        return "Hello, " + name + "!";
    }

    public Runnable createLambda(String name) {
        Runnable r = () -> System.out.println("Hello, " + name + "!");
        return r;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        Runnable r = hw.createLambda("John");
        Runnable q = hw.createLambda("Sam");
        r.run();
        r.run();
        q.run();
        q.run();
    }
}
