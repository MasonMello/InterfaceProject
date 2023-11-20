import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestBird{

    Bird bird = new Bird();
    String temp;

    @Test
    public void testBirdMakeNoise(){
        temp = bird.makeSound();
        temp = "Chirp";
    }


    @Test
    public void testBirdMove(){
        temp = bird.move();
        temp = "I am flying!";
    }

}
