class grandpa{
    public void from(){
        System.out.println("chennai");
    }
}
class father extends grandpa{
   @Override
    public void from(){
       System.out.println("siruseri");
    }
}
public class Annotation {
    public static void main(String[] args) {
        father obj2=new father();
        obj2.from();
        grandpa obj1=new grandpa();
        obj1.from();
    }
}
