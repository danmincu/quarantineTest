import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FooServiceTests {

    @Test
    public void testFooMethod() {
        FooService subject = new FooService(); // MyClass is tested

        // assert statements
        assertEquals(11, subject.addFoos(10, 1));
    }

    @Test
    public void testFooFooMethod() {
        FooService subject = new FooService(); // MyClass is tested

        // assert statements
        assertEquals(30, subject.addFooFoos(1, 2));
    }

    @Test
    public void testFooIntermMethod{
        FooService subject = new FooService(); // MyClass is tested

        // assert statements
        assertEquals(30, subject.addFooFoos(1, 2));
    }

}