package code401challenges.utilities;

public class Cat extends Animal {
    private String name;
    private String color;


    public Cat (String name, String color) {
        this.name = name;
        this.color = color;
    }


    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }
}
