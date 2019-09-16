import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Robot robotBot = new Robot("Bot", "blue", "black", 8 );
        Robot robotRob = new Robot("Rob", "Yellow", "green", 10 );
        Robot renatoRobot = new Robot();
        Robot robotBlue = new Robot("Blue");

        Robot[] robots = new Robot[]{robotBlue, robotBot, robotRob, renatoRobot};

        // only yellow ones introduce themselves!
        for (Robot r : robots) {
            if ("yellow".equalsIgnoreCase(r.color)) {
                r.introduce();
            }
        }

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
        // Change the introduction and add the ability of the robot
        // Change the accessibily of attributes to private
        // See what happen
        // Change to protected
        // See what happen
        // Change to Public
        // See what happen
        // Add a new method to Yellow Robot with a name - Calculate
        // This method must get two int and return the sum of values


        // Exercise 3
        // Create a new Robot - RedRobot
        // Its color is always Red
        // Create a method to introduce and explaining that is a Red Robot
        // Create a method to calculate, two integer as parameters
        // returns the diff between two numbers (Subtraction)


        // Exercise 4
        // Create a new Robot - GreenRobot
        // Its color is always Green
        // Create a method to calculate and multipling two integers

        //Exercise 5
        // Implement an method on Robot - calculate (Integer, Integer) returning null


        //
         
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