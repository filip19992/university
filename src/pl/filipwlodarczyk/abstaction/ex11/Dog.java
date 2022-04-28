package pl.filipwlodarczyk.abstaction.ex11;

public class Dog extends Pet{

    public Dog(String name, float age) {
        super(name, age);

    }

    @Override
    public void speak() {
        System.out.println("How how!");
    }


    @Override
    public void setAge(float age) {
        super.setAge(age);
    }

    @Override
    public float getAge() {
        return super.getAge();
    }
}
