package zoo;

import animals.Snake;
import animals.Wolf;
import cages.AnimalCage;

public class Zoo {
    private AnimalCage<Wolf> wolfCage;
    private AnimalCage<Snake> snakeCage;

    public Zoo(AnimalCage<Wolf> wolfCage, AnimalCage<Snake> snakeCage) {
        this.wolfCage = wolfCage;
        this.snakeCage = snakeCage;
    }

    public Wolf takeOffWolf() {
        return this.wolfCage == null ? null : this.wolfCage.takeOffAnimal();
    }

    public Snake takeOffSnake() {
        return this.snakeCage == null ? null : this.snakeCage.takeOffAnimal();
    }

    public int addWolf(Wolf animal) {
        return this.wolfCage == null ? 0 : this.wolfCage.addAnimal(animal);
    }

    public int addSnake(Snake animal) {
        return this.snakeCage == null ? 0 : this.snakeCage.addAnimal(animal);
    }

    public AnimalCage<Wolf> getWolfCage() {
        return wolfCage;
    }

    public void setWolfCage(AnimalCage<Wolf> wolfCage) {
        this.wolfCage = wolfCage;
    }

    public AnimalCage<Snake> getSnakeCage() {
        return snakeCage;
    }

    public void setSnakeCage(AnimalCage<Snake> snakeCage) {
        this.snakeCage = snakeCage;
    }

    public String Summary() {
        int wolfQuantity = 0;
        int snakeQuantity = 0;

        if (wolfCage != null) {
            wolfQuantity = wolfCage.countAnimals();
        }
        if (snakeCage != null) {
            snakeQuantity = snakeCage.countAnimals();
        }
        return "Сейчас в зоопарке\n" +
                "wolves = " + wolfQuantity +
                "\nsnakes = " + snakeQuantity + "\n";
    }
}