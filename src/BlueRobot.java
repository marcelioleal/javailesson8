public class BlueRobot extends Robot{

    BlueRobot(String name, String eyesColor, int weight) {
        super(name , eyesColor, weight);
        this.changeColor("Blue");
    }

    void introduce() {
        System.out.println("I am a Blue Robot! I know how to multiply.");
        super.introduce();
    }

    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }

    public Integer calculate(Integer a, Integer b) {
        return this.multiply(a, b);
    }
}
