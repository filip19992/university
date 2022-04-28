package pl.filipwlodarczyk.abstaction.ex11;

public class Cat extends Pet{




    public Cat(String name, float age) {
        super(name, age);
    }

    @Override
    void speak() {
        System.out.println("Miau miau!");
    }

    @Override
    float getAge() {
        return super.getAge();
    }
}
