package terminal.executable.create;

import animals.Snake;
import terminal.Command;
import terminal.executable.CommandExecutable;
import zoo.Zoo;

import java.util.ArrayList;

public class CreateSnakeExecutable implements CommandExecutable {

    private Zoo zoo;
    private Snake snake;

    public CreateSnakeExecutable(){};

    public CreateSnakeExecutable(Zoo zoo, Command command) {
        ArrayList<String> input = command.getParameters();
        this.zoo = zoo;
        this.snake = new Snake(input.get(0), Integer.parseInt(input.get(1)), Integer.parseInt(input.get(2)), 0,
                Integer.parseInt(input.get(3)));
    }


    public CreateSnakeExecutable getZoo(Zoo zoo, Command command) {
        return new CreateSnakeExecutable(zoo, command);
    }

    @Override
    public void execute() {
        this.zoo.addSnake(snake);
    }
}