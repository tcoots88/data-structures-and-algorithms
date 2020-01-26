package code401challenges.UtilitiesTest;

import code401challenges.Utilities.Animal;
import code401challenges.Utilities.AnimalShelter;
import code401challenges.Utilities.Cat;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalShelterTest {


    @Test (expected = IllegalArgumentException.class)
    public void testEnqueueForAnimal() {
        AnimalShelter animalShelter = new AnimalShelter();
        Animal testAnimal = new Animal();
        animalShelter.enqueue(testAnimal);
    }

    @Test
    public void testEnqueueCat(){
        AnimalShelter animalShelter = new AnimalShelter();
        Cat testCat = new Cat("CattyMcCatFace", "pink");
        animalShelter.enqueue(testCat);
        assertEquals("test", testCat);
    }
}
