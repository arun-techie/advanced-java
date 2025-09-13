@FunctionalInterface
interface rA{
    int add(int a,int b);
}

public class returnLambda {
    public static void main(String[] args) {
        rA obj= (int a, int b)-> {
                return a+b;
    };

//        obj.add(23,12);
        System.out.println(obj.add(23,12));
    }
}
