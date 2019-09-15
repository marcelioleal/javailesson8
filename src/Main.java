import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Robot robotBot = new Robot("Bot", "blue", "black", 8 );
        Robot robotRob = new Robot("Rob", "Yellow", "green", 10 );
        Robot tedRobot = new Robot("Renato", "brown");
        Robot renatoRobot = new Robot();
        Robot robotBlue = new Robot("Blue");
        Robot robotYellow = new Robot("Yellow", "Green");

        Robot[] robots = new Robot[]{robotBlue, robotBot, robotRob, tedRobot, renatoRobot, robotYellow};

        // only yellow ones introduce themselves!
        for (Robot r : robots) {
            if ("yellow".equalsIgnoreCase(r.color)) {
                r.introduce();
            }
        }

        robotRob.introduce();
        robotBot.introduce();
        renatoRobot.introduce();
        tedRobot.introduce();

        Robot weirdRobot = new Robot("Brown", "Renato");

         Color robotColor = Color.BLUE;
         System.out.println(robotColor);


         
    }
}
