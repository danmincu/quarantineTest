import java.util.Random;

public class FooService {

    public int addFoos(int a, int b)
    {
        return a + b;
    }

    public int addFooFoos(int a, int b)
    {
        Random r = new Random();

        //this a random failing test - it should be quarantined
        return a + b ;//+ r.nextInt(2);
    }
}
