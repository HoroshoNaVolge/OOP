package terminal.executable;

import terminal.Command;
import zoo.Zoo;

public interface CommandExecutable {
    
    void execute();

    CommandExecutable getZoo(Zoo zoo, Command command);
}