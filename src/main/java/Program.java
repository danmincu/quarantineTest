public class Program {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World! and quaratined tests...");
        FooService service = new FooService();
        System.out.println("Foo 1 + 2 = " + service.addFoos(1,2));
        System.out.println("FooFoo 1 + 2 = " + service.addFooFoos(1,2));
    }

}
