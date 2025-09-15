import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferReaderandScanner {
    public static void main(String[] args) throws IOException {
        System.out.println("enter a number");
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader obj=new BufferedReader(in);
        int num=Integer.parseInt(obj.readLine());
        System.out.println(num);

    }
}
