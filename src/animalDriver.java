public class animalDriver {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
        dog.move();
        Animal bird = new Bird();
        bird.makeSound();
        bird.move();

        Dog dog2 = new Dog();
        String homework = dog2.misbehave("homework");
        System.out.println(homework);
    }

}
