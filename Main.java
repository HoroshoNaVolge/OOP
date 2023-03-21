import java.util.ArrayList;

import animals.Snake;
import animals.Wolf;
import cages.SnakeCage;
import cages.WolfCage;
import factory.SnakeFactory;
import factory.WolfFactory;
import terminal.TerminalReader;
import terminal.parsers.ZooCommandParser;
import zoo.Zoo;

public class Main {
    public static void main(String[] args) {

        ArrayList<Wolf> wolves = new WolfFactory().createAnimals(4);
        WolfCage wCage = new WolfCage();
        wCage.setWolves(wolves);
        wCage.setGarbageWeight(1000);
        wCage.setFoodWeight(15000);

        ArrayList<Snake> snakes = new SnakeFactory().createAnimals(4);
        SnakeCage sCage = new SnakeCage();
        sCage.setSnakes(snakes);
        sCage.setGarbageWeight(300);
        sCage.setFoodWeight(500);

        Zoo zoo = new Zoo(wCage, sCage);
        TerminalReader tr = TerminalReader.getTerminalReader(new ZooCommandParser());
        tr.setZoo(zoo);
        tr.go();
    }
}
