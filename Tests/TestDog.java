import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestDog{

    Dog dog = new Dog();
    String temp;

    @Test
    public void testDogMakeNoise(){
        temp = dog.makeSound();
        temp = "Bark";
    }


    @Test
    public void testDogMove(){
        temp = dog.move();
        temp = "I am running!";
    }

    @Test
    public void testDogMisbehave(){
        temp = dog.misbehave("homework");
        temp = "I chewed up your homework";
    }
}
