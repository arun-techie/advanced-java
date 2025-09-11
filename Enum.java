enum Status{
    sunday,monday,friday //objects
}
public class Enum {
    //enum enumeration
    public static void main(String[] args) {
        Status s=Status.friday;
        switch (s){
            case sunday :
                System.out.println("today leave for all");
                break;
            case friday:
                System.out.println("last working in a week");
                break;
            case monday:
                System.out.println("first working day in a week");
                break;
        }
    }
}
