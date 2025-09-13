@FunctionalInterface //annotation functional Interface
interface A{
    void show();
}
class B implements A{
    public void show(){
        System.out.println("is a B class");
    }
}
class c{
    public static int a=102;
}
//SAM-SINGLE ABSTRACT METHOD INTERFACE or FUNCTIONAL INTERFACE
public class functionalInterface {
    //functional interface are have just one method
    public static void main(String[] args) {
        //we can define A class show() like
        A obj=()-> { //"-> is called lambda expression"this is called syntactically sugar where u reduced the code
                System.out.println("is a A class");
            }
        ;
        obj.show();
        B obj1 = new B();
        obj1.show();
        //java is no more verbose
        //showing extra details or explanations about what’s happening inside the program or tool.
        System.out.println(c.a);
        //see how I get a value of "a" because it was static method we access static method
        //into the another static method we don't need to create an object for it
    }
}
