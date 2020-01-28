package code401challenges.Utilities;

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
