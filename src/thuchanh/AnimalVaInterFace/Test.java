package thuchanh.AnimalVaInterFace;

public class Test {
    public static void main(String[] args) {
        animal[] animals = new animal[2];
        animals[0] = new Tiger();
        animals[1] = new chicken();
        for (animal animal : animals) {
            animal.MakeSound();
            System.out.println(animal.MakeSound());
            if (animal instanceof chicken) {

            }

        }

    }
}
