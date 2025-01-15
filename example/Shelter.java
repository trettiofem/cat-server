public class Shelter {
    public static void main(String[] args) {
        Animal fish = new Fish();
        Animal dog = new Dog();
        
        System.out.println(fish.noise());
        System.out.println(dog.noise());

        dog.hello();
        dog.hello(1);
    }
}
