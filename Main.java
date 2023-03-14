import java.util.ArrayList;

import animals.Animal;
import animals.Snake;
import cages.AnimalCage;
import cages.SnakeCage;

public class Main {
    public static void main(String[] args) {

        Snake snake1 = new Snake("Jafar", 2020, 1, 0, 1);
        Snake snake2 = new Snake("Yaga", 2021, 1, 0, 2);
        // Фабрику уже надо юзать? Или пока так сойдет

        AnimalCage cage = new SnakeCage();

        cage.addAnimal(snake1);
        cage.addAnimal(snake2);

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
