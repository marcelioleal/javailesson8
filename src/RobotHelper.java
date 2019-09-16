public class RobotHelper {

    private Integer a;
    private Integer b;

    RobotHelper(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    public Integer calculateOperation(Robot r) {
        return r.calculate(this.a, this.b);
    }
}
