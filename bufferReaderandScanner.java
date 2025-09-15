import java.io.IOException;

public class bufferReaderandScanner {
    public static void main(String[] args) {
        System.out.println("enter the vlaue of a");
        try {
            int a = System.in.read();
            System.out.println(a);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
