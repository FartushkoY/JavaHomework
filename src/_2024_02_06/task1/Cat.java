package _2024_02_06.task1;

public class Cat extends Animal {

    private boolean isEgoist;

    public Cat(String food, String location, boolean isEgoist) {
        super(food, location);
        this.isEgoist = isEgoist;
    }

    @Override
    public void makeNoise() {
        if (isEgoist) {
            System.out.println("Cat meows");
        } else {
            System.out.println("Cat purrs");
        }
    }

    @Override
    public void eat() {
        System.out.println("Cat eats " + getFood());
    }

    public boolean getIsEgoist() {
        return isEgoist;
    }
}
