public class PurpleRobot extends BlueRobot {

    PurpleRobot(String name, String eyesColor, int weight) {
        super(name , eyesColor, weight);
        this.changeColor("Purple");
    }

    void introduce() {
        System.out.println("I am a Purple Robot! My parent class is BlueRobot.");
        super.introduce();
    }

    public Integer pow(Integer a) {
        return super.multiply(a, a);
    }
}
