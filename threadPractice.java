class student1 extends Thread{
    public void run(){
        for (int i=0;i<=100;i++){
            System.out.println("1");
        }
    }
}
class student2 extends Thread{
    public void run(){
        for (int i=0;i<=100;i++){
            System.out.println("2");
        }
    }
}
//Threads allows a program to operate more efficiently by doing multiple things at the same time.
//Threads can be used to perform complicated tasks in the background without interrupting the main program.
public class threadPractice {
    public static void main(String[] args) {
        student1 obj=new student1();
        student2 obj1=new student2();
        obj.start();
        obj1.start();
    }
}
