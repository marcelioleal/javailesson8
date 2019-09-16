public class YellowRobot extends Robot{

    YellowRobot(String name, String eyesColor, int weight) {
        super(name , eyesColor, weight);
        this.changeColor("Yellow");
    }

    void introduce() {
        System.out.println("I am a Yellow Robot - I am always Yellow");
        super.introduce();
    }

    public Integer sum(Integer a, Integer b) {
        return a + b;
    }

    public Integer calculate(Integer a, Integer b) {
        return this.sum(a, b);
    }
}
