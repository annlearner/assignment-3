public class Earth {
    public static void main(String args[]) {

        Human tom;
        tom=new Human();


        tom.Age=6;
        tom.eyeColor = "blue";
        tom.heightInInches = 60;
        tom.name="Tom Kirb";
        tom.speak();
        tom.walk();



        Human Joe;
        Joe = new Human();

        Joe.age = 10;
        Joe.heightInInches = 80;
        Joe.eyeColor = "Hazel Green";
        Joe.name = "Joey Tribbiani";
        Joe.speak();


    }
}
