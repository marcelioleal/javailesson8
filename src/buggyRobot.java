// A FEW BUGS AND BAD PRACTICES. CAN YOU SPOT THEM? :)

public class buggyRobot {

    int w;
    String Name;
    String color;
    String eyesColor;

    buggyRobot(String name, String color, String eyesColor, int w){
        name = name;
        eyesColor = eyesColor;
        color = color;
        w = w;
    }

    void introduce() {

        System.out.println("Hello! My name is " + this.Name + ", I am " + this.color + ", I have "
                + this.eyesColor + " eyes and I weight " + this.w + " kilograms");

    }

}
