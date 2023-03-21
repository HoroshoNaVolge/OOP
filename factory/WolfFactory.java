package factory;

import java.util.ArrayList;
import java.util.Random;

import animals.Wolf;

public class WolfFactory implements IAnimalFactory {
    static Random random = new Random();

    public static ArrayList<Wolf> createWolves(int wolfsQuantity) {
        ArrayList<Wolf> wolvesList = new ArrayList<>();
        for (int i = 0; i < wolfsQuantity; i++) {

            Wolf wolf = new Wolf("w" + i, random.nextInt(2015, 2023), random.nextInt(10, 55), 4,
                    random.nextInt(11, 22));
            wolvesList.add(wolf);
        }
        return wolvesList;
    }
}
