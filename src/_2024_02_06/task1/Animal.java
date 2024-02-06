package _2024_02_06.task1;

public class Animal {
    private String food;
    private String location;

    public Animal(String food, String location){
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Animal makes noise");
    }

    public void eat() {
        System.out.println("Animal eats " + food);
    }

    public void sleep (){
        System.out.println("Animal sleeps");
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }
}
