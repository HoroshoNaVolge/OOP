import java.util.ArrayList;

import animals.Animal;
import animals.Wolf;
import cages.AnimalCage;
import cages.WolfCage;

public class Main {
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf("Jimmy", 2005, 20, 4, 1);
        Wolf wolf2 = new Wolf("Jack", 2005, 20, 4, 1);
        Wolf wolf3 = new Wolf("Rick", 2005, 20, 4, 1);
        // Фабрику уже надо юзать? Или пока так сойдет

        AnimalCage cage = new WolfCage();

        cage.addAnimal(wolf1);
        cage.addAnimal(wolf2);
        cage.addAnimal(wolf3);

        System.out.println("Создана клетка " + cage.getClass().getSimpleName().toString() + " для " + cage.countAnimals() + " животных");
        System.out.println("\nРандомное животное из клетки: " + cage.takeOffAnimal().toString());
    }
}
