public class Dog extends Animal {
    public Dog() {
        foo();
    }

    @Override
    public String noise() {
        return "woof";
    }

    private void foo() {

    }
}
