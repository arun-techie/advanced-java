public class exceptionHandling {
    //types of error: compile time error, Runtime error, logical error
    public static void main(String[] args) {
        //exception handling is for avoid runtime error
        //exception handling using try catch
        int i=2;
        int[] nums = new int[5];
        nums[4]=12;
        try {
            int j = 18 / i;
            System.out.println(j);
            System.out.println(nums[4]);
            System.out.println(nums[4]+j);
        } catch (ArithmeticException e) {
            System.out.println("something went wrong");
        }
        //multiple catch
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("be with ur limit");
        }
        System.out.println("bye...");
    }
}
