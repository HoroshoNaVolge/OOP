import java.util.ArrayList;

import animals.Animal;
import animals.Wolf;
import cages.AnimalCage;
import cages.WolfCage;

public class Main {
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf("Jimmy", 2005, 21, 4, 1);
        Wolf wolf2 = new Wolf("Jack", 2008, 18, 4, 1);
        Wolf wolf3 = new Wolf("Rick", 2001, 20, 4, 1);
        Wolf wolf4 = new Wolf("Sarah", 2022, 10, 4, 1);
        // Фабрику уже надо юзать? Или пока так сойдет

        AnimalCage cage = new WolfCage();

        cage.addAnimal(wolf1);
        cage.addAnimal(wolf2);
        cage.addAnimal(wolf3);
        cage.addAnimal(wolf4);

        System.out.println("\nСоздана клетка " + cage.getClass().getSimpleName() + " для "
                + cage.countAnimals() + " животных.");
        cage.displayAnimals();

        System.out.println("\nВыполняем сортировку по возрасту по возрастанию");
        cage.ageSortAnimals(true);
        cage.displayAnimals();

        System.out.println("\nВыполняем сортировку по возрасту по убыванию");
        cage.ageSortAnimals(false);
        cage.displayAnimals();

        System.out.println("\nВыполняем сортировку по весу по возрастанию");
        cage.weightSortAnimals(true);
        cage.displayAnimals();

        System.out.println("\nВыполняем сортировку по весу по убыванию");
        cage.weightSortAnimals(false);
        cage.displayAnimals();
    }
}
