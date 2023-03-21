package terminal;

import java.util.Scanner;

import terminal.executable.CommandExecutable;
import terminal.executable.CommandExecutableFactory;
import terminal.messages.ErrorMessage;
import terminal.messages.InviteMessage;
import terminal.messages.ZooSummaryMessage;
import terminal.parsers.CommandParser;
import zoo.Zoo;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private Zoo zoo;

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    private CommandParser commandParser;

    private CommandExecutable commandExecutable;

    private TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }

    public static TerminalReader getTerminalReader(CommandParser commandParser) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }

    private void setCommandExecutable(Command command) {
        this.commandExecutable = new CommandExecutableFactory(zoo).create(command);
    }

    public void go() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            new ZooSummaryMessage(zoo).displayMessage();

            new InviteMessage().displayMessage();

            String input = scanner.nextLine();

            if (input.equals("exit"))
                break;

            if (inputChecker.checked(input)) {
                Command newCommand = this.commandParser.parseCommand(input);
                this.setCommandExecutable(newCommand);
                this.commandExecutable.execute();
            } else {
                new ErrorMessage().displayMessage();
            }
        }
        scanner.close();
    }

}