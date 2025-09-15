import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class bufferReaderandScanner {
    public static void main(String[] args) throws IOException {
        System.out.println("enter a number");
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader obj=new BufferedReader(in);
        int num=Integer.parseInt(obj.readLine());
        System.out.println(num);
        //scanner
        Scanner input=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a= input.nextInt();
        System.out.println(a);
    }
}
