public class Robot {

    int weight;
    String name;
    String color;
    String eyesColor;


    Robot () {
        this.name = "Berlin";
        this.color = "yellow";
    }

    Robot(String name, String color, String eyesColor, int weight){
                                                                                                                                                    // this(name, eyesColor);
        this.name = name;
        this.eyesColor = eyesColor;
        this.color = color;
        this.weight = weight;
    }

    Robot(String name){
        this.name = name;
    }

    Robot(String name, String eyesColor){
        this.name = name;
        this.eyesColor = eyesColor;
    }

    void introduce() {

        System.out.println("Hello! My name is " + this.name + ", I am " + this.color + ", I have "
                + this.eyesColor + " eyes and I weight " + this.weight + " kilograms");

    }

}

