package _2024_02_06.task1;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Cat("cats food", "Berlin", true);
        Animal animal2 = new Dog("dogs food", "Dortmund", false);
        Animal animal3 = new Cat("wiskas", "Frankfurt", false);

        Animal[] animals = {animal1, animal2, animal3};
        Vet vet = new Vet();

        for (int i = 0; i < animals.length; i++) {
            vet.treatAnimal(animals[i]);
            animals[i].makeNoise();
        }
    }
}
