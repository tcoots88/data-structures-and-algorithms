package code401challenges.Utilities;


import java.util.Queue;


public class AnimalShelter {

    Queue catQueue;
    Queue dogQueue;


    public void enqueue(Animal animal) {
        if (animal.getClass().getName().endsWith("Cat")) {
            catQueue.add((Cat) animal);
        } else if (animal.getClass().getName().endsWith("Dog")) {
            dogQueue.add((Dog) animal);
        } else throw new IllegalArgumentException("Not a dog or cat");
    }

    public Animal dequeue(String catOrDog){
        if(catOrDog.toUpperCase() != "DOG" && catOrDog.toUpperCase() != "CAT")
            return null;
        else if (catOrDog.toUpperCase().equals("DOG")){
            return (Animal) dogQueue.remove();
        } else {
            return (Animal) catQueue.remove();
        }
    }
}
