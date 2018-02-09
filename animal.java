public class animal {
    int age;
    String gender;
    int weightinlbs;

    public animal(int age,String gender, int weightinlbs) {
        this.age = age;
        this.gender=gender;
        this.weightinlbs=weightinlbs;
    }
       public void eat(){
           System.out.println("Eating...");
        }
        public void sleep(){
            System.out.println("Sleeping...");
        }
}
