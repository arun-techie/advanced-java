class school{
    String schoolName="st.bastin";
    static class Classes{
        public void class1(){
            System.out.println("12 students");
            System.out.println("staff: ayyapan");
        }
        public void class2(){
            System.out.println("23 students");
            System.out.println("staff: john");
        }
    }
}
public class innerclass {
    public static void main(String[] args) {
        school obj = new school();
        school.Classes obj2 = new school.Classes();
        System.out.println(obj.schoolName);
        obj2.class1();
        obj2.class2();
    }
}
