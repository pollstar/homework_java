package practice9;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import practice.practice9.Car;
import practice.practice9.CarFactory;
import practice.practice9.Person;
import practice.practice9.PersonFactory;

class CarFactoryTest {
    private CarFactory target;
    private PersonFactory personFactory;
    public Person person;

    @BeforeEach
    void setUp() {
        target = new CarFactory();
        personFactory = Mockito.mock(PersonFactory.class);
        person = new Person(20, "Person");
        Mockito.when(personFactory.createPerson()).thenReturn(person);
    }

    @Test
    void createCar_allFine() {
        final Car car = target.createCar(2, 1,
                "Black", personFactory);
        Assertions.assertNotNull(car);
        Assertions.assertEquals("Black", car.getColor());
        Assertions.assertEquals(1, car.getVersion());
        Assertions.assertEquals(2, car.getPersons().length);
    }

    @Test
    void createCar_CreateNull() {
        final Car car1 = target.createCar(2, 0,
                "Black", personFactory);
        Assertions.assertNull(car1);

        final Car car2 = target.createCar(2, -1,
                "Black", personFactory);
        Assertions.assertNull(car2);
    }

    @Test
    void createCar_moreThen4() {
        final Car car = target.createCar(10, 1,
                "Black", personFactory);
        Assertions.assertEquals(4, car.getPersons().length);
    }

    @Test
    void createCar_lessThen0() {
        final Car car = target.createCar(-2, 1,
                "Black", personFactory);
        Assertions.assertEquals(0, car.getPersons().length);
    }

    @Test
    void createCar_checkPersonInfo() {
        final Car car = target.createCar(1,1,
                "Black", personFactory);
        Assertions.assertEquals(1, car.getPersons().length);
        Assertions.assertEquals(20, person.getAge());
        Assertions.assertEquals("Person", person.getName());
    }
}