enum prize{
    first("car"),second("bike"),third("scooter");
    private String level;
    private prize(String level){
        this.level=level;
    }
    public String getLevel(){
        return level;
    }
}
public class enumConstructor {
    public static void main(String[] args) {
        prize var=prize.second;
        System.out.println(var +" "+var.getLevel());
    }
}
