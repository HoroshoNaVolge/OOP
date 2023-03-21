package terminal.executable;

import terminal.Command;
import zoo.Zoo;

public class CommandExecutableFactory {
    private Zoo zoo;

    public CommandExecutableFactory(Zoo zoo) {
        this.zoo = zoo;
    }

    public CommandExecutable create(Command cmd) {
        CommandTypes ct = cmd.getCommandEnum();
        CommandExecutable exe = ct.getMethod();
        return exe.getZoo(zoo, cmd);
    }
}