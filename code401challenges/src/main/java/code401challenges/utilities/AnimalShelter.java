package code401challenges.utilities;

import code401challenges.stacksandqueues.Queue;

import java.util.Collection;
import java.util.Iterator;
public class AnimalShelter {

    Queue catQueue;
    Queue dogQueue;


    public void enqueue(Animal animal) {
        if (animal.getClass().getName().endsWith("Cat")) {
            catQueue.enqueue((Cat) animal);
        } else if (animal.getClass().getName().endsWith("Dog")) {
            dogQueue.enqueue((Dog) animal);
        } else throw new IllegalArgumentException("Not a dog or cat");
    }

    public Animal dequeue(String catOrDog){
        if(catOrDog.toUpperCase() != "DOG" && catOrDog.toUpperCase() != "CAT")
            return null;
        else if (catOrDog.toUpperCase().equals("DOG")){
            return dogQueue.dequeue();
        } else {
            return catQueue.dequeue();
        }
    }
}
