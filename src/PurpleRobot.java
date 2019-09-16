public class PurpleRobot extends BlueRobot {

    PurpleRobot(String name, String eyesColor, int weight) {
        super(name , eyesColor, weight);
        this.changeColor("Purple");
    }

    void introduce() {
        System.out.println("I am a Purple Robot! My parent class is BlueRobot.");
        super.introduce();
    }

    //only pow ^ 2
    public Integer pow(Integer a) {
        return super.multiply(a, a);
    }

    public Integer pow(Integer a, Integer b) {
        return (int) Math.pow(a, b);
    }

    public Integer calculate(Integer a, Integer b) {
        return this.pow(a, b);
    }
}
