package sg.edu.nus.iss;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        // ConcurrentHashMap chme = new ConcurrentHashMap();
        // chme.example();

        //LinkedListExample lle = new LinkedListExample();
        //lle.example();

        StackExample se = new StackExample();
        StackExample.example(); 

    }
}
