public class YellowRobot extends Robot{

    YellowRobot(String name, String eyesColor, int weight){
        super(name, eyesColor, weight);
        this.color = "Yellow";
    }

    public Integer sum(Integer a, Integer b) {
        return a + b;
    }
}
