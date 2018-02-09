public class sparrow extends bird implements flyable{
    public sparrow(int age, String gender, int weightinlbs) {
        super(age, gender, weightinlbs);
    }
    public void fly(){
        System.out.println("Sparrow flying high...");
    }
}
