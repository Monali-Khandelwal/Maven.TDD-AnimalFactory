package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {


    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testGetNumberOfCat() {

        String name = "Milo";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();
        CatHouse.add(animal);

        // Then
        CatHouse.getNumberOfCats();
    }
    @Test
    public void addTest(){
        CatHouse.clear();
        Cat animal = AnimalFactory.createCat(null,null);
        CatHouse.add(animal);
        int expected = 1;
        int actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected,actual);

    }
    @Test
    public void removeByIdTest(){

        Cat cat = new Cat(null, null,0);
        CatHouse.add(cat);
        CatHouse.remove(cat.getId());
        int expected = 0;
        int actual = cat.getId();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void removeTest(){
        // Given
        String name = "Kitty";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);
        CatHouse.remove(animal);

        // Then
        int actualNumberCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(0, actualNumberCats);
    }
    @Test
    public void getDogByIdTest(){
        Cat cat = new Cat(null,null,0);
        CatHouse.add(cat);
        int expected = 0;
        int actual = cat.getId();
        Assert.assertEquals(expected,actual);
        Assert.assertEquals(expected,actual);
    }


}
