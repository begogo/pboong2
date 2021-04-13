import java.io.IOException;

public class Pause {

    static void run() {
        try {
            System.in.read();
        } catch (IOException e) { }
    }

}
