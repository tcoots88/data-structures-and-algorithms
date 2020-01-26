package code401challenges.Utilities;

public class Dog extends Animal {
    private String name;
    private String color;


    public Dog(String name, String color){
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
