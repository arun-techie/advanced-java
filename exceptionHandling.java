public class exceptionHandling {
    //types of error: compile time error, Runtime error, logical error
    public static void main(String[] args) {
        //exception handling is for avoid runtime error
        //exception handling using try catch
        int i=0;
        try {
            int j = 18 / i;
            System.out.println(j);
        } catch (Exception e) {
            System.out.println("something went wrong");
        }
        System.out.println("bye...");
    }
}
