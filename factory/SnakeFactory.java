package factory;

import java.util.ArrayList;
import java.util.Random;

import animals.Snake;

public class SnakeFactory implements AnimalFactory<Snake> {
    static Random random = new Random();

    @Override
    public ArrayList<Snake> createAnimals(int quantity) {
        ArrayList<Snake> snakeList = new ArrayList<Snake>();
        for (int i = 0; i < quantity; i++) {
            Snake snake = new Snake("w" + i, random.nextInt(2015, 2023), random.nextInt(13, 44), 0, random.nextInt(12, 55));
            snakeList.add(snake);
        }
        return snakeList;
    }

}
