package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void addTest(){
        DogHouse.clear();
        Dog animal = AnimalFactory.createDog(null,null);
        DogHouse.add(animal);
        int expected = 1;
        int actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected,actual);

    }
    @Test
    public void removeByIdTest(){
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        DogHouse.add(animal);

        // When
        DogHouse.remove(animal.getId());

        // Then
        int actualNumberOfDogs = DogHouse.getNumberOfDogs();

        Assert.assertEquals(0, actualNumberOfDogs);
    }

    @Test
    public void removeTest(){
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        DogHouse.add(animal);

        // When
        DogHouse.remove(animal);

        // Then
        int actualNumberOfDogs = DogHouse.getNumberOfDogs();

        Assert.assertEquals(0, actualNumberOfDogs);
    }

    @Test
    public void getDogByIdTest(){
        Dog dog = new Dog(null,null,0);
        DogHouse.add(dog);
        int expected = 0;
        int actual = dog.getId();
        Assert.assertEquals(expected,actual);
    }
}
