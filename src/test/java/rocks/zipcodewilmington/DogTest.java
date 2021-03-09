package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void constructorTest(){
        String givenName = "paul";
        Date givenBday = new Date();
        Integer givenId  = 0;
        Dog dog = new Dog(givenName,givenBday,givenId);
        String retrievedName = dog.getName();
        Date retrievedDate = dog.getBirthDate();
        Integer retrievedID = dog.getId();
        Assert.assertEquals(givenName,retrievedName);
        Assert.assertEquals(givenBday,retrievedDate);
        Assert.assertEquals(givenId,retrievedID);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void setBirthDate(){
        Dog dog = new Dog(null, null, null);
        Date expBirthDate = new Date();

        dog.setBirthDate(expBirthDate);

        Date actualBirthDate = dog.getBirthDate();
        Assert.assertEquals(actualBirthDate, expBirthDate);
    }

    @Test
    public void speakTest(){
        Dog doggo = new Dog(null, null,null);
        String speak = "bark!";
        doggo.speak();
        String actual = doggo.speak();

        Assert.assertEquals(speak,actual);
    }

    @Test
    public void eatTest(){
        Dog dog = new Dog(null,null,null);
        Food treat = new Food();
        dog.eat(treat);
        int expected = 1;
        int stateTwo = dog.getNumberOfMealsEaten();
        Assert.assertEquals(expected,stateTwo);
    }
    @Test
    public void getID(){
        Dog dog = new Dog(null,null,0);
        int expected = 0;
        int actual = dog.getId();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void inheritanceAnimalTest(){
        Dog dog = new Dog(null,null,null);
        System.out.println(dog instanceof Animal);
    }
    @Test
    public void inheritanceMammalTest(){
        Dog dog = new Dog(null,null,null);
        System.out.println(dog instanceof Mammal);

    }

}
