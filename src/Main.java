import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Robot robotBot = new Robot("Bot", "blue", "black", 8 );
        Robot robotRob = new Robot("Rob", "Yellow", "green", 10 );
        Robot renatoRobot = new Robot();
        Robot robotBlue = new Robot("Blue");
        //robotBlue.color = "brown";

        Robot[] robots = new Robot[]{robotBlue, robotBot, robotRob, renatoRobot};

        // only yellow ones introduce themselves!
//        for (Robot r : robots) {
//            if ("yellow".equalsIgnoreCase(r.color)) {
//                r.introduce();
//            }
//        }

        robotRob.introduce();
        robotBot.introduce();
        renatoRobot.introduce();

//         Color robotColor = Color.BLUE;
//         System.out.println(robotColor);

        // Exercise 1
        // 1.1 - Create a new constructor in Robot Class with String name, String eyesColor, int weight as parameters
        // 1.2 - Create a new Class called YellowRobot that:
        // 1.2.1 - is a subclass of Robot (extends Robot)
        // 1.2.1 - Have the color equals to Yellow
        // 1.2.3 - Have a new behaviour/method that sums 2 Integers returning an Integer
        // 1.2.4 - Use this class in main, calls introduce, calls sum method and print the result

        YellowRobot newYellow = new YellowRobot("Marcelio", "green", 800 );
        newYellow.introduce();
        Integer sum = newYellow.sum(1000,1922);
        System.out.println(sum);

        // Exercise 2
        // 1.1 - Let's create another subclass of Robot called BlueRobot
        // 1.2 - The BlueRobots must be always Blue
        // 1.3 - Have a new behaviour/method that multiply 2 Integers returning an Integer
        // 1.4 - We need to change the accessibility of the color property, it must be only changed inside the super class.
        // 1.4.1 - Create a method in Robot called changeColor, to enable to change color in the sub classes. (change the constructor in subclasses)
        // 1.5 - Now the method introduce for BlueRobots should return the following output:
        // "Hey, I am a BlueRobot! I know how to multiply integers." +
        // "Hello! My name is (name), I am (color), I have (eyes color) and I weight (weight) kilograms"
        // 1.6 - Use this class in main, calls introduce, calls multiply method and print the result

        BlueRobot newBlue = new BlueRobot("Maria", "yellow", 70 );
        newBlue.introduce();
        Integer mulRes = newBlue.multiply(8,10);
        System.out.println(mulRes);
        //newBlue.color = "brown";


        // Exercise 3 - Overriding, hierarquical inheritance
        // 1.1 - Let's create another class called PurpleRobot, but now, the superclass is BlueRobot
        // 1.2 - The PurpleRobots must be always Purple
        // 1.3 - Have a new behaviour/method that calculate a number raise to the power of 2. (Give the name Pow) - Integer as parameter and return.
        // 1.4 - Try to reuse the method multiply from BlueRobot.
        // 1.5 - Now the method introduce for PurpleRobots should return the following output:
        // "Hey, I am a PurpleRobot! My parent class is BlueRobot."
        // "Hello! My name is (name), I am (color), I have (eyes color) and I weight (weight) kilograms"
        // 1.6 - Use this class in main, calls introduce, calls pow method and print the result


        // Exercise 4 - Polymorphism

        // 1.6 - Let's create a method called calculate in all Robots (Robot, BlueRobot, YellowRobot, and PurpleRobot
        // Create an Array with the three objects and call caculate and introduce for all of them

    }
}


class Shape {
    Point coordinates;
    Color color;

    Shape(Point coordinates, Color color) {
        this.coordinates = coordinates;
        this.color = color;
    }

    public void draw() {
        //TBD
    }
}

class Line extends Shape {
    Integer length;

    Line(Point coordinates, Color color, Integer length) {
        super(coordinates, color);
        this.length = length;
    }

    public void draw() {
        //TBD
    }
}