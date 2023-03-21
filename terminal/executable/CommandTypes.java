package terminal.executable;

import terminal.executable.create.CreateSnakeExecutable;
import terminal.executable.create.CreateWolfExecutable;
import terminal.executable.delete.DeleteSnakeExecutable;
import terminal.executable.delete.DeleteWolfExecutable;

public enum CommandTypes {
    WOLF_DELETE("wolfdelete", 2, new DeleteWolfExecutable()),
    WOLF_CREATE("wolfcreate", 6, new CreateWolfExecutable()),
    SNAKE_DELETE("snakedelete", 2, new DeleteSnakeExecutable()),
    SNAKE_CREATE("snakecreate", 6, new CreateSnakeExecutable()),
    ;

    private final String title;

    private final int args;

    private CommandExecutable method;

    CommandTypes(String wolfdelete, int i, CommandExecutable method) {
        this.title = wolfdelete;
        this.args = i;
        this.method = method;
    }

    public String getTitle() {
        return title;
    }

    public int getArgs() {
        return args;
    }

    public CommandExecutable getMethod() {
        return method;
    }

    public boolean checkType(String animal, String cmd){
        return title.equals(animal + cmd);
    }
}