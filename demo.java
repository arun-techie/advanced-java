import java.util.Scanner;
enum fruit{
    apple(120),banana(110),grapes(80);

    private int prize;
    private fruit(int prize){
        this.prize=prize;
    }

    public int getPrize() {
        return prize;
    }
}
//enum constructor enough above
interface typefruit{
    public void taste();
}
//inner class
class muruganantham{
    class arun{
        String name="arun";
        public void arun(){
            System.out.println(name+" is a software developer");
        }
    }
}
public class demo {
    public static void main(String[] args) {
        fruit var=fruit.apple;
        System.out.println("fruit name:"+var+" prize: "+var.getPrize());
        typefruit appletast=()-> {
            System.out.println("it is sweet taste");
        };
        appletast.taste();
        typefruit banana = ()->{
            System.out.println("it tastes sweet and look yellow");
        };
        fruit var1=fruit.banana;
        System.out.println("fruit name:"+var1+" prize: "+var1.getPrize());

        int a=12;
        int b=2;
        try{

            if(b==2) {
                b++;
                System.out.println(a / b);
            }
            else {
                throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            System.out.println("runtime exception");
        }
        muruganantham obj = new muruganantham();
        muruganantham.arun obj2=obj.new arun();
        obj2.arun();
        int c;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the value of c");
        System.out.println(input.nextInt());
    }
}
