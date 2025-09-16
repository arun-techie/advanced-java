class student1 implements Runnable{
    public void run(){
        for (int i=0;i<=5;i++){
            System.out.println("hi");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class student2 implements Runnable{
    public void run(){
        for (int i=0;i<=5;i++){
            System.out.println("hello");
            try {
                Thread.sleep(4);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
//Threads allows a program to operate more efficiently by doing multiple things at the same time.
//Threads can be used to perform complicated tasks in the background without interrupting the main program.
public class threadPractice {
    public static void main(String[] args) {
        Runnable obj=new student1();
        Runnable obj1=new student2();
        Thread tr=new Thread(obj);
        Thread tr2=new Thread(obj1);
        tr.start();
        tr2.start();
    }
}
